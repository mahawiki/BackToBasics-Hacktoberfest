<?php
function swap($par1, $par2) //finalQ8
{
	$temp=$par1;
	$par1=$par2;
	$par2=$temp;
}

$n1=10;
$n2=20;
echo "before call....n1= $n1 and n2= $n2";
swap($n1,$n2);
echo "<br>after call.....n1= $n1 and n2=$n2";
?>