# TrustLedger fixture PYTHON-006; expected=negative; category=path_traversal
name = request.args["file"]
if name not in {"report.csv", "summary.txt"}: raise ValueError()
open("/srv/reports/" + name).read()
