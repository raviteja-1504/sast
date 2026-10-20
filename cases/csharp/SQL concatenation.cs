// TrustLedger fixture CSHARP-001; expected=positive; category=sqli
var id = Request.Query["id"];
command.CommandText = "SELECT * FROM Users WHERE Id='" + id + "'";
command.ExecuteReader();
