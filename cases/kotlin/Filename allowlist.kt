// TrustLedger fixture KOTLIN-008; expected=negative; category=path_traversal
val name = call.request.queryParameters["file"]!!
require(name in setOf("report.csv", "summary.txt"))
File("/srv/reports/$name").readText()
