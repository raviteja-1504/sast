// TrustLedger fixture JAVA-004; expected=positive; category=path_traversal
Files.readString(Path.of("/srv/files/" + request.getParameter("file")));
