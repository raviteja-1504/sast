// TrustLedger fixture KOTLIN-009; expected=positive; category=authz_bola
call.respond(orderRepository.findById(call.parameters["id"]))
