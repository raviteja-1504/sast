# TrustLedger fixture RUBY-007; expected=positive; category=xss
render html: "<h1>#{params[:name]}</h1>".html_safe
