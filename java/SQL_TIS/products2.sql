--상품테이블 생성
CREATE TABLE PRODUCTS(
  PCODE INT NOT NULL PRIMARY KEY,
  PNAME VARCHAR(200) NOT NULL,
  PPRICE INT DEFAULT 0
);

--테이블삭제
DROP TABLE PRODUCTS;

--테이블 정보 확인
DESC PRODUCTS;

--샘플데이터 입력
INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE)
VALUES(100, '삼성 냉장고', 2500000);
INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE)
VALUES(101, '엘지 냉장고', 2800000);
INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE)
VALUES(102, '엘지 세탁기', 2300000);
INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE) 
VALUES(103, '삼성 세탁기', 2700000);

--모든 데이터 출력
SELECT * FROM PRODUCTS;

INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE)
VALUES(PCODE_SEQ.NEXTVAL, '삼성 스타일러', 1700000);
COMMIT;

--자동증가 상품코드 시퀸스
CREATE SEQUENCE PCODE_SEQ START WITH 104 INCREMENT BY 1;

--자동증가 판매코드 시퀸스
CREATE SEQUENCE CODE_SEQ START WITH 1 INCREMENT BY 1;
SELECT CODE_SEQ.NEXTVAL FROM DUAL;

--판매테이블 생성
CREATE TABLE SALE(
  SCODE INT NOT NULL PRIMARY KEY,
  PCODE INT NOT NULL,
  QNT INT DEFAULT 1,
  SPRICE INT DEFAULT 0,
  SDATE DATE DEFAULT SYSDATE,
  FOREIGN KEY(PCODE) REFERENCES PRODUCTS(PCODE)
);

--판매테이블 샘플데이터
INSERT INTO SALE(SCODE, PCODE, QNT, SPRICE)
VALUES(CODE_SEQ.NEXTVAL,100,2,2500000);
INSERT INTO SALE(SCODE, PCODE, QNT, SPRICE)
VALUES(CODE_SEQ.NEXTVAL,100,3,2400000);
INSERT INTO SALE(SCODE, PCODE, QNT, SPRICE)
VALUES(CODE_SEQ.NEXTVAL,101,1,2800000);

SELECT * FROM sale;

CREATE VIEW VIEW_SALE AS 
SELECT S.SCODE, S.PCODE, P.PNAME, S.SPRICE, 
S.QNT, S.SPRICE*S.QNT SSUM, P.PPRICE, 
TO_CHAR(S.SDATE,'YYYY-MM-DD HH:MI:ss') FDATE
FROM SALE S, PRODUCTS P
WHERE P.PCODE=S.PCODE
ORDER BY S.SCODE DESC;

SELECT sum(qnt) FROM VIEW_SALE WHERE PNAME LIKE '%삼성%';

-- DROP TABLE SALE;
-- DROP TABLE PRODUCTS;

COMMIT;

SELECT * FROM VIEW_SALE WHERE PCODE = 100;