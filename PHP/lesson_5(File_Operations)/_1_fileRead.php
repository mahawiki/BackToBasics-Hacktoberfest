<?php
$fp=fopen("abc.txt","r"); //finalQ6
if($fp==false)
{
	die("error in opening file<br/>"); //prints a message and terminates current script. It is an alias (i.e. same as) of exit(msg)
	echo "hi";
}
else
{
	echo "file opened successfully<br/>";
	
	$flength=filesize("abc.txt");
	$data=fread($fp,$flength);
	echo"data from file is: <br/>".$data;

	$close=fclose($fp);
	if($close)
	{
		echo "<br/>file closed successfully";
	}
	else
	{
		echo "<br/>error in closing file";
	}
}

?>