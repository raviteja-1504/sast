// TrustLedger fixture CSHARP-003; expected=positive; category=command_injection
Process.Start("cmd.exe", "/c tool " + Request.Query["arg"]);
