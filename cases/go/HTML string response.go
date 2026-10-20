// TrustLedger fixture GO-006; expected=positive; category=xss
w.Write([]byte("<h1>" + r.URL.Query().Get("name") + "</h1>"))
