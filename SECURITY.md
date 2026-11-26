# Security Policy

## Supported Versions

This project is in active development. Only the latest version on the `main` branch receives security fixes.

| Version | Supported |
| ------- | --------- |
| main (1.0-SNAPSHOT) | ✅ |
| Older commits       | :x: |

## Reporting a Vulnerability

If you discover a security vulnerability, please **do not open a public issue**.

Instead, report it privately using the **"Report a vulnerability"** button under the Security tab of this repository. If you cannot use that, email L00181486@atu.ie.

Please include:
- A description of the vulnerability and its impact
- Steps to reproduce it
- The affected file(s) or endpoint (e.g. `POST /calculate`)
- Any proof-of-concept code, if available

## Response Times
- Acknowledgement within **5 working days**
- A fix or mitigation plan within **14 working days**, depending on severity

## Disclosure Policy

I follow responsible disclosure. We will work with you to confirm and fix the issue, and publicly disclose the details only once a fix has been released.

## Security Practises in This Project

- Dependencies are monitored by Dependabot
- All changes to `main` go through a pull request with passing CI checks
- Secrets are never committed to the repository
