<?php
class Human
{
	var $name;
}
class Child extends Human
{
	var $education;
	function setValues($name,$education)
	{
		$this->name=$name;
		$this->education=$education;
	}

	function getValues()
	{
		echo "Child: name=$this->name, education=$this->education<br>";
	}
}
class Adult extends Human
{
	var $salary;
	function setValues($name,$salary)
	{
		$this->name=$name;
		$this->salary=$salary;
	}

	function getValues()
	{
		echo "Adult: name=$this->name, salary=$this->salary<br>";
	}
}
	
$abc= new Child();
$abc->setValues("abc",4);
$abc->getValues();

$xyz= new Adult();
$xyz->setValues("xyz",22000000);
$xyz->getValues();
?>