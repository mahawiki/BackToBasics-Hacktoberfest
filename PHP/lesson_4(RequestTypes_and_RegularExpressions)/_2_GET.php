
<html>
<body>
	<form action="#" method="get">
		<br><label>name:</label>
		<input type="text" name="name"><br><br>
		<input type="submit" name="submit"><br><br>
	</form>
	
	<?php
	if(isset($_GET["submit"]))
	{
		$name=$_GET["name"];
		echo "name= $name";
	}
	?>
</body>
</html>

