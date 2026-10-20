# TrustLedger fixture RUBY-009; expected=positive; category=authz_bola
@invoice = Invoice.find(params[:id]); render json: @invoice
