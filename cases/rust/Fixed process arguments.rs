// TrustLedger fixture RUST-007; expected=negative; category=command_injection
Command::new("grep").arg("fixed").arg("/srv/data/index.txt").status()?;
