# Snetch

[English](README.md) | [한국어](README.ko.md)

Queue-first video and audio downloader for Android.

Snetch is a fork built on top of the same `yt-dlp` foundation that made Seal useful, but it pushes the product in a more practical direction for day-to-day use on real devices. The focus is simple: cleaner queue behavior, saner defaults, and fewer surprises once you start stacking links.

## Why Snetch

Many Android downloaders look fine until they start doing too much at once:

- multiple downloads fight over storage and CPU
- queue state becomes hard to read
- heavy post-processing hits weaker devices hard
- metered networks start work you did not mean to allow

Snetch is meant to stay calmer than that.

## Current Direction

The fork is currently focused on a few specific improvements:

- sequential task handling instead of messy burst behavior
- saved presets that can auto-queue links without reopening format choices every time
- playlist links that expand into individual queued tasks
- Wi-Fi-aware queueing that waits for an unmetered network when needed
- safer Android temp-file handling during download and post-processing
- clearer task states and more useful failure messages

This is not about making the app smaller. It is about making it easier to live with.

## Features

- Download video and audio from sites supported by [`yt-dlp`](https://github.com/yt-dlp/yt-dlp)
- Queue-first workflow for adding and managing tasks
- Sequential downloads by default
- Saved audio/video presets for repeat downloads
- Playlist expansion into individual queued items
- Wi-Fi-only queueing for metered-network control
- Format selection, subtitles, thumbnails, metadata, and custom command templates
- Material 3 Android UI

## Release Notes

Recent work in this fork includes:

- independent `applicationId` so Snetch can coexist with upstream installs
- fork branding and launcher icon updates
- preset-first link handling with info fetch before queueing
- playlist bulk enqueue support
- friendlier queue state labels
- more direct error classification for common failures like Cloudflare, login requirements, cookies, and Android file access issues

## Signing Release Builds

Public releases should use a dedicated signing key.

- Sample config: [`keystore.properties.example`](/C:/Users/Administrator/Documents/codexx/Seal/keystore.properties.example)
- Setup notes: [`docs/release-signing.md`](docs/release-signing.md)

If no custom keystore is configured, release builds still fall back to the debug key so local test APKs remain installable.

## Installation

Releases are published through GitHub Releases.

Recommended APK for most current Android devices:

- `arm64-v8a`

## Status

Snetch is an actively maintained fork. Some internal package names still follow upstream structure, but the install identity and public-facing branding are already separated.

## Credits

Snetch is a fork of [Seal](https://github.com/JunkFood02/Seal).

It also depends on and builds on:

- [`yt-dlp`](https://github.com/yt-dlp/yt-dlp)
- [`youtubedl-android`](https://github.com/yausername/youtubedl-android)
- [`aria2`](https://github.com/aria2/aria2)
- [`mutagen`](https://github.com/quodlibet/mutagen)

## Contributing

If you open an issue, include:

- device model
- Android version
- whether the problem happened on Wi-Fi or cellular
- rough reproduction steps
- useful logs or screenshots

Small, focused reports are much easier to act on than broad complaints.

## License

Snetch remains open-source under GPLv3 where inherited from upstream. See [LICENSE](LICENSE).
