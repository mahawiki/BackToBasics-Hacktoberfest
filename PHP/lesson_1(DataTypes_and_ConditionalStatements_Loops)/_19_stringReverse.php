<?php

$str="riddhi";
echo "original string is: $str";
	function reverseString($string1)
	{		 // get last index
		for ($i=strlen($string1)-1, $j=0; $i>$j ; $i--, $j++) 
		{ 
			$temp=$string1[$j];
			$string1[$j]=$string1[$i];
			$string1[$i]=$temp;
		}
		return $string1;
	}

$reverse=reverseString($str);
echo "<br>reverse string is: $reverse";

?>