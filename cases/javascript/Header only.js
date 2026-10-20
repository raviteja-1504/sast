// TrustLedger fixture JAVASCRIPT-007; expected=negative; category=ssrf
fetch("https://service.example", { headers: { "x-note": req.query.note } });
