# TrustLedger SAST Benchmark — Starter Corpus

## Contents
- 100 compact source fixtures across JavaScript, TypeScript, Python, Java, Go, C#, PHP, Ruby, Kotlin, and Rust.
- Easy and hard positive cases, plus negative look-alikes intended to test false-positive resistance.
- `manifest.json` and `manifest.csv` with expected labels, category, difficulty, and file paths.
- Categories include SQL injection, command injection, path traversal, SSRF, XSS, SSTI, unsafe deserialization, BOLA/authorization, and synthetic hardcoded-secret markers.

## Use
1. Scan `cases/` using TrustLedger.
2. Export JSON/SARIF findings.
3. Map findings to fixture path and category.
4. For each language/category, compare detections to expected labels.
5. Track true positives, false positives, false negatives, duplicates, scan time, peak memory, and scan health.
6. Keep this corpus versioned and run it on every scanner change.

## Metrics
- Precision = TP / (TP + FP)
- Recall = TP / (TP + FN)
- Report false-positive rate separately for negative fixtures.
- Deduplicate by fixture + rule + sink location, not only by rule name.

## Important limitations
This is a starter synthetic corpus, not a complete benchmark and not a substitute for OWASP Benchmark or Juliet/NIST SARD. Some snippets are intentionally minimal and may require framework stubs or wrapper projects for parsing. BOLA examples are review-required because authorization depends on surrounding route, identity, and ownership checks. Safe-path examples require correct sanitizer/allowlist modeling.

## Safety
Do not deploy these snippets. Secret strings are fake examples, not credentials. Run the scanner in an isolated test environment.
