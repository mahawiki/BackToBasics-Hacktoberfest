<?php
class Game
{
	var $name;
	function setName($name)
	{
		$this->name=$name;
	}
}

class Outdoor extends Game
{
	var $location;
 	function setLocation($location)
	{
		$this->location=$location;
	}
} 

class TeamSports extends Outdoor
{
	var $noOfPlayers;
	function setNoOfPlayers($noOfPlayers)
	{
		$this->noOfPlayers=$noOfPlayers;
	}

	function getInfo()
	{
		echo "name=$this->name<br>";
		echo "location=$this->location<br>";
		echo "noOfPlayers=$this->noOfPlayers<br>";
	}
} 

$lawnTennis= new TeamSports();
$lawnTennis->setName("lawnTennis");
$lawnTennis->setLocation("ground");
$lawnTennis->setNoOfPlayers(2);
$lawnTennis->getInfo();
?>