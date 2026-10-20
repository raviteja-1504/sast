// TrustLedger fixture GO-004; expected=positive; category=path_traversal
os.ReadFile("/srv/files/" + r.URL.Query().Get("file"))
