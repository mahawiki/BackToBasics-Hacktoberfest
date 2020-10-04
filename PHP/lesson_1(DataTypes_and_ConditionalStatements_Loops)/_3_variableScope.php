<?php
$n1=100; //global
function myFunction()
{
	global $n1;
	$n2=200;
	static $n3=300;
	echo "inside: n1=$n1  n2=$n2  n3=$n3<br>";
	$n3++;
}
myFunction();
myFunction();
echo "outside: n1=$n1<br>";
echo "outside: n2=$n2<br>"; //chya aadhi error
echo "outside: n3=$n3<br>"; //chya aadhi error
?>
