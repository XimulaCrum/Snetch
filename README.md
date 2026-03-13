# Snetch

Queue-first video and audio downloader for Android.

Snetch is an Android downloader built on top of the same `yt-dlp`-powered foundation that made Seal useful, but with a different product direction: calmer task flow, cleaner queue behavior, and more practical day-to-day handling on real devices.

Instead of leaning into "start everything at once," Snetch is meant to feel more deliberate. Add links freely, let tasks line up properly, keep progress readable, and let the app work through downloads in a steadier order. The goal is not to be louder than other downloaders. The goal is to be easier to live with.

## Why Snetch

Most Android downloaders feel fast right up until they become noisy:

- several tasks begin fighting over storage and CPU
- the queue becomes harder to read
- heavy post-processing makes weaker devices stumble
- metered networks start downloads you did not mean to start

Snetch is a response to that.

It favors:

- sequential task handling over messy burst behavior
- queue visibility over hidden background churn
- Wi-Fi-aware starts over accidental cellular usage
- practical stability over feature sprawl

## Current Direction

Snetch is currently focused on a few concrete improvements:

- cleaner queue behavior for people who add multiple links
- Wi-Fi-only download flow that keeps tasks queued until an unmetered network is available
- more careful Android temp-file handling during download and post-processing
- simpler, calmer UX choices for devices that do not enjoy aggressive parallel work

This does not mean Snetch is "basic." It means the app is being shaped around predictable behavior first.

## Features

- Download video and audio from sites supported by [`yt-dlp`](https://github.com/yt-dlp/yt-dlp)
- Queue-first workflow for adding and managing tasks
- Sequential downloading for cleaner progress and lower device strain
- Wi-Fi-only behavior for queued tasks on unmetered networks
- Format selection, audio extraction, subtitles, thumbnails, and metadata support
- Custom `yt-dlp` command templates for advanced users
- Material 3 Android UI

## Philosophy

Snetch is not trying to become an everything-at-once downloader.

It is aimed at people who want:

- a download queue that stays understandable
- a downloader that behaves well on phones and tablets
- fewer background surprises
- a tool that still feels powerful without feeling chaotic

If your ideal downloader feels more like "line it up and let it finish properly," that is the design target here.

## Installation

Releases are intended to be published through GitHub Releases.

Recommended APK for most modern Android devices:

- `arm64-v8a`

Planned release channels:

- stable builds for everyday use
- preview builds for testing newer changes earlier

## Status

Snetch is an actively reworked fork. Some parts still inherit upstream naming, structure, and package layout while the fork is being separated into its own release identity.

That means you should expect:

- branding cleanup in progress
- package and release polish still underway
- feature behavior being verified on both emulator and physical devices

## Roadmap

- finish fork-specific branding and release assets
- separate package identity where needed for independent distribution
- improve queue visibility and waiting-state messaging
- continue hardening Android storage and post-processing behavior
- prepare cleaner public releases

## Credits

Snetch is a fork of [Seal](https://github.com/JunkFood02/Seal).

It also depends on and builds on the work of:

- [`yt-dlp`](https://github.com/yt-dlp/yt-dlp)
- [`youtubedl-android`](https://github.com/yausername/youtubedl-android)
- [`aria2`](https://github.com/aria2/aria2)
- [`mutagen`](https://github.com/quodlibet/mutagen)

Upstream projects and their maintainers deserve the credit for the foundations this fork builds on.

## Contributing

If you open an issue, include:

- device model
- Android version
- whether the problem happened on Wi-Fi or cellular
- the rough reproduction steps
- any relevant log output

Small, focused reports are much easier to act on than broad complaints.

## License

Snetch remains open-source under the same GPLv3 code licensing terms inherited from upstream where applicable. See [LICENSE](LICENSE).

The code is open. The branding and release identity of this fork are separate from upstream Seal.
