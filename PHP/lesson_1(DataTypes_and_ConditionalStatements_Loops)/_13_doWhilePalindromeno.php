<?php
//palindrome no=reverse no
$no=121;

$temp=$no;
$new=0;

	do 
	{	
		$digit=$temp%10;       		#echo "$digit <br>";
		$new=($new*10)+$digit; 		#echo "$new <br>";
		$temp=intval($temp/10);		#returns float value so convert in int
	    echo "$temp<br>";
	} while ( $temp!=0);			#or while(floor($temp))

if($no==$new)
	echo "$new is palindrome";
else
	echo "$no is not palindrome";

?>