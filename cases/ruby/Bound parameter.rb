# TrustLedger fixture RUBY-002; expected=negative; category=sqli
User.where("id = ?", params[:id])
