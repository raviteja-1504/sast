<?php
// TrustLedger fixture PHP-008; expected=negative; category=sqli
echo "<p>" . htmlspecialchars($_GET['name'], ENT_QUOTES, 'UTF-8') . "</p>";
