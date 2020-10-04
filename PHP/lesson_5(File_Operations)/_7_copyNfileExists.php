<?php 
# for these programs at last after o/p or eg. write a line describing changes in directory where the program is
if(file_exists("file1.txt"))
{
	echo "source file exist..<br/>";

	$fcopy=copy("file1.txt", "demo/file2.txt");
	if($fcopy)
	{
		echo "file copied successfully..<br/>";
	}
	else
	{
		echo "file copying failed..<br/>";
	}
}
else
{
	echo "source file doesnt exist..<br/>";
}
?>