// TrustLedger fixture TYPESCRIPT-002; expected=negative; category=sqli
await db.query("SELECT * FROM users WHERE id = $1", [req.query.id]);
