// TrustLedger fixture GO-005; expected=positive; category=ssrf
http.Get(r.URL.Query().Get("url"))
