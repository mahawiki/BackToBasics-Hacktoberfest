<?php

$fp=fopen("file1.txt","r");
if($fp==false)
{
	die("error in opening file");
}
else
{
	echo "file opened successfully<br>";

	//fgets()
	while(($data=fgets($fp))!=false)
	{
		echo "$data<br>";
	}
	rewind($fp);echo "<br><br>";

	//fgetc()
	while(($data=fgetc($fp))!=false)
	{
		echo "$data ";
	}
	echo "<br><br>";

	//file_get_contents()
	$data=file_get_contents("file1.txt");
	echo "$data ";
	echo "<br><br>";

	//readfile()
	$data=readfile("file1.txt");
	echo "$data ";
}

?>