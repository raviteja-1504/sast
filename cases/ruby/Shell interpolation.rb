# TrustLedger fixture RUBY-003; expected=positive; category=command_injection
system("grep #{params[:name]} /srv/data/index.txt")
