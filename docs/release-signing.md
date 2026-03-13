# Release Signing

`Snetch` can build installable release APKs without a custom key, but public releases should use a dedicated signing key.

## Recommended setup

1. Generate a keystore outside version control.
2. Save it under a local path such as `.keys/snetch-release.jks`.
3. Copy `keystore.properties.example` to `keystore.properties`.
4. Fill in the real passwords and alias.

`keystore.properties` is already ignored by Git.

## Generate a keystore

Use `keytool` from the JDK:

```powershell
keytool -genkeypair `
  -v `
  -keystore .keys/snetch-release.jks `
  -alias snetch `
  -keyalg RSA `
  -keysize 4096 `
  -validity 9125
```

## Current build behavior

- If `keystore.properties` exists, release and debug builds use the configured signing key.
- If it does not exist, release builds fall back to the debug key so test APKs are still installable.

That fallback is useful for local testing, but it should not be used for long-term public releases.
