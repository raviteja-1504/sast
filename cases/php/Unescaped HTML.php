<?php
// TrustLedger fixture PHP-006; expected=positive; category=xss
echo "<h1>" . $_GET['name'] . "</h1>";
