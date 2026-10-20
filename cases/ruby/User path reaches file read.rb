# TrustLedger fixture RUBY-004; expected=positive; category=path_traversal
File.read("/srv/files/" + params[:file])
