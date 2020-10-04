<?php
$arr=array(10,20,30);
unset($arr[1]);
print_r($arr);
echo "<br><br>";
?>

<?php
//get shortest and largest string from array
$strArr=array("hello","hi","bye");
$strAssoc;
foreach($strArr as $str)
{
	$strAssoc[strlen($str)]=$str;
}
print_r($strAssoc);echo "<br>";
ksort($strAssoc);
print_r($strAssoc);echo "<br>";
$strt;
$i=0;
foreach ($strAssoc as $key => $value) 
{
	$strt[$i]=$value;
	$i++;
}
print_r($strt);
echo "<br>shortest string= ".$strt[0];
echo "<br>longest string= ".$strt[count($strt)-1];
?>