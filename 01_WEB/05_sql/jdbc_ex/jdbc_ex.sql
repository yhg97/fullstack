use jdbc_ex;

    create table users(
        ID VARCHAR(12) NOT NULL PRIMARY KEY ,
        PASSWORD VARCHAR(12) NOT NULL ,
        NAME VARCHAR(30) NOT NULL ,
        ROLE VARCHAR(6) NOT NULL
    );
#  ID 와 PASSWORD는 같다
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES ('guest', 'guest','방문자', 'USER');

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES ('admin', 'admin','관리자', 'ADMIN');

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE)
VALUES ('member', 'member','일반회원', 'USER');

select  * from users;