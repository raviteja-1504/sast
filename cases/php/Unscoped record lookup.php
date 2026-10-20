<?php
// TrustLedger fixture PHP-009; expected=positive; category=authz_bola
$record = $db->findRecord($_GET['id']); echo json_encode($record);
