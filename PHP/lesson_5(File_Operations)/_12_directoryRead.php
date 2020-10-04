<?php

$dir=opendir("newFolder2");
if(! $dir)
{
	echo "error in opening directory";
}
else
{
	echo "directory opened: $dir";
	while(($filename=readdir($dir))!==false)
	{
		echo "<br>".$filename;
	}

	$temp=closedir($dir);
	echo "$temp";
}
?>