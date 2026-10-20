// TrustLedger fixture RUST-001; expected=positive; category=sqli
let id = query.id;
let sql = format!("SELECT * FROM users WHERE id='{}'", id);
sqlx::query(&sql).fetch_all(&pool).await?;
