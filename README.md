# webappcamp_assign

###### 출처
다음 블로그: http://m.blog.daum.net/_blog/_m/articleList.do?blogid=0ZeCX&categoryId=8

### 1.기초공사
* 프로젝트 생성
	Spring Legacy Project -> Spring MVC Project
* context path 변경
	1. server.xml -> context tag path
	2. 프로젝트 -> properties -> web project settings
	
### 2.pom 파일 설정
* 자바 버전 변경(1.6 -> 1.8)<br>
	1. pom 파일 <br>
	2. Properties -> Project Facets -> Java
* dependency 추가<br>
	spring-test, spring-jdbc, mysql-connector, mybatis, mybatis-spring
* UTF-8 필터 추가<br>
	web.xml에 필터 추가	
	
### 3.DB Table 작성
* Table 작성
	create table tbl_board(bno INT NOT NULL AUTO_INCREMENT, title VARCHAR(200) NOT NULL, content VARCHAR(2000) NOT NULL, writer VARCHAR(200) NOT NULL, regdate TIMESTAMP NOT NULL default NOW(), viewcnt INT NOT NULL DEFAULT 0, moddate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, removed TINYINT(1) NOT NULL DEFAULT 0, PRIMARY KEY(bno)) DEFAULT CHARSET='utf8';<br>
	문제: moddate 관련하여 게시글을 보기만해도 update 되는 문제가 발생 -> 게시글을 볼때마다 view count가 올라가는데 이로 인해 moddate가 update됨

### 4.root-context 설정
* bean 등록
	DataSource, SqlSessionFactory
* namespace 설정
	aop, beans, context, jdbc, mybatis-spring
	
### 5.DB 기초공사
* mybatis-config.xml 파일 작성
* board-mapper.xml 파일 작성

### 6.DTO(VO) 작성
* 패키지 생성 및 Dto 클래스 작성
* lombok 설치 (pom 파일)

### 7.board-mapper 파일 작성
insert, selectOne, selectList, update, updateViewCount, delete

### 8.DAO 작성
* DAO 작성
	SqlSessionTemplate을 DI받아(SqlSession 인터페이스) 사용
* 베이스 패키지 수정
	context:component-scan 태그

### 9.Service 작성
Interface, Class 작성

### 10.게시판 목록 구현, 11.게시판 글쓰기 구현, 12.게시판 글읽기 구현, 13.게시판 글수정/삭제 구현
* Controller 작성
* JSP 파일 작성

### login, logout 기능 구현
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/java/com/handong/dto/UserDto.java
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/java/com/handong/mapper/UserMapper.java
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/java/com/handong/service/UserService.java
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/java/com/handong/service/UserServiceImpl.java
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/java/com/handong/util/AuthenticationInterceptor.java
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/resources/mappers/user-mapper.xml
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/webapp/WEB-INF/spring/root-context.xml
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml
https://github.com/WonSik36/webappcamp_assign/blob/master/src/main/webapp/WEB-INF/views/loginform.jsp