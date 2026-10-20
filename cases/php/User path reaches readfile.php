<?php
// TrustLedger fixture PHP-004; expected=positive; category=path_traversal
readfile("/srv/files/" . $_GET['file']);
