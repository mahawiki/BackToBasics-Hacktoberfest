<?php
$fp=fopen("abc.txt","a");
if($fp==false)
{
	die("error in opening file<br/>");
}
else
{
	echo "file opened successfully<br/>";

	$data="\t**this is appended after previous data**";
	$temp=fwrite($fp,$data);
	if($temp)
	{
		echo"data written to file...no of chars appended is ".$temp;
	}
	else
	{
		echo "unable to append data<br/>";
	}

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