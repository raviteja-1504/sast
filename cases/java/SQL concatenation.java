// TrustLedger fixture JAVA-001; expected=positive; category=sqli
String id = request.getParameter("id");
String sql = "SELECT * FROM users WHERE id='" + id + "'";
statement.executeQuery(sql);
