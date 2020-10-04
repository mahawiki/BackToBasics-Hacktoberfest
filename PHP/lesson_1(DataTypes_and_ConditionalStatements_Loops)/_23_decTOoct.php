<?php

$decNo=8; //10
	function decToOct($decVal)
	{
		$octArray;
		$i=0;
		$temp=$decVal;
		while(intval($temp))
		{
			$octArray[$i]= $temp%8;
			$temp=(int) $temp/8;
			echo "$temp<br>";
			$i++;
		}

		//printing array in reverse
		for($j=count($octArray)-1; $j>=0; $j--)
		{
			echo $octArray[$j];
		}
	}

echo decToOct($decNo);
?>