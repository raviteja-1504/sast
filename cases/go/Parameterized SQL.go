// TrustLedger fixture GO-002; expected=negative; category=sqli
db.Query("SELECT * FROM users WHERE id=?", r.URL.Query().Get("id"))
