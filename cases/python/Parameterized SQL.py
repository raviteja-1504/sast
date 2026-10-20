# TrustLedger fixture PYTHON-002; expected=negative; category=sqli
cursor.execute("SELECT * FROM users WHERE id = %s", (request.args["id"],))
