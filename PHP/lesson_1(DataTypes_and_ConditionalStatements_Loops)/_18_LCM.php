<?php
//LCM smallest no. which can be divided by both no.
//LCM(a,b)= (a*b) / GCD(a,b)
//union of factors
$num1=6;
$num2=3;

	function gcd($n1,$n2)
	{
		if($n1==0)
			return $n2;
		if($n2==0)
			return $n1;
		if($n1==$n2)
			return $n1;

		if($n1>$n2)
			return gcd($n1-$n2, $n2);

		return gcd($n1, $n2-$n1);
	}

	function lcm($n1,$n2)
	{
		return ($n1*$n2)/gcd($n1,$n2);
	}

$res=lcm($num1,$num2);
echo "lcm is: $res";
?>