<?php
$fp=fopen("abc.txt","w+");  //finalQ11
if($fp==false)
{
	die("error in opening file<br/>");
}
else
{
	echo "file opened successfully<br/>";

	$data="**writeplus**";
	$temp=fwrite($fp,$data);
	if($temp)
	{
		echo"data written to file...no of chars written is ".$temp;
	}
	else
	{
		echo "unable to write data<br/>";
	}

	rewind($fp);	//setting file pointer to 0th position 

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