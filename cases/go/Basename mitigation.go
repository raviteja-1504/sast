// TrustLedger fixture GO-008; expected=negative; category=path_traversal
name := filepath.Base(r.URL.Query().Get("file"))
os.ReadFile(filepath.Join("/srv/files", name))
