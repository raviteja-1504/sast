<?php
// TrustLedger fixture PHP-005; expected=positive; category=ssrf
$ch = curl_init($_GET['url']);
curl_exec($ch);
