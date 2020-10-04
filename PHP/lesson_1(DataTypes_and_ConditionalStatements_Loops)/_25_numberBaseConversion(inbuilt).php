<?php

	$res=base_convert(101, 2, 10);  //base_convert(number, frombase, tobase)
	echo "$res<br>";
	$res=base_convert(5, 10, 2);
	echo "$res<br>";
	$res=base_convert(10, 8, 10);
	echo "$res<br>";
	$res=base_convert('A', 16, 10);
	echo "$res<br><br>";

	echo hexdec('B');

	/*hexdec(hex_string)
	octdec(octal_string)
	bindec(binary_string)

	dechex(number)
	decoct(number)
	decbin(number)*/


?>