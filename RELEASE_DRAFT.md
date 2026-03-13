# Snetch 2.0.0-alpha.5

[English](#english) | [한국어](#korean)

## English

Snetch is a queue-first Android downloader fork focused on calmer, more predictable downloads.

This release keeps pushing the fork away from "start everything at once" behavior and toward something that is easier to manage on real devices.

### Highlights

- Sequential downloads with clearer queue behavior
- Saved presets that can auto-queue incoming links
- Playlist links that expand into individual queued items
- Wi-Fi-aware queueing for metered-network control
- Improved temp-file handling and install identity separation
- More useful task states and clearer failure messages for common site and storage issues

### Notes

- Snetch now has its own Android application ID and can coexist with upstream installs
- Release builds should use a dedicated signing key for public distribution
- A sample signing config is included in `keystore.properties.example`

## Korean

Snetch는 대기열 중심으로 다듬은 안드로이드 다운로더 포크입니다.

이번 릴리즈에서는 "여러 개를 한꺼번에 터뜨리는 방식"보다, 실제 기기에서 더 읽기 쉽고 관리하기 쉬운 방향으로 계속 다듬었습니다.

### 이번 릴리즈에 들어간 것

- 순차 다운로드와 더 또렷한 대기열 동작
- 저장해 둔 프리셋으로 링크 자동 추가
- 플레이리스트 링크를 개별 작업으로 풀어서 대기열에 넣기
- Wi-Fi 조건을 보는 대기 처리
- 임시 파일 처리와 설치 패키지 분리 정리
- 사이트 차단, 로그인 필요, 쿠키 필요, 파일 접근 문제를 좀 더 직접적으로 보여주는 오류 안내

### 참고

- Snetch는 이제 upstream 앱과 공존 설치가 가능합니다
- 공개 배포용 릴리즈는 전용 서명 키를 쓰는 편이 맞습니다
- 샘플 서명 설정은 `keystore.properties.example`에 들어 있습니다
