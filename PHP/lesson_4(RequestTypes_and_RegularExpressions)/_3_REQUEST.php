
<html>
<body>
	<form action="#" method="post">
		<br><label>name:</label>
		<input type="text" name="name"><br><br>
		<input type="submit" name="submit"><br><br>
	</form>
	<form action="#" method="get">
		<br><label>name:</label>
		<input type="text" name="name"><br><br>
		<input type="submit" name="submit"><br><br>
	</form>
	
	<?php #in exam take anyone form only
	
	if(isset($_REQUEST["submit"]))
	{
		print_r($_REQUEST);
		$name=$_REQUEST["name"];
		echo "</br>name= $name";
	}

	?>
</body>
</html>