// TrustLedger fixture TYPESCRIPT-005; expected=positive; category=ssrf
await fetch(String(req.query.url));
