create table users(
	id varchar2(8) primary key, 
	password varchar2(8),
	name varchar2(20),
	role varchar2(5)
);


insert into users values('test', 'test123', '관리자', 'Admin');
insert into users values('user1', 'user1', '홍길동', 'User');

CREATE TABLE WEBBOARD(
	SEQ NUMBER(5) PRIMARY KEY, 
	TITLE VARCHAR2(200),
	WRITER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REGDATE DATE DEFAULT SYSDATE,
	CNT NUMBER(5) DEFAULT 0
);

INSERT INTO WEBBOARD(SEQ, TITLE, WRITER, CONTENT) VALUES(1, '가입인사', '관리자', '잘 부탁드립니다..');
