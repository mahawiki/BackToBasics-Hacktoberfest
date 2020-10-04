<?php

$decNo=5; //101

echo decimalToBinary($decNo);

	function decimalToBinary($decVal)
	{
		$binArray;
		$i=0;
		$temp=$decVal;
		while(intval($temp))
		{
			$binArray[$i]= $temp%2;
			$temp=(int) $temp/2;
			$i++;
		}

		//printing array in reverse
		for($j=count($binArray)-1; $j>=0; $j--)
		{
			echo $binArray[$j];
		}
	}


?>