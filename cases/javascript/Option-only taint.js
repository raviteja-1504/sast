// TrustLedger fixture JAVASCRIPT-004; expected=negative; category=command_injection
execFile("grep", ["fixed"], { timeout: req.query.timeout });
