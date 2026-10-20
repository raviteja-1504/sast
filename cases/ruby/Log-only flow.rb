# TrustLedger fixture RUBY-008; expected=negative; category=sqli
Rails.logger.info("requested id=#{params[:id]}")
