#The primary reason why SSL is used is to keep sensitive information sent across the Internet encrypted so that only the intended recipient can access it. This is important because the information you send on the Internet is passed from computer to computer to get to the destination server.

#Python don't allow us to access http sites because of these reasons so to access http sites here are some lines of code you can use it.( to access the sites with no ssl certificates ) 
# I would suggest to use it only for important reasons :) 


ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

