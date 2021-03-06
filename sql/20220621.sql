select * from dept;

select deptno, dname from dept;

select * from emp;

/*  emp 테이블에서 사원 이름, 급여, 입사일만을 출력하는 쿼리문을 작성하시오
*/

select ename as"사원이름", sal as"급여", hiredate"입사일" from emp;

-- 별칭 : 컬럼을 기술한 바로 뒤에 as라고 쓴 후 별칭을 기술한다.
-- 별칭에는 공백문자, 특수문자($, _, #)등 문자를 표현하고 싶거나 대소문자를 구별하고 싶을때
-- ""을 사용하여 기술한다.
-- as를 생략하고 ""를 사용하여 별칭을 기술하는 것이 가능하다.

select deptno"DepartmentNo", dname"DepartmentName" from dept;

-- DISTINCT : 중복된 데이터를 한번만 출력할때 사용
select DISTINCT job from emp;
select DISTINCT deptno from emp;

-- where 조건과 비교연산자
-- select column from table where 조건문;
-- 비교연산자 : =,>,<,<=,>=, (<>, !=, ^=)같지않다

-- ex)급여가 3000이상 받는 사원을 대상으로 사원번호, 사원이름, 급여를 출력하시오.
select ename,empno,sal from emp where sal>=3000;

--문1) 사원테이블에서 부서번호가 10인 사원에 대한 모든 정보를 출력하라
select * from emp where deptno=10;

--문2) 사원테이블에서 급여가 2000 미만인 사원에 대해 사원번호,이름,급여를 출력
select EMPNO,ename,sal from emp where sal<2000;

/*
문자 데이터 조회
 - 문자 데이터는 반드시 싱글쿼터 안에 표시하고 대소문자를 구분한다.
*/
select * from emp;

select * from emp where ename='SCOTT';
-- 문1 사원이름이 MILLER인 사원의 번호와 이름 직급을 출력
select empno, ename, job from emp where ename='MILLER';

-- 입사일이 85년 이후인 사람의 이름, 입사일 출력
select ename, hiredate from emp where hiredate>='85/01/01';

/*
논리연산자
AND : 두가지 조건이 모두 만족해야 검색가능
OR : 두가지 조건중 하나만 만족해도 검색가능
NOT : 조건에 만족하지 못하는 것만 검색
BETWEEN AND : 특정 범위 내에 속하는 데이터를 검색하고자 할때 사용
IN : 동일한 컬럼이 여러개 값중 하나인지 알아보고자 할 때 사용함.
*/
--부서번호가 10번이고, 직급이 MANAGER인 사원의 정보를 출력
select * from emp where deptno=10 and job='MANAGER';


--급여가 1000에서 3000사이인 사원들의 정보 출력
select * from emp where sal<=3000 and sal>=1000;
select * from emp where sal BETWEEN 1000 and 3000;


-- 부서번호가 10번이거나 직급이 MANAGER인 사원 정보 출력
select * from emp where deptno=10 or job='MANAGER'; 


--사원번호가 7844 이거나 7654 이거나 7521인 사원의 정보 출력
select * FROM emp where empno=7844 or empno=7654 or empno=7521;
select * from emp where empno in (7844,7654,7521);

/* 
LIKE 연산자
 - 검색하고자 하는 값을 정확히 모를경우 와일드카드와 함께 사용하여
   원하는 내용을 검색하는 연산자.
   
   와일드카드
   % : 문자가 없거나, 하나이상의 문자가 어떤 값이 오든 상관없음.
   _ : 하나의 문자가 어떤 값이 오든 상관없음.
*/
-- K로 시작하는 사원을 검색하여 정보 출력
select ename from emp where ename like 'K%';
-- %는 몇개의 문자가 오든 상관없다.

-- 이름에 K가 들어가는 사원 출력
select ename from emp where ename like '%k%';

-- 이름의 두번째 글자 A인 사원 정보 출력
select ename from emp where ename like'_A%';

-- 이름에 A가 들어가지 않는 사원 정보 출력
select ename from emp where ename not like'%A%';

-- null을 사용할 때는 is 연산자 사용. = 은 사용불가.
select comm from emp where comm is not null;

/*
NULL을 위한 연산자
 오라클에서는 컬럼에 NULL값이 저장되는 것을 허용함.
 NULL은 미확정, 알 수 없는 값을 의미함.
 0도 빈공간도 아닌 어떤 값이 존재하기는 하지만 어떤 값인지 알아낼 수 없는 것을 의미함.
 NULL은 연산, 할당, 비교가 불가능하다.
 
 is NULL과 is not NULL
 - 특정 컬럼 값인지 비교할 경우에는 비교연산자(=)를 사용하지 않고 is null 연산자를 사용함.
 - null값이 아닌지를 알아보려고 할때는 비교연산자 (<>)를 사용하지 않고 is not NULL 연산자를 사용함
 
 is null : null이면 만족
 is not null : null이 아니면 만족
 
*/
select 100 + null from dual;
--커미션을 받지 않는 사원
select ename, comm from emp where comm is null;
--커미션을 받는 사원
select ename, comm from emp where comm is not null;

select * from emp;
-- 자신의 직속상관이 없는 사원의 이름과 직급과 직속상관의 사원번호를 출력하시오
select ename,job,empno,mgr from emp where mgr is null;

/*
정렬을 위한 order by 절

order by 절은 로우(행)를 정렬하는데 사용
쿼리문 맨뒤에 기술하며 정렬의 기준이 되는 컬럼 이름 또는 select 절에서 명시된 별칭을 사용함

  기준          오름차순(asc)         내림차순(desc)
  숫자          작은 값부터 정렬       큰 값부터 정렬
  문자          사전 순서로 정렬       사전의 반대순서로 정렬
  날짜          빠른 날짜 순서대로      늦은 날짜 순서대로
  NULL         가장 마지막에 나옴      가장 먼저 나옴
  
  영문자인 경우 소문자를 가장 큰값으로,null값은 모든 값중 가장 작은 값으로 인식함
*/

-- 사원번호를 기준으로 오름차순 정렬하시오
--오름차순일때는 asc 없이도 자동인식
select empno from emp ORDER BY empno desc;

--문] 사원번호, 이름, 급여를 급여가 높은순으로 출력하시오
select empno,ename,sal from emp ORDER BY sal desc;

--문] 입사일이 가장 최근인 사원순으로 사원번호, 이름, 입사일을 출력하시오
select empno,ename,hiredate from emp ORDER BY hiredate desc;

/*
sql                         sqlplus
국제 표준 DB언어              오라클에서만 사용하는 명령
DB의 데이터를 조작할 수 있음    DB의 데이터를 조작할 수 없다.
모든 명령어의 끝은 ;           모든 명령어는 엔터키에 의해 끝남(;도 가능)
                            명령 라인이 계속 이어질 경우 -(하이픈)을 추가함
약어 사용 불가                약어 사용 가능                            
*/

/*
단일행 함수
   - 행마다 함수가 적용되어 결과를 반영하는 함수
   
   문자함수 : 문자열을 다른 형태로 변환하여 나타냄
   숫자함수 : 숫자값을 다른 형태로 변환하여 나타냄
   날짜함수 : 날짜값을 다른 형태로 변환하여 나타냄
   변환함수 : 문자,숫자,날짜값을 서로 다른 타입으로 변환하여 나타냄
   일반함수 : 기타함수
   
그룹함수
  - 하나 이상의 행을 그룹으로 묶어 연산하여 하나의 결과로 나타냄
  SUM : 그룹의 누적 합계를 구함
  AVG : 그룹의 평균을 구함
  COUNT : 그룹의 총 계수를 구함
  MAX : 그룹의 최대값을 구함
  MIN : 그룹의 최소값을 구함
  STDDEV : 그룹의 표준편차를 구함
  VARIANCE : 그룹의 분산을 구함
*/

/* 문자함수 : 문자열을 다른 형태로 변환하여 나타냄
            문자형의 값을 조작하여 변환된 문자 값을 반환함
            
     LOWER : 소문자로 변환
     UPPER : 대문자로 변환
     INITCAP : 첫글자만 대문자로 변환
     CONCAT : 문자값을 연결
     SUBSTR : 문자를 잘라서 추출
     SUBSTRB : 문자를 잘라서 추출
     LENGTH : 문자의 길이를 반환
     LENGTHB : 문자의 길이를 반환
     INSTR : 특정 문자의 위치값을 반환
     INSTRB : 특정 문자의 위치값을 반환
     LPAD,RPAD : 입력받은 문자열과 기호를 정렬하여 특정 문자열의 길이를 반환
     TRIM : 잘라내고 남은 문자를 표시함
     CONVERT : 문자 셋을 반환
     CHR : ASCII 코드 값으로 변환
     ASCII : ASCII 코드값을 문자로 변환
     REPLACE : 문자열에서 특정 문자를 변경
*/
--LOWER
select 'DataBase',LOWER('DataBase') from dual;
select ename,LOWER(ename) from emp;

--UPPER
select empno,ename,job from emp where job=upper('manager');

--INITCAP
select INITCAP('DATA BASE PROGRAMMING') from dual;

--문] 사원테이블의 10번부서 소속 사원의 이름을 첫글자만 대문자로 
select empno,INITCAP(ename) from emp where deptno=10;

--문] 'Smith'란 이름의 사원의 사번, 이름, 급여와 커미션 출력
select empno,ename,sal,comm from emp where INITCAP(ename)='Smith';
