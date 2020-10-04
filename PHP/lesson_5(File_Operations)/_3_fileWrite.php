<?php
$fp=fopen("abc.txt","w"); //finalQ6
if($fp==false)
{
	die("error in opening file<br/>");
}
else
{
	echo "file opened successfully<br/>";

	$data="**this is written after truncating the file**";
	$temp=fwrite($fp,$data);
	if($temp)
	{
		echo"data written to file...no of chars written is ".$temp;
	}
	else
	{
		echo "unable to write data<br/>";
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