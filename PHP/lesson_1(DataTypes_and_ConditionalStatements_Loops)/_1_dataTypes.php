<?php

$var1= 10;
var_dump($var1); echo "...... $var1 <br>";
$var2=1000000000000100000001;
var_dump($var2); echo "...... $var2 <br><br>";

$var3=10.02;
var_dump($var3); echo "...... $var3 <br>";
$var4=10.000001000001001;
var_dump($var4); echo "...... $var4 <br><br>";

$var5=false;
var_dump($var5); echo "...... $var5 <br><br>";

$var6='p';
var_dump($var6); echo "...... $var6 <br>";
$var7="program"; 
var_dump($var7); echo "...... $var7 <br>";
$var8="89";
var_dump($var8); echo "...... $var8 <br><br>";

$var9=null;
var_dump($var9); echo "...... $var9 <br>";
$var10=" ";
var_dump($var10); echo "...... $var10 <br>";
$var11="";
var_dump($var11); echo "...... $var11 <br>";
$var12="hi"; $var12=Null;
var_dump($var12); echo "...... $var12 <br>";
//$var0 not defined
var_dump($var0); echo "<br><br>";

$var13= array(10,20,30,40,50);
var_dump($var13); echo "......"; print_r($var13); echo "<br>";	#we cant print array using echo 

$var14= array('seeta', 'geeta', 'neeta', 'rita');
var_dump($var14); echo "......"; print_r($var14); echo "<br><br>";

class Demo
{
	function display()
	{
		echo "hi";
	}
}
$obj=new Demo();
var_dump($obj); echo "<br><br>";

$temp=fopen("file1.txt", "w");
var_dump($temp);
?>