<?php

$binNo=101; //5
	function binaryToDecimal($binVal)
	{
		$decVal=0;
		$base=1; //2^0=1
		$temp=$binVal;

		while($temp)
		{
			$decVal+=($temp%10)*$base;
			$temp=(int)$temp/10;
			$base*=2;
		}
	return $decVal;
	}

echo binaryToDecimal($binNo);
?>