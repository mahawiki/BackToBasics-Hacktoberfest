<?php

$con=odbc_connect("phpdsn","", "");
if(! $con)
{
	die("connection failed");
}
else
{
	echo "connection established";

	$query="select * from employee";
	$data=odbc_exec($con, $query);//returns result identifier
	while(odbc_fetch_row($data)) //returns TRUE if row is fetched
	{
		echo "<br>id= ".odbc_result($data,"eid");
		echo ", name= ".odbc_result($data,"ename");
		echo ", mobno= ".odbc_result($data,"mobno");
		echo ", salary= ".odbc_result($data,"salary");
	}

	$query="insert into employee values(10,'emp10',98764609,800)";
	$temp=odbc_exec($con, $query);
	if($temp)
	{
		echo "<br>inserted...$temp";
	}
	else
	{
		echo "<br>unable to insert...";
	}

	$query="update employee set ename='god' where eid=1";
	$temp=odbc_exec($con, $query);
	if($temp)
	{
		echo "<br>updated...$temp";
	}
	else
	{
		echo "<br>unable to updated...";
	}

	$query="delete from employee where eid=2 and ename='emp2'";
	$temp=odbc_exec($con, $query);
	if($temp)
	{
		echo "<br>deleted...$temp";
	}
	else
	{
		echo "<br>unable to deleted...";
	}

	//we cant create or drop database
	
	$query="create table rough(id int)";
	$temp=odbc_exec($con, $query);
	if($temp)
	{
		echo "<br>created...$temp";
	}
	else
	{
		echo "<br>unable to create...";
	}

	$query="drop table rough";
	$temp=odbc_exec($con, $query);
	if($temp)
	{
		echo "<br>deleted...$temp";
	}
	else
	{
		echo "<br>unable to delete...";
	}

}
//see steps document for output
?>