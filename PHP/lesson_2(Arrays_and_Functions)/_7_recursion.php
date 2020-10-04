<?php
#factorial
$no1=5;  //imp5

echo "factorial $no1 is: ".facto($no1);

function facto($no)
{
	if($no<2)
	{
		return 1;
    }
    else
    {
    	return $no*facto($no-1);
    }
}

?>


<?php
#fibonacci
$limit=6;

echo "<br>fibonacci series is: ";

for($i=0;$i<$limit;$i++)
{
	echo " ".fibo($i);
}

function fibo($no)
{
	if($no==0)
		return 0;
	elseif($no==1)
		return 1;
	else
		return fibo($no-1)+fibo($no-2);
}

?>