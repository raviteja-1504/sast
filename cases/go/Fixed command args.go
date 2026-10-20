// TrustLedger fixture GO-007; expected=negative; category=command_injection
exec.Command("grep", "fixed", "/srv/data/index.txt").Run()
