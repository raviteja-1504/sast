<?php
// TrustLedger fixture PHP-002; expected=negative; category=sqli
$stmt = $pdo->prepare("SELECT * FROM users WHERE id = ?");
$stmt->execute([$_GET['id']]);
