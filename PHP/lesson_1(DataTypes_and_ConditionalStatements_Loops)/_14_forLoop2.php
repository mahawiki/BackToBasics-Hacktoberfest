<?php

$rows=5;
for ($i=$rows; $i>0 ; $i--)  //rows
{ 
	for ($j=$rows; $j>=$i ; $j--) 
	{ 
		echo "$j";
	}
	echo "<br>";
}
?>