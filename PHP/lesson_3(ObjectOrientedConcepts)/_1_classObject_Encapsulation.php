<?php
class mobile
{	#variables and methods are encapsulated within class
	
	var $brand; //var $variable or public $variable
	var $name;
	var $price;

	function setValues($brand,$name,$price)
	{
		$this->brand=$brand;
		$this->name=$name;
		$this->price=$price;
	}

	function getValues()
	{
		echo "brand=$this->brand, name=$this->name, price=$this->price<br>";
	}
}

$model=new mobile(); //$obj=new classname
$model->setValues("samsung","s10",45000);
$model->getValues();
?> 