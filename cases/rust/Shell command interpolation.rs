// TrustLedger fixture RUST-003; expected=positive; category=command_injection
Command::new("sh").arg("-c").arg(format!("tool {}", query.arg)).status()?;
