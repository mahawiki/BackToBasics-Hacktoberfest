<?php
#using __set(), __get(), __isset(), __unset() magic methods
class Demo
{
	private $data=array();
	public function __set($keyItem, $valueItem)
	{
		$this->data[$keyItem]=$valueItem;
	}
	public function __get($keyItem)
	{
		return "<br>setted: $keyItem=>".$this->data[$keyItem];		
	}
	public function __isset($keyItem)
	{
		echo "<br>isset: $keyItem: ";
		var_dump(isset($this->data[$keyItem]));		
	}
	public function __unset($keyItem)
	{
		echo "<br>unsetted: $keyItem=>".$this->data[$keyItem];	
		unset($this->data[$keyItem]);	
	}
}

$obj= new Demo();
$obj->riddhi=94;
echo $obj->riddhi;
isset($obj->riddhi);
unset($obj->riddhi);
isset($obj->riddhi);
?>