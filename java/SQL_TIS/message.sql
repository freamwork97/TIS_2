-- 사용자테이블
CREATE TABLE USERS(
    ID VARCHAR(20) NOT NULL PRIMARY KEY,
    UNAME VARCHAR(20) NOT NULL,
    POINT INT DEFAULT 0,
    PHONE VARCHAR(20)
);

-- 메시지테이블
CREATE TABLE MESSAGE(
    MID INT NOT NULL PRIMARY KEY,
    SENDER VARCHAR(20) NOT NULL,
    RECEIVER VARCHAR(2) NOT NULL,
    SDATE DATE DEFAULT SYSDATE,
    MESSAGE VARCHAR(1000) NOT NULL,
    FOREIGN KEY(SENDER) REFERENCES USERS(ID),
    FOREIGN KEY(RECEIVER) REFERENCES USERS(ID) 
);

--사용자입력
INSERT INTO users(id,uname,point,phone)
VALUES('blue','이블루',20,'010-1010-1010'); 
INSERT INTO users(id,uname,point,phone)
VALUES('red','박레드',10,'010-1010-2020'); 
INSERT INTO users(id,uname,point,phone)
VALUES('green','최그린',10,'010-1010-3030'); 

SELECT * from users;

--메시지번호 시퀀스생성
CREATE SEQUENCE SEQ_MID START WITH 1 INCREMENT BY 1;

--메시지입력
INSERT INTO message(mid,sender,receiver,sdate,message)
values(SEQ_MID.nextval,'blue','red',sysdate,'레드야 잘지내지');
INSERT INTO message(mid,sender,receiver,sdate,message)
values(SEQ_MID.nextval,'red','blue',sysdate,'블루야 오랜만이다');
INSERT INTO message(mid,sender,receiver,sdate,message)
values(SEQ_MID.nextval,'green','blue',sysdate,'폭우 조심해');
INSERT INTO message(mid,sender,receiver,sdate,message)
values(SEQ_MID.nextval,'blue','green',sysdate,'고마워 조심할게');

SELECT * FROM message;


--블루가 보낸메시지
select m.*, u.UNAME,PHONE
FROM message m, users u
WHERE sender = 'blue' and u.id=m.receiver;

--블루가 받은메시지
SELECT m.*, uname
FROM message m, users u
where receiver='blue' and sender=id;

ALTER TABLE message add SDEL INT DEFAULT 0;
ALTER TABLE message add RDEL INT DEFAULT 0;

commit;