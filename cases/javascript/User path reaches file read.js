// TrustLedger fixture JAVASCRIPT-005; expected=positive; category=path_traversal
fs.readFileSync("/srv/files/" + req.query.file);
