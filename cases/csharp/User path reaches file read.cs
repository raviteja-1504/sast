// TrustLedger fixture CSHARP-004; expected=positive; category=path_traversal
File.ReadAllText("/srv/files/" + Request.Query["file"]);
