# TrustLedger fixture PYTHON-004; expected=negative; category=command_injection
subprocess.run(["grep", "fixed"], timeout=int(request.args["timeout"]))
