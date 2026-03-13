# Snetch 2.0.0-alpha.5

[English](#english) | [한국어](#한국어)

## English

Snetch is a queue-first Android downloader fork focused on calmer, more predictable downloads.

This release is the first public-facing step toward separating the fork from upstream branding and pushing it in a more deliberate direction. The core idea is simple: make download handling easier to follow, less chaotic on real devices, and more practical for people who keep adding links throughout the day.

## Highlights

- Reworked branding for the fork under the new name **Snetch**
- Separated Android application ID so Snetch can coexist with upstream Seal installs
- New sack-inspired launcher icon direction for the fork build
- Queue-first download behavior with sequential task handling
- Wi-Fi-only task flow that keeps new downloads queued until an unmetered network is available
- Ongoing Android temp-file and post-processing handling improvements

## Why this fork exists

Snetch is for people who want a downloader that feels steadier than the default "burst into multiple tasks" model. It aims to reduce clutter, lower device strain, and make the queue easier to understand while still keeping the flexibility of a `yt-dlp`-powered Android app.

## Notes

- This release is still part of an active fork separation process
- Internal source packages still follow upstream structure in places, but install identity is now separated
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

## 한국어

Snetch는 더 차분하고 예측 가능한 다운로드 경험을 목표로 하는 큐 중심 안드로이드 다운로더 포크입니다.

이번 릴리즈는 upstream 브랜딩에서 조금 더 분리된 공개용 포크로 나아가기 위한 첫 단계입니다. 핵심 방향은 단순합니다. 실제 안드로이드 기기에서 링크를 계속 추가해도 덜 어수선하고, 다운로드 흐름이 더 읽기 쉽고, 일상적으로 쓰기 더 편한 앱을 만드는 것입니다.

### 주요 변경점

- 포크 이름을 **Snetch**로 재정리
- upstream Seal과 공존 설치가 가능하도록 Android `applicationId` 분리
- 보따리 느낌의 새 런처 아이콘 방향 적용
- 순차 처리 기반의 큐 중심 다운로드 흐름
- 비과금 네트워크가 올 때까지 작업을 대기시키는 Wi-Fi only 동작
- Android 임시 파일 및 후처리 흐름 안정화 작업 지속

### 왜 이 포크를 만들었나

Snetch는 "한꺼번에 다 시작하는" 방식보다, 줄을 세우고 차례대로 끝내는 쪽이 더 낫다고 느끼는 사용자를 위한 앱입니다. 큐를 더 읽기 쉽게 만들고, 기기 부담을 낮추고, `yt-dlp` 기반 안드로이드 다운로더를 실제 사용에 더 맞게 다듬는 것이 목표입니다.

### 참고

- 이번 릴리즈는 아직 포크 분리 작업의 진행 중 단계입니다
- 내부 소스 패키지와 구조 일부는 upstream 흔적을 남기고 있지만, 설치 정체성은 이미 분리되었습니다
- 에뮬레이터와 실기기 양쪽에서 테스트를 진행했지만, 추가 정리는 계속될 예정입니다

### 크레딧

Snetch는 Seal 포크이며, 다음 프로젝트들의 작업 위에 서 있습니다.

- `yt-dlp`
- `youtubedl-android`
- 기타 upstream Android 및 오픈소스 의존성

### 피드백

문제를 제보할 때는 아래 정보를 함께 적어주세요.

- 기기 모델명
- Android 버전
- Wi-Fi 또는 셀룰러 여부
- 링크 종류 또는 사이트
- 짧은 재현 설명
