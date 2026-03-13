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

Snetch는 대기열을 중심으로 동작하도록 다듬고 있는 안드로이드 다운로더 포크입니다. 목표는 단순합니다. 여러 작업을 한꺼번에 터뜨리는 대신, 지금 뭐가 내려받는 중인지와 다음에 뭐가 처리될지가 더 잘 보이게 만들자는 겁니다.

이번 릴리즈는 upstream 브랜딩에서 조금 더 떨어져 나온 첫 공개 빌드에 가깝습니다. 겉모습만 바꾼 게 아니라, 실제 사용감도 정리하는 쪽으로 가고 있습니다. 링크를 여러 개 넣어도 덜 어수선해야 하고, Wi-Fi 조건도 존중해야 하고, Android 쪽 임시 파일과 후처리도 좀 더 보수적으로 다뤄야 한다는 판단이 반영돼 있습니다.

### 이번 릴리즈에서 눈에 띄는 점

- 포크 이름을 **Snetch**로 정리
- upstream Seal과 공존 설치가 가능하도록 Android `applicationId` 분리
- 보따리 느낌의 새 런처 아이콘 적용
- 순차 처리 기반의 대기열 중심 다운로드 동작
- 비과금 네트워크가 잡힐 때까지 기다리는 Wi-Fi only 처리
- Android 임시 파일과 후처리 관련 동작 계속 정리

### 왜 이런 포크를 만들었나

기존 다운로더들이 빠르게 보이는 건 맞지만, 실제로 오래 써보면 상태가 금방 지저분해지는 경우가 많습니다. 작업이 몇 개만 겹쳐도 대기열이 읽기 어려워지고, 저장소 접근과 후처리가 겹치면 기기가 버벅이기 쉽습니다.

Snetch는 그런 쪽을 줄이는 데 초점을 둡니다. 조금 덜 화려해도, 작업이 어떻게 쌓이고 어떤 순서로 처리되는지가 보이는 쪽이 낫다고 생각했습니다.

### 참고

- 이번 릴리즈는 아직 포크 분리 작업의 진행 중 단계입니다
- 내부 소스 패키지와 구조 일부는 upstream 흔적이 남아 있지만, 설치 정체성은 이미 분리했습니다
- 에뮬레이터와 실기기 양쪽에서 테스트했지만 추가 정리는 계속 진행할 예정입니다

### 크레딧

Snetch는 Seal 포크이며, 아래 프로젝트들의 작업 위에 서 있습니다.

- `yt-dlp`
- `youtubedl-android`
- 기타 upstream Android 및 오픈소스 의존성

### 피드백

문제를 제보할 때는 아래 정보를 같이 적어주세요.

- 기기 모델명
- Android 버전
- Wi-Fi 또는 셀룰러 여부
- 링크 종류 또는 사이트
- 짧은 재현 설명
