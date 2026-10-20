// TrustLedger fixture JAVASCRIPT-009; expected=negative; category=xss
element.textContent = location.hash.slice(1);
