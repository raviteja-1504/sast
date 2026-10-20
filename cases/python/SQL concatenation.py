# TrustLedger fixture PYTHON-001; expected=positive; category=sqli
user_id = request.args["id"]
query = "SELECT * FROM users WHERE id=" + user_id
cursor.execute(query)
