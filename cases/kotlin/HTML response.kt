// TrustLedger fixture KOTLIN-006; expected=positive; category=xss
call.respondText("<h1>${call.request.queryParameters["name"]}</h1>", ContentType.Text.Html)
