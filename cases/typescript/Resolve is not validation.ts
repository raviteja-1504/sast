// TrustLedger fixture TYPESCRIPT-004; expected=positive; category=path_traversal
const p = path.resolve("/srv/uploads", String(req.query.file));
fs.readFileSync(p);
