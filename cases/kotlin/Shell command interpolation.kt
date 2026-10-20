// TrustLedger fixture KOTLIN-003; expected=positive; category=command_injection
Runtime.getRuntime().exec("sh -c tool ${call.request.queryParameters["arg"]}")
