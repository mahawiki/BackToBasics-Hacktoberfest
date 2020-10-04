<?php

echo "1)__LINE__: ".__LINE__;

echo "<br><br>2)__FILE__: ".__FILE__;

echo "<br><br>3)__DIR__: ".__DIR__;

class Demo
{
	function f1()
	{
	echo "<br><br>4)__FUNCTION__: ".__FUNCTION__;

	echo "<br><br>5)__METHOD__: ".__METHOD__;

	echo "<br><br>6)__CLASS__: ".__CLASS__;
	}
}

function rough()
{
	echo "<br><br>4)__FUNCTION__: ".__FUNCTION__;

	echo "<br><br>5)__METHOD__: ".__METHOD__;
}

$obj=new Demo();
$obj->f1();
rough();

echo "<br><br>7)PHP_VERSION: ".PHP_VERSION;

echo "<br><br>8)PHP_INT_MIN: ".PHP_INT_MIN;

echo "<br><br>8)PHP_INT_MAX: ".PHP_INT_MAX;
?>