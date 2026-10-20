# TrustLedger fixture RUBY-006; expected=positive; category=ssti
ERB.new("Hello " + params[:name]).result
