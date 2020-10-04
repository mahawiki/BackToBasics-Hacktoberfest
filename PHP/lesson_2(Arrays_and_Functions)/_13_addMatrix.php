<?php
$m1=[
		[1,2],
		[2,1]
	];

print_r($m1);

$m2=array(
		array(1,2),
		array(2,1)
	);
echo "<br>";
print_r($m2);

$m3;
for($r=0;$r<2;$r++)
{
	for($c=0;$c<2;$c++)
	{
		$m3[$r][$c]=$m1[$r][$c]+$m2[$r][$c];
	}
}
echo "<br><br>addition matrix:<br>";
foreach ($m3 as $r) 
{
	foreach($r as $c)
	{
		echo " $c";
	}
	echo "<br>";
}

//multiplication

$m3;
for($r=0;$r<2;$r++) //no of rows
{
	for($c=0;$c<2;$c++)//no of columns
	{
		$m3[$r][$c]=0;
		for($k=0;$k<2;$k++)//no of rows
		{
		$m3[$r][$c]+=$m1[$r][$k]*$m2[$k][$c];
		}
	}
}
echo "<br><br>multiplication matrix:<br>";
foreach($m3 as $r)
{
	foreach($r as $c)
	{
		echo " $c";
	}
	echo "<br>";
}


?>