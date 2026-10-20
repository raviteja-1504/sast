<?php
// TrustLedger fixture PHP-001; expected=positive; category=sqli
$id = $_GET['id'];
$sql = "SELECT * FROM users WHERE id='" . $id . "'";
mysqli_query($conn, $sql);
