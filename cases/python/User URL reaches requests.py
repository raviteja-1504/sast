# TrustLedger fixture PYTHON-007; expected=positive; category=ssrf
requests.get(request.args["url"], timeout=3)
