<?php

#1.array()
echo "1)array()=<br>";
$colors=array("golden","white","orange");
print_r($colors); 

#2.array_change_key_case()
echo "<br><br>2)array_change_key_case()=<br>";
$teachers=array("abc"=>1, "xyz"=>2);
print_r($teachers);echo "<br>changed array:<br>";
print_r(array_change_key_case($teachers,CASE_UPPER));

#3.count()
echo "<br><br>3)count()=";
$teachers=array("abc"=>array("iom","c","jsp"), "xyz"=>array("ssw","php"));
echo "<br>".count($teachers);
echo "<br>".count($teachers,1);
echo "<br>".count($teachers["abc"]);

#4.array_merge()
echo "<br><br>4)array_merge()=<br>";
$flowers=array("lily","lotus","rose");
print_r(array_merge($colors,$flowers)); echo "<br>";
print_r(array_merge($colors,$teachers));

#5.array_search()
echo "<br><br>4)array_search()=<br>";
$no=array(1=>"a", "second"=>"b");
echo array_search("lily", $flowers);
echo "<br>".array_search("b", $no);
print_r( "<br>".array_search("php", $teachers["xyz"])  );

#6.array_replace()
echo "<br><br>4)array_replace()=<br>";
print_r(array_replace($flowers, $colors));

#7.array_reverse()
echo "<br><br>7)array_reverse()=<br>";
print_r(array_reverse($teachers)); echo "<br>";  //reverses outer array only in multidimensional array
print_r(array_reverse($colors)); 

#8.range()
echo "<br><br>8)range()=<br>";
$digits=range(0, 5);
print_r($digits); echo "<br>";
$digits=range(20,15);
print_r($digits); echo"<br>";
$digits=range(0,50,5); //step
print_r($digits);

#9.sort()
echo "<br><br>9)sort()=<br>";
$cars=array("odi","bmw","toyota");
sort($cars);
print_r($cars); echo"<br>";
$no=array(50,20,10,40,30);
sort($no);
print_r($no);

#10.rsort()
echo "<br><br>10)rsort()=<br>";
rsort($cars);
print_r($cars); echo"<br>";
rsort($no);
print_r($no);

echo "<br><br>11)ksort()=<br>";
$cars=array("odi"=>500,"bmw"=>600,"toyota"=>400);
ksort($cars);
print_r($cars);

echo "<br><br>12)krsort()=<br>";
$cars=array("odi"=>500,"bmw"=>600,"toyota"=>400);
krsort($cars);
print_r($cars);

echo "<br><br>13)reset()=<br>";
echo reset($flowers);
?>