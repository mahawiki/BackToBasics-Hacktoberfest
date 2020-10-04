<?php
class superClass //finalQ3
{  
	public $publicVar=10; 
	#abstraction achieved using access specifiers
	protected $protectedVar=20;
	private $privateVar=30;

	public function publicMethod()
	{
		echo "<br>publicMethod<br>";
	}
	protected function protectedMethod()
	{
		echo "protectedMethod<br>";
	}
	private	function privateMethod()
	{
		echo "privateMethod<br>";
	}

	function getValues1()
	{
		echo "in super....<br>";
		echo "publicVar=$this->publicVar<br>";
		echo "protectedVar=$this->protectedVar<br>";
		echo "privateVar=$this->privateVar<br>";

		$this->publicMethod();
		$this->protectedMethod();
		$this->privateMethod();
	}	
}

class SubClass extends superClass
{
	function getValues2()
	{
		echo "<br>in sub....<br>";
		echo "publicVar=$this->publicVar<br>";
		echo "protectedVar=$this->protectedVar<br>";
		//echo "privateVar=$this->privateVar<br>";

		$this->publicMethod();
		$this->protectedMethod();
		//$this->privateMethod();
	}
}

$obj= new SubClass();
$obj->getValues1();
$obj->getValues2();

echo "<br>outside function:";
echo "publicVar= ".$obj->publicVar."<br>";
//echo "<br>outside function: ".$obj->protectedVar."<br>";
//echo "<br>outside function: ".$obj->privateVar."<br>";

$obj->publicMethod();
//$obj->protectedMethod();
//$obj->privateMethod();
?>