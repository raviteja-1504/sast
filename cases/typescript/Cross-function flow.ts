// TrustLedger fixture TYPESCRIPT-009; expected=positive; category=sqli
export function route(req: Request) { return service.find(String(req.query.id)); }
