// TrustLedger fixture GO-009; expected=positive; category=authz_bola
row := db.QueryRow("SELECT data FROM records WHERE id=?", r.URL.Query().Get("id")); _ = row.Scan(&data); json.NewEncoder(w).Encode(data)
