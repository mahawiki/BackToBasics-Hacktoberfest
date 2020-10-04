<?php

$row=3;
for ($i=1; $i<=3 ; $i++)  //rows
{ 
	for($j=1 ; $j<=$i ; $j++)  //* to print=no of row
	{
		echo "*";
	}
	echo "<br>";
}

for($i=2;$i>=1;$i--)  //rows
{
	for($j=$i;$j>=1;$j--)
	{
		echo "*";
	}
	echo "<br>";
}

?>
