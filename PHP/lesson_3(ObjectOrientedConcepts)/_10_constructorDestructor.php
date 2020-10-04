<?php

class Demo
{
	var $name;
	var $age;
	function __construct($name,$age)
	{
		$this->name=$name;
		$this->age=$age;
	}

	function __destruct()
	{
		echo "<br>destructing ...".$this->name.", ".$this->age;
	}

}

$obj= new Demo("abc",20);

?>