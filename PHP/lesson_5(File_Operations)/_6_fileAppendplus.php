<?php
$fp=fopen("abc.txt","a+");
if($fp==false)
{
	die("error in opening file<br/>");
}
else
{
	echo "file opened successfully<br/>";

	$data="**appendplus**";
	$temp=fwrite($fp,$data);
	if($temp)
	{
		echo"data written to file...no of chars appended is ".$temp;
	}
	else
	{
		echo "unable to append data<br/>";
	}

	rewind($fp);

	$flength=filesize("abc.txt");
	$data=fread($fp,$flength);
	echo"<br/>data from file is: <br/>".$data;

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