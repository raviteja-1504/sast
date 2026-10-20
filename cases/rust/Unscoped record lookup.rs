// TrustLedger fixture RUST-009; expected=positive; category=authz_bola
let record = repository.find_by_id(query.id).await?;
return Ok(Json(record));
