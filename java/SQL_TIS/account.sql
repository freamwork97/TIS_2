-- 계좌테이블 생성
CREATE TABLE ACCOUNT(
    ANO INT NOT NULL PRIMARY KEY,
    ANAME VARCHAR(20) NOT NULL,
    BALANCE INT DEFAULT 0
);

-- 거래내역테이블 생성
CREATE TABLE DETAIL(
    DNO INT NOT NULL PRIMARY KEY,
    ANO INT NOT NULL,
    AMOUNT INT DEFAULT 0,
    TYPE CHAR(6) NOT NULL,
    DDATE DATE DEFAULT SYSDATE,
    FOREIGN KEY(ANO) REFERENCES ACCOUNT(ANO) 
);

drop TABLE detail;
drop table ACCOUNT;
-- 계좌번호 SEQUENCE 생성
CREATE SEQUENCE SEQ_ANO START WITH 100 INCREMENT BY 1;
-- 거래번호 SEQUENCE 생성
CREATE SEQUENCE SEQ_DNO START WITH 1 INCREMENT BY 1;

-- 계좌 데이터입력
INSERT INTO ACCOUNT(ANO,ANAME,BALANCE)
VALUES(SEQ_ANO.nextval,'홍길동',500);
INSERT INTO ACCOUNT(ANO,ANAME,BALANCE)
VALUES(SEQ_ANO.nextval,'심청이',1000);
INSERT INTO ACCOUNT(ANO,ANAME,BALANCE)
VALUES(SEQ_ANO.nextval,'강감찬',1000);

SELECT * FROM ACCOUNT;

--거래내역 입력
INSERT INTO DETAIL(DNO, ANO, AMOUNT, TYPE, DDATE)
VALUES(seq_dno.nextval,100,1000,'입금','2023-07-09');
INSERT INTO DETAIL(DNO, ANO, AMOUNT, TYPE, DDATE)
VALUES(seq_dno.nextval,101,1000,'입금','2023-07-09');
INSERT INTO DETAIL(DNO, ANO, AMOUNT, TYPE, DDATE)
VALUES(seq_dno.nextval,102,1000,'입금','2023-07-10');
INSERT INTO DETAIL(DNO, ANO, AMOUNT, TYPE, DDATE)
VALUES(seq_dno.nextval,100,500,'출금','2023-07-11');


SELECT * FROM detail;

alter table ACCOUNT
drop column ano =120;