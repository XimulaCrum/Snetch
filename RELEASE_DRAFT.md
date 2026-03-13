# Snetch 2.0.0-alpha.5

Snetch is a queue-first Android downloader fork focused on calmer, more predictable downloads.

This release is the first public-facing step toward separating the fork from upstream branding and pushing it in a more deliberate direction. The core idea is simple: make download handling easier to follow, less chaotic on real devices, and more practical for people who keep adding links throughout the day.

## Highlights

- Reworked branding for the fork under the new name **Snetch**
- New sack-inspired launcher icon direction for the fork build
- Queue-first download behavior with sequential task handling
- Wi-Fi-only task flow that keeps new downloads queued until an unmetered network is available
- Ongoing Android temp-file and post-processing handling improvements

## Why this fork exists

Snetch is for people who want a downloader that feels steadier than the default "burst into multiple tasks" model. It aims to reduce clutter, lower device strain, and make the queue easier to understand while still keeping the flexibility of a `yt-dlp`-powered Android app.

## Notes

- This release is still part of an active fork separation process
- Some internal identifiers and upstream structure may still be in transition
- Real-device testing has been done across emulator and physical Android hardware, but more cleanup is still planned

## Credits

Snetch is a fork of Seal and continues to rely on the excellent work behind:

- `yt-dlp`
- `youtubedl-android`
- related upstream Android and open-source dependencies

## Feedback

If you run into issues, please include:

- device model
- Android version
- whether the download was started on Wi-Fi or cellular
- the link type or site involved
- a short reproduction note
