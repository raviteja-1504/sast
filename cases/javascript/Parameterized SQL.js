// TrustLedger fixture JAVASCRIPT-002; expected=negative; category=sqli
const id = req.query.id;
db.query("SELECT * FROM users WHERE id = ?", [id]);
