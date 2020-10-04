<?php
$no=9;
#exception if i/p= 2 or 1 then wrong ans
var_dump(  ($no%2!=0)? (($no%3!=0 && $no%5!=0 && $no%7!=0)?"no is prime": "no is composite") :"no is composite");
?>