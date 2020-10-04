<?php
echo "1) associative within associative :-<br>";
$students=array("abc"=> array("m1"=>90, "m2"=>85, "m3"=>95),
				"xyz"=> array('m1'=>80, "m2"=>74, "m3"=>79)
				);
	
	foreach($students as $name=>$data)
	{
		echo "<br>$name= ";
		foreach($data as $sub=> $mark)
		{
			echo "<br>&nbsp; $sub: $mark";
		}
	}

echo "<br><br>print_r() output: <br>";
print_r($students);

echo "<br><br>var_dump() output: <br>";
var_dump($students);

	$students['xyz']['m3']=100;
	echo "<br><br>marks of abc of m1: ".$students["abc"]['m1']."  of m3: ".$students['xyz']['m3']."<br>";
?>

<?php
echo "<hr><br><br>2) associative within indexed :-<br>";
$students=array(array("m1"=>71, "m2"=>90),array("m1"=>92, "m2"=>87));
	foreach($students as $val)
	{
		foreach($val as $name=>$id)
		{
			echo "<br>$name: $id";
		}
		echo "<br>";
	}

	echo "<br><br>print_r() output: <br>";
	print_r($students);

	echo "<br><br>var_dump() output: <br>";
	var_dump($students);

	echo "<br><br>at 0th loc: ".$students[0]["m2"];
?>

<?php
echo "<hr><br><br>3) indexed within indexed :-<br>";
$students=array(array("m1", "m2"),array("c", "java"));
	foreach($students as $val)
	{
		foreach($val as $name)
		{
			echo "<br>$name";
		}
		echo "<br>";
	}

	echo "<br><br>print_r() output: <br>";
	print_r($students);

	echo "<br><br>var_dump() output: <br>";
	var_dump($students);

	echo "<br><br>".$students[0][1];
?>

<?php
echo "<hr><br><br>4) indexed within associative :-<br>";
$college=array("ifDept"=>array("m1", "m2"),"cmDept"=>array("c", "java"));
	foreach($college as $dept=>$val)
	{
		echo "<br>$dept=   ";
		foreach($val as $name)
		{
			echo "<br>&nbsp; $name";
		}
		echo "<br>";
	}

	echo "<br><br>print_r() output: <br>";
	print_r($college);

	echo "<br><br>var_dump() output: <br>";
	var_dump($college);

	echo "<br><br>".$college['cmDept'][1];
?>