// TrustLedger fixture KOTLIN-005; expected=positive; category=ssrf
URL(call.request.queryParameters["url"]).openConnection().getInputStream()
