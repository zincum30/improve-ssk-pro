<img src= "https://capsule-render.vercel.app/api?type=waving&height=250&color=auto&text=Improve%20SSK&reversal=false&textBg=false&fontAlignY=35">



## Index

1. [Description](#Description)
2. [Development Environment](#Development-Environment)
3. [Flow Chart](#Flow-Chart)
4. [System Architecture](#System-Architecture)
5. [ERD](#ERD)
6. [API](#API)
7. [Directories](#Directories)
8. [Improvement](#Improvement)
9. [Issues](#Issues)
10. [Notes](#Notes)



---

## Description



## Development Environment



## Flow Chart


![Untitled - Flow Chart](https://github.com/zincum30/improve-ssk-pro/assets/115124708/3d150083-a5b9-4432-87ea-f2a0bdc4fc37)
<br>

---

## System Architecture




![제목 없음-2023-11-02-0237](https://github.com/zincum30/improve-ssk-pro/assets/115124708/658dcc4a-77b4-4e32-b8f8-7b5d149d10fc)
<br>


## ERD

## API

<details>
<summary><b>사용자</b> (/api/v1/user)</summary>

| Method |      End Point       |  Description  |  Note  |
|:------:|:--------------------:|:-------------:|:------:|
|  GET   |        /login        |      로그인      |
|  POST  |      /register       |     회원가입      |
|  GET   | /check-duplicated-id |   아이디 중복 확인   |
|  GET   |       /find-id       |    아이디 찾기     |
|  GET   |    /find-password    |    비밀번호 찾기    |
| DELETE |       /profile       |     회원 탈퇴     |
|  POST  |       /profile       |    프로필 수정     |
|  GET   |   /activity/posts    |  작성한 포스팅 목록   |
|  GET   |  /activity/comments  |   작성한 댓글 목록   |
|  GET   |  /activity/bookmark  |    북마크 목록     |
|  GET   | /activity/subscribe  |     구독 목록     |
|  GET   |   /info/bookmarked   | 나를 북마크한 유저 목록 |
|  GET   |   /info/subscriber   | 나를 구독한 유저 목록  |
|  GET   |      /settings       |   옵션 목록 조회    |
|  POST  |      /settings       |     옵션 수정     |
</details>


<details>
<summary><b>포스트</b> (/api/v1/posts)</summary>

| Method | End Point  |  Description   |  Note  |
|:------:|:----------:|:--------------:|:------:|
|  GET   |            |   포스트 목록 조회    |
|  GET   | /{post-id} |   포스트 상세 조회    |
|  PUT   | /{post-id} |    포스트 북마크     |
|  POST  |            |     포스트 작성     | 멀티파트폼? |
|  PUT   |  /drafts   |   포스트 임시 저장    |
|  GET   |  /drafts   | 포스트 임시 저장 불러오기 |
|  PUT   |            |     포스트 수정     |
| DELETE |            |     포스트 삭제     |
|  POST  | /comments  |     댓글 작성      |
|  PUT   | /comments  |     댓글 수정      |
| DELETE | /comments  |     댓글 삭제      |
|  GET   | /comments  |    댓글 목록 조회    |
</details>


<details>
<summary><b>검색</b> (/api/v1/search)</summary>

| Method | End Point | Description | Notes |
|:------:|:---------:|:-----------:|:-----:|
|  GET   |           |     검색      |  정렬   |
</details>


---


## Directories

## Improvement


## Issues

## Notes



![footer](https://capsule-render.vercel.app/api?type=waving&&color=timeAuto&section=footer)
