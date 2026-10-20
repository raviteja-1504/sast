# TrustLedger fixture PYTHON-010; expected=negative; category=xss
name = escape(request.args["name"])
return f"<p>{name}</p>"
