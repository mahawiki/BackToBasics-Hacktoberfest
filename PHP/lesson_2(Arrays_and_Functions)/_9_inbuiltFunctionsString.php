<?php  //imp4

#1.strlen()
echo "1)strlen()<br>";
$str1="tit for tat";
echo strlen($str1);

#2.str_word_count()
echo "<br><br>2)str_word_count()<br>";
echo str_word_count($str1);

#3.strrev()
echo "<br><br>3)strrev()<br>";
echo strrev($str1);

#4.strpos()
echo "<br><br>4)strpos()<br>";
echo strpos($str1, "for"); //first character position in string is 0(not 1)

#5.str_replace()
echo "<br><br>5)str_replace()<br>";
echo str_replace("tat", "cat", $str1);

#6.echo() print() print_r()
echo "<br><br>6) echo() print() print_r()<br>";
$temp=null;
$str1="welcome";
$strArray=array("a1","a2");
echo "$str1"; echo "$temp<br>";
$temp=print ($str1); echo "....returned= $temp<br>";
$temp=printf($str1); echo "....returned= $temp<br>";
$temp=print_r($strArray); echo "....returned= $temp";

#7.implode()
echo "<br><br>7)implode()<br>";
$strArray=array("hello","eveyone","god","here","!");
echo implode(" ",$strArray);

#8.explode()
echo "<br><br>8)explode()<br>";
$str1="hello eveyone god here !";
print_r( explode(" ", $str1) );

#9.bin2hex()
echo "<br><br>9) bin2hex()<br>";
echo bin2hex("a");

#10.hex2bin()
echo "<br><br>10) hex2bin()<br>";
echo hex2bin("61");

echo "<br><br>11) strcmp()<br>";
$str1="abc";
$str2="abcd";
echo strcmp($str1, $str2);

echo "<br><br>12) strtolower()<br>";
$str="BYE";
echo strtolower($str);

echo "<br><br>13) strtoupper()<br>";
$str="bye";
echo strtoupper($str);

echo "<br><br>14) ltrim()<br>";
$str="BYE";
echo ltrim($str,"B");

echo "<br><br>15) rtrim()<br>";
$str="BYE";
echo rtrim($str,"E");

echo "<br><br>16) trim()<br>";
$str="BYE";
echo trim($str,"BE");

echo "<br><br>17) str_repeat()<br>";
$str="hi@";
echo str_repeat($str, 4);

?>