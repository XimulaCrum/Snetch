# F-Droid Notes

This repository already includes an `fdroid` product flavor and fastlane metadata.

## Current F-Droid-friendly points

- No Google Play Services dependency is included.
- In-app auto-update is already disabled for the `fdroid` flavor.
- Metadata lives under `fastlane/metadata/android/`.
- The app can build an `fdroid` flavor directly from source.

## Things to keep in mind

- Public releases should still use a dedicated signing key outside version control.
- F-Droid builds should rely on the `fdroid` flavor rather than GitHub preview builds.
- If screenshots or icons change, update the matching files under `fastlane/metadata/android/en-US/images/`.
- If a feature could be interpreted as requiring an external account or cookies for some sites, explain that clearly in the metadata instead of hiding it.

## Suggested next step

Before filing an inclusion request, build and test the `fdroidRelease` variant locally and make sure the fastlane screenshots and icon match the current fork branding.
