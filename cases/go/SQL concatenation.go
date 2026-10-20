// TrustLedger fixture GO-001; expected=positive; category=sqli
id := r.URL.Query().Get("id")
query := "SELECT * FROM users WHERE id='" + id + "'"
db.Query(query)
