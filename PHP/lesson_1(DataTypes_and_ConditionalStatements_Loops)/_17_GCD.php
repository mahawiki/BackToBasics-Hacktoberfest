<?php
//GCD or GCM or HCF means largest no. that divides both no. 
//intersection of factors
$num1=3;
$num2=6;

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

$res= gcd($num1,$num2);
echo "gcd is: $res";

?>