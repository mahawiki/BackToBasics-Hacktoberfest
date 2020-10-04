<?php

print "<form method=post action=#>";
for($i=0;$i<5;$i++)
{
print "<br>no: <input type=text name=txt$i>";
}
print "<br><input type=submit name=s>";
print "</form>";
$arr;
if(isset($_POST["s"]))
{
	for($i=0;$i<5;$i++)
	{
		$arr[$i]=$_POST["txt".$i];
	}
	print_r($arr);
}

?>

