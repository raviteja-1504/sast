// TrustLedger fixture JAVA-002; expected=negative; category=sqli
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE id=?");
ps.setString(1, request.getParameter("id"));
ps.executeQuery();
