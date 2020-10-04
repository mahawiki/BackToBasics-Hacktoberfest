<?php
//armstrong no 407=(4*4*4)+(0*0*0)+(7*7*7)
$no=407;

$sum=0;
$temp=$no;
while($temp!=0)
{
	$digit=$temp%10;
	$sum+=($digit*$digit*$digit);
	$temp=intval($temp/10);
	echo "$temp<br>";
}

if($no==$sum)
{
	echo "$no is armstrong no";
}
else
{
	echo "$no is not armstrong no";
}
?>