<?php

	//$putdata = fopen("images/demo1.txt", "r"); 
	 #in exam write program in notes
	$putdata = fopen("php://input", "r");
	//$fp = fopen("images/demo2.txt", "w");
	$fp = fopen("myputfile.ext", "w");

	while ($data = fread($putdata, 1024))
	{
		fwrite($fp, $data);
	}
 
	echo "data uploaded successfully using PUT";

	fclose($fp);
	fclose($putdata);

?>