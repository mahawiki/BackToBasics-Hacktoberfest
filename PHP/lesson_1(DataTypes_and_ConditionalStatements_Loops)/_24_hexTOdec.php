<?php 

$hexNo='B';  //11
	function hexadecimalToDecimal($hexVal)
	{
		$len=strlen($hexVal);
		$base=1; // bcoz 16^0=1
		$decVal=0;

		for($i= $len-1; $i>=0; $i--)
		{
			if($hexVal[$i] >='0' && $hexVal[$i]<='9')
			{
				$decVal+= ((int)$hexVal[$i])*$base; 
				$base*=16; //incrementing $base to multiply $hexval i.e. 16^2 etc
			}
			else if($hexVal[$i]>='A' && $hexVal[$i]<='F')
			{
				//ord() used to return ASCII value of character
				//as ASCII value of A is 65. so 65-55=10 which is decimal value of hexadecimal A
				$decVal+=(ord($hexVal[$i])-55)*$base;
				$base*=16; //incrementing $base to multiply $hexval i.e. 16^2 etc
			}
		}
		return $decVal;
	}

echo hexadecimalToDecimal($hexNo);

?>