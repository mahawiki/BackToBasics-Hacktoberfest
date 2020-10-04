<?php
$fp=fopen("abc.txt","r+");
if($fp==false)
{
	die("error in opening file<br/>");
}
else
{
	echo "file opened successfully<br/>";

	$data="**readplus**";
	$temp=fwrite($fp,$data);
	if($temp)
	{
		echo"data written to file...no of bytes written is ".$temp;
	}
	else
	{
		echo "unable to write data<br/>";
	}

	rewind($fp);	//setting file pointer to beginning of file. rewind(handle) returns true on success 

	$flength=filesize("abc.txt");
	$data=fread($fp,$flength);
	echo"<br>data from file is: <br/>".$data;

	fclose($fp);
	
}

?>