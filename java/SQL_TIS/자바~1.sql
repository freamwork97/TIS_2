/* 테이블생성 */
create table tbl_juso(
  no int primary key,
  name varchar(20) not null,
  juso varchar(500),
  phone varchar(20)
);

/* 테이블구조 확인 */
desc tbl_juso;

/* 테이블 삭제 */
drop table tbl_juso;

/*데이터입력 */
insert into tbl_juso(no,name,juso,phone)
values(10, '홍길동', '인천', '010-1010-1010');
insert into tbl_juso(no,name,juso,phone)
values(11, '홍길동', '인천', '010-1010-1010');
insert into tbl_juso(no,name,juso,phone)
values(12, '심청이', '서울', '010-1010-2020');
insert into tbl_juso(no,name,juso,phone)
values(13, '강감찬', '부산', '010-1010-3030');
insert into tbl_juso(no,name,juso,phone)
values(14, '이순신', '부산', '010-1010-4040');

/*데이터출력 */
select * from tbl_juso;
select no, name from tbl_juso where no=12;
select * from tbl_juso order by name DESC;
select * from tbl_juso where name like '%이%';

/*데이터수정 */
update tbl_juso 
set name ='김길동', juso='경기도' 
where no = 10;

/*데이터삭제*/
delete from tbl_juso where no=10;

commit;

drop table TBL_JUSO;

create table Students(
  sno char(6) not null primary key, /*학번*/
  sname varchar(20) not null,/*이름*/
  dept varchar(20) not null,/*학과*/
  birthday date,/*생년월일*/
  year int default 1 /*학년*/
);
