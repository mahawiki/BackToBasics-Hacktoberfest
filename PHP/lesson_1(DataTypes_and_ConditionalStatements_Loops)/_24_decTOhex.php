<?php

$decNo=10; //A
	function decimalToHexadecimal($decVal)
	{
		$hexArray;
		$i=0;
		$temp=$decVal;

		while($temp)
		{
			$digit=$temp% 16;
			if($digit<10)
			{
				//chr() converts ASCII into character
				//ASCii value of 0 is 48
				$hexArray[$i]=$digit; //or  chr($temp+48);
				$i++;
				$temp= intval($temp/16);
			}
			else
			{
				//chr() converts ASCII into character
				//dec value of hex. A is 10 and ASCii value of A =10+55 
				$hexArray[$i]=chr($digit+55);
				$i++;
				$temp= intval($temp/16);
			}
		}

		//printing array in reverse
		for($j=$i-1; $j>=0; $j--)
		{
			echo $hexArray[$j];
		}
	}

echo decimalToHexadecimal($decNo);

?>