<?php

$marks=90; 

if($marks>=90 && $marks<=100)
{
	echo "grade-A";
}
elseif($marks>=80 && $marks<90)
{
	echo "grade-B";
}
elseif($marks>=70 && $marks<80)
{
	echo "grade-C";
}
else
{
	echo "grade-D";
}
?>