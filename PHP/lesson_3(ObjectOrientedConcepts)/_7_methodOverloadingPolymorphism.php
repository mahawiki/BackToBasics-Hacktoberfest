<?php
#using __call() magic method , which is triggered when invoking overloaded methods in object context
class Demo
{
	public function __call($name_of_function, $argument_array)
	{
		$n= count($argument_array);
		switch($n)
		{
			case 2: echo "<br>addition of 2 no is: ".($argument_array[0]+$argument_array[1]);
					break;
			case 3: echo "<br>addition of 3 no is: ".($argument_array[0]+$argument_array[1]+$argument_array[2]);
					break;
		}
	}
#using __callStatic() magic method,which is triggered when invoking overloaded methods in static context
	public static function __callStatic($name_of_function, $argument_array)
	{
		$n= count($argument_array);
		switch($n)
		{
			case 2: echo "<br><br>addition of 2 no is: ".($argument_array[0]+$argument_array[1]);
					break;
			case 3: echo "<br>addition of 3 no is: ".($argument_array[0]+$argument_array[1]+$argument_array[2]);
					break;
		}
	}
}

$obj= new Demo();
$obj->sum(10,20);
$obj->sum(10,20,30);


Demo::sum1(10,20);
Demo::sum1(10,20,30);
?>

