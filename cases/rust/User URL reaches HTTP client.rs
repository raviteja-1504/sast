// TrustLedger fixture RUST-005; expected=positive; category=ssrf
reqwest::get(query.url).await?;
