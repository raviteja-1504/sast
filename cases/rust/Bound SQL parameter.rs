// TrustLedger fixture RUST-002; expected=negative; category=sqli
sqlx::query("SELECT * FROM users WHERE id = $1").bind(query.id).fetch_all(&pool).await?;
