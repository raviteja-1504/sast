// TrustLedger fixture RUST-004; expected=positive; category=path_traversal
let path = format!("/srv/files/{}", query.file);
std::fs::read_to_string(path)?;
