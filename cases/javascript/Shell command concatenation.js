// TrustLedger fixture JAVASCRIPT-003; expected=positive; category=command_injection
const name = req.query.name;
exec("grep " + name + " /srv/data/index.txt");
