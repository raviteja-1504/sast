// TrustLedger fixture KOTLIN-004; expected=positive; category=path_traversal
File("/srv/files/${call.request.queryParameters["file"]}").readText()
