-------------------------  STRAT DML(데이터 조작어)  -----------------------------

/*
   새로운 행을 추가하는 INSERT INTO  (C)
   행을 조회하는 SELECT             (R)
   기존 행을 수정하는 UPDATE SET     (U)
   행을 삭제하는 DELETE             (D)
*/
-------------------------------------------------------------------------------
/*  새로운 행을 추가하는 INSERT INTO (C)
   
     특정한 컬럼에만 데이터를 입력하는 경우
     INSERT INTO 테이명(컬럼명1, 컬럼명2) VALUES(값1, 값2);
     
     모든 컬럼에 데이터를 입력하는 경우
     INSERT INTO 테이블명 VALUES (값1, 값2);
*/

create table dept01( 
                     deptno number(2),
                     dname varchar2(14),
                     loc varchar2(13)
                   );            
-- 부서번호 :10, 부서명 : ACCOUNTING, 지역 : NEW YORK 를 추가하시오
insert into dept01(deptno,dname,loc)values(10,'ACCOUNTING','NEW YORK');
insert into dept01 values(20,'RESEARCH','DALLAS');
insert into dept01(deptno,dname) values(30,'SALES'); -- 입력하지 않은 컬럼은 자동으로 null값이 들어감



INSERT INTO DEPT(deptno) values(null);
-- 테이블 복사 및 생성
create table dept02 as select * from dept;

-- emp04 테이블생성
create table emp04(
                   deptno number(2) not null,
                   dname varchar2(14),
                   loc varchar2(13)
                  );
-- 행 삽입        
insert into emp04 values(10,null,null);
insert into emp04 values(20,'','');

select * from tab;
-------------------------------------------------------------------------------
-- 수정
/*
   기존 행을 수정하는 UPDATE SET (U)
   
     형식
     UPDATE 테이블명 SET 컬럼명1 = 값1, 컬럼명2 = 값2 where 조건식
     
     어떤 행의 데이터를 수정하는지 where절을 이용하여 조건을 지정
     where절을 사용하지 않으면 테이블에 있는 모든 행이 수정됨
*/


create table emp01 as select * from emp;
select * from emp01;

--모든 사원의 부서번호를 30번으로 수정
update emp01 set deptno=30;
rollback;

-- 모든 사원의 급여를 10% 인상
update emp01 set sal=sal*1.1;

-- 모든 사원의 입사일을 오늘로
update emp01 set hiredate = sysdate;

-- 1987년에 입사한 사원의 입사일을 오늘로 수정
select * from emp01 where substr(hiredate,1,2)='87';
update emp01 set hiredate = sysdate where substr(hiredate,1,2)='87';
select * from emp01;

-- SCOTT 사원의 부서번호를 10, 직급을 MANAGER로 변경
select deptno, job from emp01 where ename='SCOTT';
update emp01 set deptno =10 , job = 'MANAGER' where ename = 'SCOTT';  --변경값이 2개 이상일때 ,로 구분하고 조건이 2개이상일때는 and로 구분

/*
    DELETE
     테이블에 특정 행을 삭제할 때
     
    형식
     DELETE FROM 테이블명 where 조건
*/
create table dept01 as select * from dept;
select * from dept01;
delete from dept01 where deptno=30;
rollback;
-- 컬럼 삭제 : ALTER DROP , 테이블삭제 DROP, 행 삭제 DELETE, TRUNCATE


-------------------- DML 끝 --------------------------------------

/*
   트랜잭션 (Transaction)
     - 데이터베이스에서 데이터를 처리하는 하나의 논리적인 작업단위를 의미함
     - 트랜잭션을 사용하는 이유 : 1.데이터의 일관성을 유지
                              2.안정적으로 데이터를 복구시키기 위해
      insert, update, delete 명령                         
    
      commit 과 rollback
      commit
       - 모든 작업을 정상적으로 처리하겠다고 확정하는 명령어
         트랜잭션 처리 과정을 데이터베이스에 모두 반영함(변경된 내용을 모두 영구저장)
         
      rollback
       - 작업중 문제가 발생되어서 트랜잭션 처리 과정에서 발생한 변경사항을 취소하는 명령
         데이터 처리가 시작되기 이전 상태로 되돌림
         
         마지막으로 commit 명령 이후부터 새로운 commit 명령을 실행하는 시점까지 수행된
         모든 DML명령들을 의미함.
*/

drop table dept01;

create table dept01 as select * from dept;
select * from dept01;

delete from dept01;
rollback;

delete from dept01 where deptno=20;

commit; -- 한번 커밋후엔 롤백해도 안살아남.


/*
   savepoint
     - 현재 트랜잭션을 작게 분할할 수 있다.
       저장된 savepoint는 rollback to savepoint 문을 사용하여 표시한 곳까지
       rollback 할 수 있음
       
     형식
       특정 위치를 지정하는 형식
       savepoint 테이블명
       
       지정해놓은 특정 위치로 되돌아가는 형식
       rollback to label_name;
*/
drop table dept01;
create table dept01 as select * from dept;
select * from dept01;

delete from dept01 where deptno=40;
COMMIT;
delete from dept01 where deptno=30;
savepoint c1;
delete from dept01 where deptno=20;
savepoint c2;
delete from dept01 where deptno=10;
select * from dept01;

rollback to c1;
rollback to c2;
rollback;

select * from user_cons_columns where table_name = 'EMP';


