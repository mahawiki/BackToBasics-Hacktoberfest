
<html>
<body>
	<form action="#" method="post" enctype="multipart/form-data">
		File: <input type="file" name="file"><br/><br/>
		<input type="submit" name="submit"><br/><br/>
	</form>

<?php
if(isset($_FILES['file']))
{
	print_r($_FILES); echo "<br><br>";

	$file_name=$_FILES['file']['name'];
	$file_size=$_FILES['file']['size'];
	$file_type=$_FILES['file']['type'];
	$file_tmp=$_FILES['file']['tmp_name']; //temperary file full path

	$temp1=explode(".", $file_name);
	$temp2=end($temp1);  //moves the internal pointer of an array to point to last element and returns its value.
	$file_extension=strtolower($temp2);

	$extensions=array("jpeg","jpg","png");
	$errors;

	if(in_array( $file_extension, $extensions)===false) //1st=search, 2nd=array, searches an array for specific value returns true if value is found in the array
	{
		$errors="invalid file format ...valid extensions r jpg, jpeg, png<br/>";
	}

	if($file_size > 2000000) //2097152 =2MB
	{
		$errors="file size must be max 2000000<br>";
	}


	if(empty($errors)==true) //check a variable is empty or not returns false if var isnt empty
	{
		$temp3=move_uploaded_file($file_tmp, "images/".$file_name); //1st= file, 2nd=destination, moves uploaded file to new destination return true on success
		if($temp3)
			{echo "file uploaded successfully<br>";}
	}
	else
	{
		print_r($errors);
	}
}

?>
</body>
</html>
