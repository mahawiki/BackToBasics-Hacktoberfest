<?php

$temp=unlink("demo/file2.txt");  //finalQ12
if($temp)
{
	echo "file deleted successfully<br/>";
}
else
{
	echo "file deleting failed";
}
?>