<?php

$length=5;  //imp6 fibonacci using function
$n1=0;
$n2=1;

echo "$n1    $n2   ";
for($i=3;$i<=$length;$i++)
{
	$n3=$n2+$n1;
	echo "$n3   ";
	$n1=$n2;
	$n2=$n3;
}

?>