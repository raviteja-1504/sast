// TrustLedger fixture KOTLIN-002; expected=negative; category=sqli
val ps = connection.prepareStatement("SELECT * FROM users WHERE id=?")
ps.setString(1, call.request.queryParameters["id"])
ps.executeQuery()
