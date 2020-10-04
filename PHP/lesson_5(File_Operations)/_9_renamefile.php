<?php

$oldname="rename1.txt";
$newname="rename2.txt";

if(file_exists($newname))
{
	echo "error cannot rename file...file with the name aldready exists<br/>";
}
else
{
	$temp=rename($oldname, $newname); //finalQ12
	if($temp)
	{
		echo "file renamed successfully";
	}
	else
	{
		echo "file renaming failed";
	}
}
?>