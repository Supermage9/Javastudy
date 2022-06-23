-- 올해 며칠이 지났는지 날짜를 계산하여 출력하시오.

-- TO_DATE
select sysdate -'2022/01/01' from dual; -- 오류발생
select trunc(sysdate-TO_DATE('2022/01/01','YYYY/MM/DD')) from dual;


/*
일반함수(기타함수)

NVL    : 첫번째 인자로 받은 값이 NULL과 같으면 두 번째 인자 값으로 변경
DECODE : 첫번째 인자로 받은 값을 조건에 맞춰 변경(if문과 유사)
CASE   : 조건에 맞는 문장을 수행함(switch-case와 유사) 

*/

-- NVL : NULL값을 다른 값으로 변환하는 함수
--       NULL을 0 또는 다른 값으로 변환하기 위해 사용하는 함수

select ename, sal, comm, job from emp order by job;

--연봉을 계산하기 위해서 급여에 12를 곱한 수 커미션을 더해보면?
select ename, sal, comm, sal*12, sal*2+comm from emp order by job; -- null은 계산후에도 null이기 때문에 0으로 바꿔줘야 함

select ename, sal, sal*12, sal*2+NVL(comm,0) from emp order by job; -- NVL(NULL값, 바꿀값)

desc emp;
select ename, NVL(to_CHAR(mgr,'9999'),'CEO') from emp ORDER BY JOB;


select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
   조건에 맞는 문장을 선택하기 위한 함수
   switch case문과 같이 여러가지 경우에 대해 선택할 수 있는 함수
   DECODE(표현식, 조건1, 결과1,
                 조건2, 결과2,
                 조건3, 결과3
                 기본결과 n)
*/
select deptno, decode(deptno, 10, 'ACCOUNTING',
                              20, 'RESEARCH',
                              30, 'SALES',
                              40, 'OPERATIONS')as dname from emp;

/*
     CASE : 조건에 따라 서로 다른 처리가 가능한 함수
     
             CASE 표현식 WHEN 조건1 THEN 결과1
                  표현식 WHEN 조건1 THEN 결과2
                  표현식 WHEN 조건1 THEN 결과3
                  ELSE 결과 n
             END
*/
select deptno, 
          CASE WHEN DEPTNO = 10 THEN 'ACCOUNTING'
               WHEN DEPTNO = 20 THEN 'RESEARCH'
               WHEN DEPTNO = 30 THEN 'SALES'
               WHEN DEPTNO = 40 THEN 'OPERATIONS'
          END DNAME from emp;


--문] 직급에 따라 보너스를 지급하기 위해 직급이 'MANAGER'인 사원은 15% 인상하고 
--    직급이 'CLERK'인 사원은 5%인상하도록 처리하시오 (DECODE 함수 사용)

select ename, job, sal,decode(job, 'MANAGER',sal*1.15,
                              'CLERK',sal*1.05,
                              'SALESMAN',sal*1,
                              'PRESIDENT',sal*1,
                              'ANALYST',sal*1
                              ) as "Up sal" from emp;


select ename, job, sal,
           CASE WHEN job ='MANAGER' THEN sal*1.15
                WHEN job ='CLERK' THEN sal*1.05
                ELSE sal
                END as "Up sal" from emp;








/*  그룹함수

*/


select * from emp;
select trunc(avg (sal)) from emp;
select max(sal),min(sal) from emp;
select count(*),count(comm) from emp;
select count(comm) from emp where deptno=30;

-- GROUP BY : 특정 컬럼값을 기준으로 테이블을 그룹별로 나누기 위해 사용
-- 형식 : select 컬럼명, 그룹함수 from 테이블명 where 조건식 group by 컬럼명

-- 사원들을 부서번호를 기준으로 3개
select deptno,sum(sal),trunc(avg(sal)),max(sal),min(sal) from emp group by deptno; 
select deptno ,trunc(avg(sal)) from emp group by deptno HAVING avg(sal)>=2000; -- 그룹의 조건 HAVING
select deptno ,max(sal),min(sal) from emp group by deptno having max(sal)>=2900;






select * from tab;
show user;

-- TABLESPACE 생성
create TABLESPACE firstbank
DATAFILE 'C:\app\oradata\orcl\first01.dbf' SIZE 10M;


-- TABLESPACE 수정
ALTER  TABLESPACE firstbank
add DATAFILE 'C:\app\oradata\orcl\first02.dbf' SIZE 1M;


-- 데이터파일(DATABASE)의 크기 변경
ALTER DATABASE 
DATAFILE 'C:\app\oradata\orcl\first02.dbf' RESIZE 10M;


-- 데이터파일 크기 자동화
ALTER DATABASE
DATAFILE 'C:\app\oradata\orcl\first01.dbf'
AUTOEXTEND ON
NEXT 1M
MAXSIZE 20;


-- TABLESPACE 삭제
DROP TABLESPACE firstbank;
-- 데이터파일도 같이 삭제
DROP TABLESPACE firstbank INCLUDING CONTENTS AND DATAFILES;

select tablespace_name, status, contents from dba_tablespaces;

/*
    create table 자료형
    컬럼명 데이터자료형,
    컬럼명 데이터자료형,
    컬럼명 데이터자료형,
    컬럼명 데이터자료형
    
    char : 고정길이 문자 데이터 최소 크기는 1, 최대 2000byte
    varchar2 : 가변길이 문자 데이터 실제입력된 문자열의 길이만큼 저장함 최소크기 1, 최대크기 4000byte
    number : 숫자형 데이터 저장, 최대 40자리까지 저장할 수 있음, 소수점이나 부호는 길이에 포함시키지 않음
    number(w) : 지정한 자리까지 수치로 최대 38자리까지 가능함.
    number(w,d) : w는 전체자리수, d는 소수점이하 자리수이며 소수점은 자리수에 포함되지 않음.
    date : 날짜 데이터를 저장(기원전,기원후)
    long : 가변길이 문자형 데이터 타입, 최대크기 : 2GByte
    lob : 2GB까지의 가변길이 바이너리 데이터를 저장시킴(바이너리데이터 : 이미지, 실행파일, 여러 문서파일)
    rowid : 데이터베이스에 저장되어 있지 않으며 데이터베이스 데이터도 아니다.
*/


/*
   테이블명과 컬럼명을 부여하기 위한 규칙
    - 반드시 문자로 시작해야한다.
    - 1~30자 까지 가능하다.
    - A ~ Z 까지 대소문자, 0 ~ 9 숫자, 특수문자(_,$,#)만 가능함
    - 공백을 허용하지않음
    - 예약어나 테이블명 중복 불가
*/
select * from emp;

create table emp01(
empno number(4),
ename varchar2(20),
sal number(7,2)
);
desc emp01;


