// TrustLedger fixture JAVA-003; expected=positive; category=command_injection
String arg = request.getParameter("arg");
Runtime.getRuntime().exec("sh -c \"tool " + arg + "\"");
