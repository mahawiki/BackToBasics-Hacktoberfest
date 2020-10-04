<?php

$octNo=10; //8
	function octalToDecimal($octVal)
	{
		$decVal=0;
		$base=1; //8^0=1
		$temp=$octVal;

		while($temp)
		{
			$decVal+=($temp%10)*$base;
			$temp=(int)$temp/10;
			$base*=8;
		}
	return $decVal;
	}

echo octalToDecimal($octNo);
?>