// TrustLedger fixture JAVASCRIPT-008; expected=positive; category=xss
res.send("<h1>" + req.query.name + "</h1>");
