// TrustLedger fixture TYPESCRIPT-008; expected=negative; category=xss
element.textContent = location.hash.slice(1);
