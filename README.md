![header](https://capsule-render.vercel.app/api?type=rect&color=timeAuto&section=header&text=improve-ssk-pro)

### Index
1. [Description](#Description)
2. [Development Environment](#Development-Environment)
3. [Flow Chart](#Flow-Chart)
4. [System Architecture](#System-Architecture)
5. [ERD](#ERD)
6. [API](#API)
7. [Directories](#Directories)
8. [Issues](#Issues)
9. [Notes](#Notes)
10. [More Information](#More-Informaion)



---

### Description

### Development Environment

### Flow Chart

### System Architecture

### ERD

### API

<details>

<summary><b>사용자</b> (/api/v1/user)</summary>


| Method |      End Point       | Description |
|:------:|:--------------------:|:-----------:|
|  GET   |        /login        |     로그인     |
|  POST  |      /register       |    회원가입     |
|  GET   | /check-duplicated-id |  아이디 중복 확인  |
|  GET   |       /find-id       |   아이디 찾기    |
|  GET   |    /find-password    |   비밀번호 찾기   |
| DELETE |   /delete-account    |    회원 탈퇴    |

</details>

<details>

<summary><b>포스트</b> (/api/v1/posts)</summary>


| Method |  End Point  |  Description   |
|:------:|:-----------:|:--------------:|
|  GET   |             |   포스트 목록 보기    |
|  GET   |             |   포스트 목록 정렬    |
|  GET   |             |   포스트 목록 페이징   |
|  GET   |             |   포스트 상세 보기    |
|  POST  |             |    포스트 북마크     |
|  POST  |             |     포스트 작성     |
|  POST  |             |   포스트 이미지 저장   |
|  PUT   |             |   포스트 임시 저장    |
|  GET   |             | 포스트 임시 저장 불러오기 |
|  PUT   |             |     포스트 수정     |
| DELETE |             |     포스트 삭제     |


</details>


<details>

<summary><b>댓글</b> (/api/v1/comments)</summary>


| Method |  End Point  | Description |
|:------:|:-----------:|:-----------:|
|  POST  |             |    댓글 작성    |
|  PUT   |             |    댓글 수정    |
| DELETE |             |    댓글 삭제    |
|  GET   |             |  댓글 목록 보기   |


</details>


<details>

<summary><b>채팅</b> (/api/v1/chat)</summary>


| Method |  End Point  | Description |
|:------:|:-----------:|:-----------:|
|  POST  |             |  채팅 메시지 발송  |
|  GET   |             |  채팅 메시지 보기  |
|  GET   |             |  채팅 목록 보기   |
| DELETE |             |  채팅 내역 삭제   |


</details>


<details>

<summary><b>프로필</b> (/api/v1/profile)</summary>


| Method |  End Point  | Description |
|:------:|:-----------:|:-----------:|
|  POST  |             | 프로필 이미지 수정  |
|  GET   |             |   프로필 수정    |


</details>


<details>

<summary><b>유저 활동</b> (/api/v1/user-activity)</summary>


| Method |  End Point  |  Description  |
|:------:|:-----------:|:-------------:|
|        |             |  작성한 포스팅 목록   |
|        |             |   작성한 댓글 목록   |
|        |             |    북마크 목록     |
|        |             |     구독 목록     |
|        |             | 나를 북마크한 유저 목록 |
|        |             | 나를 구독한 유저 목록  |


</details>





### Directories

### Improvement

### Issues

### Notes



![footer](https://capsule-render.vercel.app/api?type=waving&&color=timeAuto&section=footer)
