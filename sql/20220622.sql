-- 숫자함수 : 숫자형 데이터를 조작하여 변환된 숫자 값을 반환하는 함수
-- abs, cos, exp, floor, log, power, sign, trunc, round, mod

select abs(-15) from dual;
 
-- 삼각함수
select cos() from dual;
select sin() from dual;
select tan() from dual;

select floor(34.5678) from dual; -- 정수형

select trunc(12.345,-1) from dual;


-- 특정 자리순서 반올림하는 함수(round)
-- round (대상, 표시할 자리수)
select 
round (35.12,1), -- 소수점 이하 2번째 자리에서 반올림, 소수점이하 한자리까지 표시
round(21.125,2), -- 소수점이하 3번째 자리에서 반올림
round(47.51), -- 0번째 자리에서 반올림 소수이하 1자리 반올림 함
round(834.12,-1), -- 두번째 인자값이 음수이면 일의 자리에서 반올림함
round(653.54,-2)  -- 십의 자리에서 반올림
from dual;


-- power : 제곱
select power(3,2) from dual;

-- mod : 나머지
select mod(34,5) from dual;

-- 문] 사번이 짝수인 사원들의 사원번호, 이름, 직급을 출력
select empno,ename,job from emp where mod(empno,2)=0;





-- 날짜함수 : 날짜값을 다른 형태로 변환하여 나타냄
-- sysdate, months_betweens, add_months, next_day, last_day, round, trunc

select sysdate+1 from dual;

-- 문] 부서번호가 10인 사원을 대상으로 입사한 날로부터 오늘까지 며칠이 지났는가?
select ename,sysdate-hiredate from emp where deptno=10;

-- months_between 두 날짜 사이의 개월수
select sysdate, hiredate,MONTHS_BETWEEN(SYSDATE,hiredate) from emp where deptno=10;

-- add_months 날짜에 개월수를 더함
select hiredate,ADD_MONTHS(hiredate,3) from emp;

-- next_day 숫자,문자 요일에 해당하는 다음 날짜 출력
select sysdate, next_day(sysdate,'wednesday') from dual;
ALTER SESSION SET NLS_LANGUAGE = AMERICAN; -- 영어일때
ALTER SESSION SET NLS_LANGUAGE = KOREAN; -- 한글일때

-- last_day : 해당 달의 마지막 날짜를 반환
SELECT sysdate, last_day(sysdate) from dual;

-- trunc  : 날짜도 잘라냄
select hiredate from emp where deptno=10;
select hiredate,trunc(hiredate,'MONTH')from emp where deptno=10;

-- round : 함수에 형식(포맷) 모델을 지정하면 숫자 이외의 날짜에 대해서도 반올림을 적용할 수 있다.
-- round(date,'MONTH');
-- 입사일을 월 기준으로 반올림
select hiredate from emp where deptno=10;
select hiredate,round(hiredate,'MONTH')from emp where deptno=10; 

-- 년 : 7월 1일부터 반올림
-- 월 : 16일을 기준으로 반올림
-- 일 : 한 주가 시작되는 날짜를 기준으로 반올림
-- 시간 : 분을 기준으로 반올림

/*
변환함수 : 자료형을 변환시키고자 할때 사용하는 함수

  TO_CHAR : 날짜형 또는 숫자형을 문자형으로 변환하고자 할때
  TO_DATE : 문자형을 날짜형으로 변환하고자 할때
  TO_NUMBER : 문자형을 숫자형으로 변환하고자 할때
  
*/

/* TO_CHAR (날짜 데이터, '출력형식')

  출력형식 종류
    YYYY : 년도 표시(4자리)
    YY : 년도 표시(2자리) 
    MM : 월 표시
    MON : 월을 알파벳으로 표시
    DD : 일 표시
    DAY : 요일 표시
    DY : 요일 약어 표시
*/
select hiredate,TO_CHAR(hiredate,'YYYY/MM/DD') from emp where deptno=20;
select sysdate,TO_CHAR(sysdate,'YYYY/MON/DD DaY') from dual;

/*
시간 출력 형식

AM 또는 PM : 오전, 오후
A.M 또는 P.M : 오전, 오후
HH 또는 HH12 : 시간(1~12)
HH24 : 시간(1~24시)(0부터 23)
MI : 분
SS : 초

*/
select to_char(sysdate,'YYYY/MM/DD, HH12:MI:SS')from dual;

/*
   to_char : 숫자형을 문자형으로 변환
   
   숫자 출력형식
    0 : 자리수를 나타내며 자릿수가 맞지 않을 경우 0으로 채운다.
    9 : 자리수를 나타내며 자릿수가 맞지 않아도 채우지 않는다.
    L : 각 지역별 통화 기호를 앞에 표시한다. $,￦,￥
    . : 소수점
    , : 천 단위 자리 구분
    
    숫자              형식                결과
    
    12345.67      999,999,999        12,345.67
    12345.67      99999              12345
    12345.67      $999,999,999       $12,345.67
    12345.67      L999,999,999       ￦12,345.67
    12345.67      S999,999,999       +12,345.67
*/

select ename,sal from emp where deptno=10;
select ename,sal,to_char(sal,'$999,999')from emp where deptno=10;

select * from emp;


