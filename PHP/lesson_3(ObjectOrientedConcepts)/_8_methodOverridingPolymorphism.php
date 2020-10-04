<?php
#method and property overriding
class Human  //finalQ7 polymorphism
{
	public $age=120;
	public function show()
	{
		echo "<br>I am Human..my age is $this->age";
	}
}

class Child extends Human
{
	public $age=4;
	public function show()
	{
		echo "<br>I am Child..my age is $this->age";
	}
}

$obj= new Human();
$obj->show();
$obj= new Child();
$obj->show();

?>