<?php

$no1=21;
$no2=5;

echo "<b>Arithmetic operators- </b><br>";

echo "Addition is:". ($no1+$no2);
$res=$no1-$no2;
echo "<br>Subtraction is: $res <br>";
$res=$no1*$no2;
echo "Multiplication is: $res <br>";
$res=$no1/$no2;
//$res=intval($no1/$no2);
echo "Division is: $res <br>";
$res=$no1%$no2;
echo "Modulus is: $res <br>";
$res=2**3;
echo "Exponentiation is: $res <br><br>";


echo "<b>Assignment operators-</b><br>";
$res=0;
echo "Assignment: $res<br>";
$no1+=$no2;
echo "Addition Assignment is: $no1 <br>";  $no1=21;
$no1-=$no2;
echo "Subtraction Assignment is: $no1 <br>";  $no1=21;
$no1*=$no2;
echo "Multiplication Assignment is: $no1 <br>";  $no1=21;
$no1/=$no2;
echo "Division Assignment is: $no1 <br>";  $no1=21;
$no1%=$no2;
echo "Modulus Assignment is: $no1 <br><br>";  $no1=21;


echo "<b>Increment & Decrement operators-</b><br>";
//$res= ++$no2;
echo "++5 =".(++$no2);  $no2=5;
$res= $no2++;
echo "<br>5++ = $res <br>";  $no2=5;
$res= --$no2;
echo "--5 = $res <br>";  $no2=5;
$res= $no2--;
echo "5-- = $res <br><br>";  

echo "<b>Comparison or Relational operators-</b><br>";
$no1=21; $no2=5;

echo "Less Than: "; var_dump($no1<$no2);
echo "<br>Less Than or Equal to: "; var_dump($no1<=$no2); 
echo "<br>Greater Than: "; var_dump($no1>$no2); 
echo "<br>Greater Than or Equal to: "; var_dump($no1>=$no2); 

	$res=$no1<=>$no2;
	echo "<br>Spaceship: $res ";	#introduced in PHP7
	$res=$no1<=>$no1;
	echo "<br>Spaceship: $res ";
	$res=$no2<=>$no1;
	echo "<br>Spaceship: $res ";

$no3="21";
echo "<br>Equal: "; var_dump($no1==$no3); 
$res=($no1===$no3);
echo "<br>Identical: "; var_dump($res); 
$res=($no1!=$no3);
echo "<br>Not equal: "; var_dump($res);
$res=($no1<>$no3);
echo "<br>Not equal: "; var_dump($res);
$res=($no1!==$no3);
echo "<br>Not identical: "; var_dump($res);
 echo "<br><br>";

echo "<b>Conditional or Ternary operator-</b><br>";
$res=($no1>$no2)?$no1:$no2 ;
echo "large no: $res <br><br>";
echo "<b>Null coalescing operator-</b><br>";
	$res=null;
	$res=$res??0 ;	#value of $res will be 0 if $res doesnt exist or is null
	echo "$res <br>";
	$resu=$resu??0 ;
	echo "$resu <br><br>";

echo "<b>Logical operator-</b><br>"; //finalQ4

echo "&& "; var_dump((true)&&(false));
$res= ($no1<$no2)AND($no1!=$no2);
echo "<br>AND "; var_dump($res); 

$res= ($no1>$no2)||($no1!=$no2);
echo "<br>|| "; var_dump($res);
$res= ($no1>$no2)OR($no1!=$no2);
echo "<br>OR "; var_dump($res);

$res= !($no1!=$no2);
echo "<br>! "; var_dump($res);

$res= ((10>5)XOR(5!=9));
echo "<br>XOR "; var_dump($res); echo "<br><br>";


$no1=5; #101  
$no2=2; #010
echo "<b>Bitwise operator-</b><br>";
$res= $no1 & $no2; #000
echo "& $res <br>";
$res= $no1 | $no2; #111
echo "| $res <br>";
$res= ~$no2; #stored: 1..101; retrieve: 1s compl+1=1..011
echo "~$res , ".(~3).", ".(~4).", ".(~5)."<br>";
$res= $no1<< $no2; #10100
echo "<< $res <br>";
$res= $no1 >> $no2; #001
echo ">> $res <br><br>";
#^ bitwise xor


echo "<b>String operator</b><br>";
$res=$no1.$no2;
echo "$res<br>";
$res.=$no1;
echo "$res<br><br>";

?>