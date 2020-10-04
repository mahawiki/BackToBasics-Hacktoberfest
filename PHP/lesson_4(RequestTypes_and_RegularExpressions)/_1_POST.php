
<html>
<body>
	<form action="#" method="post">
		name:<input type="text" name="name"><br><br>
		<input type="submit" name="submit"><br><br>
	</form>
	
	<?php
	if(isset($_POST["submit"]))
	{
		$name=$_POST["name"];
		echo "name= $name";
	}
	?>
</body>
</html>

