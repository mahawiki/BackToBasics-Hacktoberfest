<?php

$no=array(10,20,30,40,50);
	echo "<br>".$no[0];
	echo "<br>".$no[1];
	echo "<br>".$no[2];
	echo "<br>".$no[3];
	echo "<br>".$no[4]."<br><br>";

echo "<br><br>print_r() output: <br>";
print_r($no);

echo "<br><br>var_dump() output: <br>";
var_dump($no);
echo "<br><br>";

$no[0]="ten";
$no[1]="twenty";
$no[2]=30.509;
	foreach($no as $val)
	{
		echo "<br>string value: $val........its type-";
		var_dump($val); 
	}
		
?>