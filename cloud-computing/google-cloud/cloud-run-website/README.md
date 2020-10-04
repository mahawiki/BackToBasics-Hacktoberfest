# Cloud Run Website

## NOTE: This is not an officially supported Google product

## Introduction

This project is used by the Google Cloud Platform team to demonstrate different services within Google Cloud. This project contains two versions of the same application, one architected as a monolith and the other as a set of microservices. This helps them to demonstrate all the services using the same application.

Here we will be using it to deploy a website to Cloud Run. The frontend for the website is written as a React app, that can be deployed using containers running Node JS. It contains a shopping website, but feel free to customise it using the instructions here: [Modify the frontend](https://github.com/mahawiki/BackToBasics-Hacktoberfest/tree/main/cloud-computing/google-cloud/cloud-run-website#Modify-the-frontend). 

Cloud Run is a managed compute platform that can be used for deploying containerised applications quickly and securely. Google Cloud Platform takes care of the scaling and manageability of your application, and you only need to take care of the code. So let's get started. 

## Setup

All the steps need to be followed in Cloud Shell only. First we need to set the default zone and region for the project 

`gcloud config set compute/region us-central1`<br>
`gcloud config set compute/zone us-central1-a`

After that you can clone the files from this repository and run `setup.sh`
```
git clone https://github.com/mahawiki/BackToBasics-Hacktoberfest.git
cd BackToBasics-Hacktoberfest/cloud-computing/google-cloud/cloud-run-website
./setup.sh
```
This can take a while to run. You will see a success message when the script finishes running.

## Test your application

For testing the application, you can use Cloud Shell's built in development server. The following commands start the webserver on port 8080 of the Cloud Shell. You can view Cloud Shell on port 8080 to see the website. Remember that you are using a development server for running this application. Do not use it in a production environment.
```
cd monolith
npm start
```

You should see output similar to the following:
```
Monolith listening on port 8080!
```

## Creating the Docker container

You can use `docker` for creating the containers but then the process will take a long time. You will need to build the image, test it locally, then push it to Container Registry and then provide that as path for Cloud Run to pull from. That is why we are using Cloud Build instead for the same process.

Cloud Build will compress the files from the directory and move them to a Cloud Storage bucket. The build process will then take all the files from the bucket and use the Dockerfile, which is present in the same directory, to run the Docker build process. Since you specified the --tag flag with the host as gcr.io for the Docker image, the resulting Docker image will be pushed to Container Registry.

First run the following command to enable the Cloud Build API:
`gcloud services enable cloudbuild.googleapis.com`

After the API is enabled, run the following command to start the build process:
`gcloud builds submit --tag gcr.io/${GOOGLE_CLOUD_PROJECT}/monolith:1.0.0 .`

This process will take a few minutes, but after it is completed, there will be output in the terminal similar to the following:
```
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
ID                                    CREATE_TIME                DURATION  SOURCE                                                                                  IMAGES                              STATUS
1ae295d9-63cb-482c-959b-bc52e9644d53  2019-08-29T01:56:35+00:00  33S       gs://<PROJECT_ID>_cloudbuild/source/1567043793.94-abfd382011724422bf49af1558b894aa.tgz  gcr.io/<PROJECT_ID>/monolith:1.0.0  SUCCESS
```

You can also open Cloud Build to see more details about the container images you have created as well as observe the build in real time.

## Deploy container to Cloud Run
Now that we have containerised our application and pushed it to Container Registry, we can deploy it to Cloud Run.

There are two approaches for deploying to Cloud Run:

+ Managed Cloud Run: The Platform as a Service model where all container lifecycle is managed by the Cloud Run itself. You'll be using this approach.

+ Cloud Run on GKE: Cloud Run with an additional layer of control which allows you to bring your own clusters & pods from GKE.

First we need to enable the Cloud Run API. 
`gcloud services enable run.googleapis.com`

While deploying to Cloud Run, we need to choose the managed version of Cloud Run by specifying the tag `--platform managed`<br>
`gcloud run deploy --image=gcr.io/${GOOGLE_CLOUD_PROJECT}/monolith:1.0.0 --platform managed`

Accept the default suggested service name (it will be "monolith") by pressing **Enter**.

For this lab, allow unauthenticated requests into the application. Type "Y" when asked. You will also get the URL at which your application has been deployed when deployment finishes

## Verify the deployment
Verify that the deployment has been created successfully by running the following command
`gcloud run services list`

Type "1" when prompted to choose the platform managed version of Cloud Run. The output shows several things. You can see the deployment, as well as the user that deployed it (your email ID) and the URL you can use to access the app.

## Modify the frontend

The `react-app` folder contains a React application created from `create-react-app`. You can modify this frontend, but afterwards, you will need to build and move the static files to the monolith and microservices projects. You can do this by running the standard `create-react-app` build command below:

```
npm run build
```

This will run the build script to create the static files two times. The first will build with relative URLs and copy the static files to the monolith/public folder. The second run will build with the standard microservices URLs and copy the static files to the microservices/src/frontend/public folder.
