// TrustLedger fixture CSHARP-009; expected=positive; category=authz_bola
return await db.Orders.FindAsync(Request.RouteValues["id"]);
