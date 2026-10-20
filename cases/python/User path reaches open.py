# TrustLedger fixture PYTHON-005; expected=positive; category=path_traversal
open("/srv/uploads/" + request.args["file"]).read()
