// TrustLedger fixture CSHARP-006; expected=positive; category=xss
return Content("<h1>" + Request.Query["name"] + "</h1>", "text/html");
