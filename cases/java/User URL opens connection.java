// TrustLedger fixture JAVA-005; expected=positive; category=ssrf
new URL(request.getParameter("url")).openConnection().getInputStream();
