<?php
// converting to string

echo "<br>1.converting to string<br><br>";
$no=40.5;
$str=strval($no);
echo "strval()= $str: ".gettype($str);

$str1=(string)$no;
echo "<br>typecasting= $str1: ".gettype($str1);

//converting from string

echo "<br><br>1.converting from string<br><br>";
$str="56.9";
$no1=number_format($str);
echo "$no1 number_format()= $no1: ".gettype($no1);
$no1=number_format($str,2);
echo "<br>$no1 number_format()= $no1: ".gettype($no1);

$no2=(int)$str;
echo "<br>typecasting int= $no2: ".gettype($no2);
$no3=(float)$str;
echo "<br>typecasting float= $no3: ".gettype($no3);
$no4=(double)$str;
echo "<br>typecasting double= $no4: ".gettype($no4);

$no5=intval($str);
echo "<br>intval()= $no5: ".gettype($no5);
$no5=floatval($str);
echo "<br>floatval()= $no5: ".gettype($no5);

$no6=$str+0;
echo "<br>+0= $no6: ".gettype($no6);

//formatting text string

echo "<br><br>3.formatting text string<br><br>";
$no=12.45;
$txt=sprintf("formatted is: %b", $no);//binary
echo "$txt<br>";
$txt=sprintf("formatted is: %f", $no);
echo "$txt<br>";
$txt=sprintf("formatted is: %o", $no); //octal
echo "$txt<br>";
$txt=sprintf("formatted is: %s", $no);
echo "$txt<br>";
$txt=sprintf("formatted is: %u", $no);
echo "$txt<br>";
$txt=sprintf("formatted is: %d", $no);
echo "$txt<br>";
?>