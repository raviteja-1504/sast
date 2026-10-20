// TrustLedger fixture JAVASCRIPT-010; expected=positive; category=authz_bola
const order = await db.orders.findById(req.params.id); res.json(order);
