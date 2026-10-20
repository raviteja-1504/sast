// TrustLedger fixture JAVA-010; expected=negative; category=ssrf
new URL("https://service.example/status").openConnection();
