<?php

$employee=Array("abc"=>1, "mno"=>2, "pqr"=>3);
	echo "<br>id is=".$employee["abc"];
	echo "<br>id is=".$employee["mno"];
	echo "<br>id is=".$employee["pqr"]."<br>";
		
echo "<br><br>print_r() output: <br>";
print_r($employee);

echo "<br><br>var_dump() output: <br>";
var_dump($employee);
echo "<br><br>";

$employee=array(4.2=>1, 5=>"hi", "pqr"=>10.90);
	$employee["abc"]="first";
	$employee["mno"]="second";
	$employee["lll"]="third";
		foreach ($employee as $key => $value) 
		{
			echo "<br>name and id=   $key: $value";
			//var_dump($key);var_dump($value);
		}

?>