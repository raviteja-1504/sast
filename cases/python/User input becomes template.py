# TrustLedger fixture PYTHON-008; expected=positive; category=ssti
render_template_string("Hello " + request.args["name"])
