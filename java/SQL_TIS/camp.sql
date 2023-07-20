-- 캠핑장테이블생성
CREATE TABLE CAMP(
    CNO CHAR(3) NOT NULL PRIMARY KEY,
    CNAME VARCHAR(100) NOT NULL,
    JUSO VARCHAR(500),
    TEL VARCHAR(20)
);
INSERT INTO CAMP(cno, cname, juso, tel)
VALUES('100','도토리캠핑장','강원도','010-1010-1010');
INSERT INTO CAMP(cno, cname, juso, tel)
VALUES('101','솔밭캠핑장','경기도','010-1010-2020');
INSERT INTO CAMP(cno, cname, juso, tel)
VALUES('102','하늘캠핑장','인천','010-1010-3030');

SELECT * from camp;

-- 시설물테이블생성
CREATE TABLE FACIL(
    FNO INT PRIMARY KEY NOT NULL,
    FNAME VARCHAR(100) not null
);

INSERT INTO FACIL VALUES(0,'전기');
INSERT INTO FACIL VALUES(1,'수도');
INSERT INTO FACIL VALUES(2,'와이파이');
INSERT INTO FACIL VALUES(3,'화장실');
INSERT INTO FACIL VALUES(4,'수영장');

SELECT * from facil;

-- 타입테이블생성
CREATE TABLE TYPE(
    TNO INT PRIMARY KEY NOT NULL,
    TNAME varchar(100) NOT NULL
);

INSERT INTO TYPE VALUES(0,'카라벤');
INSERT INTO TYPE VALUES(1,'글램핑');
INSERT INTO TYPE VALUES(2,'오토캠핑');
INSERT INTO TYPE VALUES(3,'펜션');

SELECT * from type;

-- 캠핑장별 시설물테이블생성
CREATE TABLE CAMP_FACIL(
    CNO CHAR(3) NOT NULL,
    FNO INT NOT NULL,
    PRIMARY key(CNO, FNO),
    FOREIGN KEY(cno) REFERENCES camp(cno),
    FOREIGN KEY(fno) REFERENCES facil(fno)
);

-- 100캠핑장에 시설물 0,1,2
INSERT INTO CAMP_FACIL(cno,fno) VALUES('100',0);
INSERT INTO CAMP_FACIL(cno,fno) VALUES('100',1);
INSERT INTO CAMP_FACIL(cno,fno) VALUES('100',2);

--101캠핑장에 시설물 0,1
INSERT INTO CAMP_FACIL(cno,fno) VALUES('101',0);
INSERT INTO CAMP_FACIL(cno,fno) VALUES('101',1);

-- 102캠핑장에 시설물 0,3
INSERT INTO CAMP_FACIL(cno,fno) VALUES('102',0);
INSERT INTO CAMP_FACIL(cno,fno) VALUES('102',3);


select * from CAMP_FACIL;


-- 캠핑장별타입생성
CREATE TABLE CAMP_TYPE(
    CNO CHAR(3) NOT NULL,
    TNO INT NOT NULL,
    PRIMARY key(CNO, TNO),
    FOREIGN KEY(cno) REFERENCES camp(cno),
    FOREIGN KEY(tno) REFERENCES type(tno)
);

-- 100캠핑장 타입 1,2
INSERT INTO CAMP_TYPE(cno,tno) VALUES('100',1);
INSERT INTO CAMP_TYPE(cno,tno) VALUES('100',2);

-- 101캠핑장 타입 1
INSERT INTO CAMP_TYPE(cno,tno) VALUES('101',1);

-- 102캠핑장 타입 2
INSERT INTO CAMP_TYPE(cno,tno) VALUES('102',2);


select * from CAMP_TYPE;

commit;

-- 캠핑장별 시설물 번호, 시설물 이름
CREATE VIEW VIEW_FACIL as
SELECT c.*, f.fname
FROM CAMP_FACIL c, FACIL f
where c.fno=f.fno;

SELECT * from view_facil;


-- 캠핑장별 타입번호, 타입 이름
SELECT c.*, t.tname
FROM CAMP_TYPE c, TYPE t
WHERE c.TNO = t.TNO;

commit;
