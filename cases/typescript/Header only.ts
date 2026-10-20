// TrustLedger fixture TYPESCRIPT-006; expected=negative; category=ssrf
await fetch("https://service.example", { headers: { "x-note": String(req.query.note) } });
