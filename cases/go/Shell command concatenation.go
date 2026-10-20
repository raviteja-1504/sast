// TrustLedger fixture GO-003; expected=positive; category=command_injection
arg := r.URL.Query().Get("arg")
exec.Command("sh", "-c", "tool "+arg).Run()
