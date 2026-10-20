// TrustLedger fixture TYPESCRIPT-001; expected=positive; category=sqli
const id: string = req.query.id as string;
await db.query(`SELECT * FROM users WHERE id='${id}'`);
