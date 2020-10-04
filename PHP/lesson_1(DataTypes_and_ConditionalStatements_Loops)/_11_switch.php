<?php
$no=50;

switch ($no%2) 
	{
		case 0: echo "$no is even";
					break;
		case 1: echo "$no is odd";
					break;
		default: echo "invalid";
					break;
	}
?>