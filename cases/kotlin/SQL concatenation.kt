// TrustLedger fixture KOTLIN-001; expected=positive; category=sqli
val id = call.request.queryParameters["id"]
val sql = "SELECT * FROM users WHERE id='$id'"
connection.createStatement().executeQuery(sql)
