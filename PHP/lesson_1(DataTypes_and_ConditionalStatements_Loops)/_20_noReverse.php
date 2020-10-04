<?php

$no=981;

$temp=$no;
$reverse=0;

	while($temp!=0)
	{
		$reverse=($reverse*10)+($temp%10);
		//echo "$reverse<br>";
		$temp=intval($temp/10);
	}
echo "reverse no is: $reverse";
?>