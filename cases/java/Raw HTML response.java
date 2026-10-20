// TrustLedger fixture JAVA-006; expected=positive; category=xss
response.getWriter().write("<h1>" + request.getParameter("name") + "</h1>");
