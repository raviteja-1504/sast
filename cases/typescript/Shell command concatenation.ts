// TrustLedger fixture TYPESCRIPT-003; expected=positive; category=command_injection
exec("tool " + String(req.query.arg));
