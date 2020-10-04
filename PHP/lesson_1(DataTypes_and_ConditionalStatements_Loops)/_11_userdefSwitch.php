<!DOCTYPE html>
<html>
<body>
	<form method="post">
		num1: <input type="text" name="n1"><br><br>
		num2: <input type="text" name="n2"><br><br>

		<input type="submit" name="confirm" value="add">
		<input type="submit" name="confirm" value="sub">
		<input type="submit" name="confirm" value="mult">
		<input type="submit" name="confirm" value="div">
		<input type="submit" name="confirm" value="mod">
	</form>
</body>
</html>

<?php
if(isset($_POST["confirm"]))
{
	$n1=$_POST["n1"];
	$n2=$_POST['n2'];
	$action=$_POST['confirm'];

echo $n1." ".$n2." ".$action."<br>";
	switch ($action) 
	{
		case "add": echo $n1+$n2;
					break;
		case 'sub': echo $n1-$n2;
					break;
		case 'mult': echo $n1*$n2;
					break;
		case 'div': echo $n1/$n2;
					break;
		case 'mod': echo $n1%$n2;
					break;
		default: echo "select proper button";
					break;
	}
}
?>