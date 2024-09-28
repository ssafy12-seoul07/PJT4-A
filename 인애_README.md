# 관통 PJT 회고록

## 1. 프로젝트 개요

우리 팀은 Servlet, JSP, JSTL, EL 등을 활용하여 운동 영상 리스트를 제공하고, 각 영상에 대한 리뷰 CRUD 기능을 갖춘 웹 애플리케이션을 개발하였습니다.

## 2. 프로젝트 진행 방법

### 설계 단계

- 라이브 강의에서 학습한 내용을 토대로 프로젝트 구조를 설계했습니다.
- DTO, Repository, Service, Controller 구조에 대해 팀원들과 논의했습니다.
- 운동 영상과 리뷰 관리 방식에 중점을 두고 아이디어를 공유했습니다.

### 협업 방식

- 팀장이 기본 프로젝트 구조를 설계하고 Git에 업로드했습니다.
- 팀원들은 이를 pull 받아 각자의 파트를 개발했습니다.

## 3. 프로젝트 구조

### 운동 영상 리스트

```
- DTO: Video (videoId, title, part, channelName, url, thumbnail, reviews, views)
- Service: VideoService (Interface), VideoServiceImpl
- Repository: VideoRepository (Interface), VideoRepositoryImpl
```

### 리뷰 CRUD

```
- DTO: Review (videoId, reviewId, userName, content, regDate)
- Service: ReviewService (Interface), ReviewServiceImpl
- Repository: ReviewRepository (Interface), ReviewRepositoryImpl
```

## 4. 도전과 극복

1. **환경 설정 문제**: 다른 컴퓨터에서 Web Dynamic Project로 열리지 않는 문제에 직면했습니다. 이 문제 해결에 상당한 시간을 투자했지만, 팀원 간 협력으로 극복할 수 있었습니다.
2. **시간 관리**: 환경 설정 문제로 인해 실제 구현 시간이 부족했습니다. 그 결과, 리뷰 부분만 라이브 강의 코드를 바탕으로 구현하게 되었습니다.

## 5. 배운 점과 향후 계획

1. **협업과 인터페이스 설계의 중요성**:
    
    팀 프로젝트를 진행하면서 인터페이스 설계가 협업의 핵심임을 깨달았습니다. 처음에는 어떤 메소드들이 필요할지 막막했지만, 이 경험을 통해 앞으로는 요구사항을 더 꼼꼼히 분석하고 팀원들과 충분히 논의하여 효과적인 인터페이스를 설계해야 한다는 것을 배웠습니다.
    
2. **지속적인 학습과 개인 프로젝트의 필요성**:
    
    시간 제약으로 인해 모든 기능을 구현하지 못한 아쉬움이 큽니다. 이번 프로젝트에서 배운 내용을 토대로, 개인적으로 미완성된 기능들을 구현해 보고 싶습니다. 이를 통해 실력 향상은 물론, 프로젝트를 완성시키는 성취감도 느끼고 싶습니다.
