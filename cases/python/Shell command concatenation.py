# TrustLedger fixture PYTHON-003; expected=positive; category=command_injection
os.system("grep " + request.args["name"] + " /srv/data/index.txt")
