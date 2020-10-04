<?php

$con=mysqli_connect("localhost","root",""); 
//to create database later dont specify DB. //finalQ10
//$con=mysqli_connect("localhost","root","","phpPractice");

if(! $con)
{
	die("connection failed: ".mysqli_connect_error());
}
else
{
	echo "connection successful:<br>";

	$query="create database phpPractice";
	$temp=mysqli_query($con, $query);
	if($temp)
	{ echo "database created $temp<br>"; }
	else
	{  echo "database creation failed $temp<br>";  }
	

	$temp=mysqli_select_db($con,"phpPractice");
	echo "selected db: $temp<br>";

	$query="create table student(sid int(6) primary key auto_increment,sname varchar(255))";
	$temp=mysqli_query($con,$query);
	if($temp)
	{ echo "table created $temp<br>"; }
	else
	{  echo "table creation failed $temp<br>";  }

	
	$query="insert into student values('','abc'),('','xyz')";
	$temp=mysqli_query($con,$query);
	if($temp)
	{ echo "inserted successfully $temp<br>"; }
	else
	{  echo "insertion failed $temp<br>";  }


	$query="select * from student";
	//$query="select sname from student where sid=1 and sname='abc'";
	$data=mysqli_query($con, $query);
	print_r($data); echo "<br>";
	if(mysqli_num_rows($data)>0)
	{ 
		while($row=mysqli_fetch_assoc($data))  //retrieve each row  //mysqli_fetch_array($data) ,mysqli_fetch_row($data)
		{	print_r($row);
			echo "<br>sid=".$row["sid"].", sname=".$row["sname"];
			// foreach($row as $key=>$value) //retrieve each column value
			// {
			// 	echo $key.":".$value."<br>";
			// }
			echo "<br>";
		}
	}
	else
	{  echo "select query failed $temp<br>";  }


	$query="update student set sname='xxxx' where sid='1'";
	$temp=mysqli_query($con,$query);
	if($temp)
	{ echo "updated successfully $temp<br>"; }
	else
	{  echo "updation failed $temp<br>";  }


	$query="delete from student where sname='xxxx'";
	$temp=mysqli_query($con,$query);
	if($temp)
	{ echo "deleted successfully $temp<br>"; }
	else
	{  echo "deletion failed $temp<br>";  }


	$query="drop table student";
	$temp=mysqli_query($con, $query);
	if($temp)
	{ echo "table deleted $temp<br>"; }
	else
	{  echo "table deletion failed $temp<br>";  }

	
	$query="drop database phpPractice";
	$temp=mysqli_query($con, $query);
	if($temp)
	{ echo "database deleted $temp<br>"; }
	else
	{  echo "database deletion failed $temp<br>";  }

	mysqli_close($con);  //finalQ10
}



?>