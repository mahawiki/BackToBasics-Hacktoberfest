<?php
#using class and trait
class A
{
	public function showA() //show()
	{
		echo "i am in A<br>";
	}
}

trait B
{
	public function showB() //show()
	{
		echo "i am in B<br>";
	}
}
class C extends A
{
	use B;
	public function showC()
	{
		echo "i am in C<br>";
	}
}

$obj= new C();
$obj->showA(); //show()= traits method will be called
$obj->showB();
$obj->showC();
?>

<?php
#using traits
trait A1
{
	public function showA() //show()
	{
		echo "<br>i am in A1<br>";
	}
}

trait B1
{
	public function showB()//show()
	{
		echo "i am in B1<br>";
	}
}

class C1
{
	use A1;
	use B1;
	public function showC()
	{
		echo "i am in C1<br>";
	}
}

$obj= new C1();
$obj->showA(); //show()= error
$obj->showB();
$obj->showC();
?>

<?php
#using class and interface
class A2
{
	public function showA()
	{
		echo "<br>i am in A2<br>";
	}
}

interface B2
{
	public function showB();
}
class C2 extends A2 implements B2
{
	public function showB()
	{
		echo "i am in B2<br>";
	}
	public function showC()
	{
		echo "i am in C2<br>";
	}
}

$obj= new C2();
$obj->showA();
$obj->showB();
$obj->showC();
?>

<?php
#using interfaces
interface A3
{
	public function showA();
}

interface B3
{
	public function showB();
}
class C3 implements A3,B3
{

	public function showA()
	{
		echo "<br>i am in A3<br>";
	}
	public function showB()
	{
		echo "i am in B3<br>";
	}
	public function showC()
	{
		echo "i am in C3<br>";
	}
}

$obj= new C3();
$obj->showA();
$obj->showB();
$obj->showC();
?>