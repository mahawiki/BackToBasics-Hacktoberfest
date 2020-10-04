<?php
//navigate file means to move file

$sourcefilename="moveSample.txt";
$destinationfilename="demo/moveSample.txt";

$temp=rename($sourcefilename, $destinationfilename);
if($temp)
{
	echo "file navigation successfully";
}
else
{
	echo "file navigation failed";
}

?>