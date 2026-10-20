// TrustLedger fixture CSHARP-002; expected=negative; category=sqli
command.CommandText = "SELECT * FROM Users WHERE Id=@id";
command.Parameters.AddWithValue("@id", Request.Query["id"]);
command.ExecuteReader();
