<?php

echo "1.preg_match():<br>";
$string="vi is awesome editor than vi";
$pattern="/\bvi\b/";
echo preg_match($pattern, $string,$match)."<br>";
print_r($match);

echo "<br><br>2.preg_match_all():<br>";
$string="vi is awesome editor than Vi";
$pattern="/\bvi\b/i";
echo(preg_match_all($pattern, $string,$match)."<br>");
print_r($match);

echo "<br><br>3.preg_replace():<br>";
$string="november 2020";
$pattern="/([0-9]+)/";
echo(preg_replace($pattern, "2040", $string));

echo "<br><br>4.preg_split():<br>";
$string="192.168.0.1";
$pattern="/\./";
print_r(preg_split($pattern, $string));

echo "<br><br>5.preg_grep():<br>";
$arrayList=array("pedha","ladoo","pappad");
$pattern="/^p+/"; // "/p(\w+)/"
print_r(preg_grep($pattern, $arrayList));

echo "<br><br>6.preg_quote():<br>";
$string="i have 5$ . \w * + -";
echo(preg_quote($string));

?>