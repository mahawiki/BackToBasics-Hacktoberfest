
<html>
<body>  <!--imp9 data validation eg.-->
	<form action="#" method="post">
		fname:	<input type="text" name="fname"><br><br>

		lname:	<input type="text" name="lname"><br><br>

		email:	<input type="text" name="email"><br><br>

		username:	<input type="text" name="username"><br><br>

		password:	<input type="password" name="password"><br><br>
	
confirm password:	<input type="password" name="cpassword"><br><br>

		<input type="submit" name="submit"><br><br>
	</form>

	<?php
		if(isset($_POST["submit"]))
		{
			$fname= $_POST["fname"];
			$lname= $_POST["lname"];
			$email= $_POST["email"];
			$username= $_POST["username"];
			$password= $_POST["password"];
			$cpassword= $_POST["cpassword"];

			$flag=0;
				if(! preg_match("/^[a-zA-Z]+$/", $fname ))
				{
					echo "<br>fname must contain alphabets only: $fname<br>";
					$flag=1;
				}
				elseif(! preg_match("/^[a-zA-Z]+$/", $lname ))
				{
					echo "<br>lname must contain alphabets only: $lname<br>";
					$flag=1;
				}
				elseif(! preg_match("/^[a-zA-Z]+[0-9]*@[a-z]+\.com$/", $email ))
				{
					echo "<br>email must start with alphabet should contain @, .com and can have number before @: $email<br>";
					$flag=1;
				}
				elseif(! preg_match("/^[a-zA-Z]+[0-9]*/", $username ))
				{
					echo "<br>username must start with alphabets and may also contain no. but cant include special symbols: $username<br>";
					$flag=1;
				}
				elseif( $password==$cpassword)
				{
					if(! preg_match("/.{8}/", $password ))
					{
						echo "<br>password should be of length 8: $password<br>";
						$flag=1;
					}
				}
				elseif( $password!=$cpassword)
				{
					echo "<br>password and confirm password must match: $password != $cpassword";
					$flag=1;
				}
				else
				{
					echo "<br>unknown error<br>";
				}

				if($flag==0)
				{
					echo "<br> data submitted...<br>";
					print_r($_POST);
				}
			
		}
	?>

</body>
</html>