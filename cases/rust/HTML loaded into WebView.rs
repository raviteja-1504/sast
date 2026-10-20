// TrustLedger fixture RUST-006; expected=positive; category=xss
let html = format!("<h1>{}</h1>", user_input);
webview.load_html(&html, None);
