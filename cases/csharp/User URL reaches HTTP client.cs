// TrustLedger fixture CSHARP-005; expected=positive; category=ssrf
await httpClient.GetAsync(Request.Query["url"]);
