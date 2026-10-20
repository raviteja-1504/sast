<?php
// TrustLedger fixture PHP-003; expected=positive; category=command_injection
shell_exec("tool " . $_GET['arg']);
