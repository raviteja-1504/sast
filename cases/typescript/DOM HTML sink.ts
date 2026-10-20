// TrustLedger fixture TYPESCRIPT-007; expected=positive; category=xss
element.innerHTML = location.hash.slice(1);
