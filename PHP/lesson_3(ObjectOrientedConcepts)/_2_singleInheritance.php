<?php
class Game
{
	var $name;
}

class Outdoor extends Game
{
	var $location;
 	function setValues($name,$location)
	{
		$this->name=$name;
		$this->location=$location;
	}

	function getValues()
	{
		echo "name=$this->name<br>";
		echo "location=$this->location<br>";
	}	
} 

$lawnTennis= new Outdoor();
$lawnTennis->setValues("lawnTennis","playground");
$lawnTennis->getValues();
?>