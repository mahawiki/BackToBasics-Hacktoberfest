<?php
class demo
{
	var $s;
	function smethod()
	{
		echo "<br>smethod";
	}
}

class demo1 extends demo
{
	var $n1;	//default access specifier is public 
	public $publicVar=10;
	protected $protectedVar=20;
	private $privateVar=30;

	function normalMethod()  //default access specifier is public 
	{
		echo "<br>normal function: ";
		$methodArray= get_class_methods("demo1"); 
		print_r($methodArray);
	}
	public function publicMethod()
	{
		echo "<br>publicMethod: ";
		$publicVarArray=get_class_vars("demo1"); 
		print_r($publicVarArray);
	}
	protected	function protectedMethod()
	{
		echo "<br>protectedMethod";
	}
	private	function privateMethod()
	{
		echo "<br>privateMethod";
	}

}

interface demo2
{
	function methodDeclaration(); //default access is public
}

echo "<br>1. class_exists(): ";
var_dump(class_exists("demo1")); //return true or false

echo "<br>2. get_class_methods(): ";
$methodArray= get_class_methods("demo1"); //indexed array of all methods accessible from where method called
print_r($methodArray);
$obj= new demo1();
$obj->normalMethod();

echo "<br>3. get_class_vars(): ";
$publicVarArray=get_class_vars("demo1"); //associative array of properties accessible
print_r($publicVarArray);
$obj->publicMethod();

echo "<br>4. get_class(): ";
echo get_class($obj);

echo "<br>5. interface_exists(): ";
var_dump(interface_exists("demo2"));

echo "<br>6. is_a(): sameClass=";
var_dump(is_a($obj, "demo1")); //is the given obj of this class or this as parent class
echo ";  superclass=";
var_dump(is_a($obj, "demo"));

echo "<br>7. method_exists(): ";
var_dump(method_exists($obj, "privateMethod")); //given method exist in this object
echo "; superclass=";
var_dump(method_exists($obj, "smethod"));

echo "<br>8. property_exists(): ";
var_dump(property_exists("demo1", "protectedVar"));
echo "; superclass=";
var_dump(property_exists("demo1", "s"));

?>