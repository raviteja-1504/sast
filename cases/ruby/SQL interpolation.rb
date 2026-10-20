# TrustLedger fixture RUBY-001; expected=positive; category=sqli
id = params[:id]
User.where("id = '#{id}'")
