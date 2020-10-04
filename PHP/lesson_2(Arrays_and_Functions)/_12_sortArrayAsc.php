<?php
$arr=array(10,30,20,50,40);
$l=count($arr);

for($i=0;$i<=$l-1;$i++) //no of iterations=no count-1
{
	for($j=0;$j<=$l-2;$j++)
	{
		if($arr[$j]>$arr[$j+1])
		{
			$temp=$arr[$j];
			$arr[$j]=$arr[$j+1];
			$arr[$j+1]=$temp;
		}
	}
}
echo "<br>sorted array= ";
print_r($arr);

?>