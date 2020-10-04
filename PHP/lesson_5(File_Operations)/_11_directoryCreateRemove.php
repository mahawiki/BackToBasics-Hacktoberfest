<?php
//create
$temp=mkdir("newFolder1",0777);
if($temp)
{
	echo "directory created successfully: ".$temp;
}
else
{
	echo "directory creation failed";
}

?>

<?php
//remove

// $temp=rmdir("newFolder1");
// echo "<br>$temp";

?>