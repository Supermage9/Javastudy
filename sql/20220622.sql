-- �����Լ� : ������ �����͸� �����Ͽ� ��ȯ�� ���� ���� ��ȯ�ϴ� �Լ�
-- abs, cos, exp, floor, log, power, sign, trunc, round, mod

select abs(-15) from dual;
 
-- �ﰢ�Լ�
select cos() from dual;
select sin() from dual;
select tan() from dual;

select floor(34.5678) from dual; -- ������

select trunc(12.345,-1) from dual;


-- Ư�� �ڸ����� �ݿø��ϴ� �Լ�(round)
-- round (���, ǥ���� �ڸ���)
select 
round (35.12,1), -- �Ҽ��� ���� 2��° �ڸ����� �ݿø�, �Ҽ������� ���ڸ����� ǥ��
round(21.125,2), -- �Ҽ������� 3��° �ڸ����� �ݿø�
round(47.51), -- 0��° �ڸ����� �ݿø� �Ҽ����� 1�ڸ� �ݿø� ��
round(834.12,-1), -- �ι�° ���ڰ��� �����̸� ���� �ڸ����� �ݿø���
round(653.54,-2)  -- ���� �ڸ����� �ݿø�
from dual;


-- power : ����
select power(3,2) from dual;

-- mod : ������
select mod(34,5) from dual;

-- ��] ����� ¦���� ������� �����ȣ, �̸�, ������ ���
select empno,ename,job from emp where mod(empno,2)=0;





-- ��¥�Լ� : ��¥���� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
-- sysdate, months_betweens, add_months, next_day, last_day, round, trunc

select sysdate+1 from dual;

-- ��] �μ���ȣ�� 10�� ����� ������� �Ի��� ���κ��� ���ñ��� ��ĥ�� �����°�?
select ename,sysdate-hiredate from emp where deptno=10;

-- months_between �� ��¥ ������ ������
select sysdate, hiredate,MONTHS_BETWEEN(SYSDATE,hiredate) from emp where deptno=10;

-- add_months ��¥�� �������� ����
select hiredate,ADD_MONTHS(hiredate,3) from emp;

-- next_day ����,���� ���Ͽ� �ش��ϴ� ���� ��¥ ���
select sysdate, next_day(sysdate,'wednesday') from dual;
ALTER SESSION SET NLS_LANGUAGE = AMERICAN; -- �����϶�
ALTER SESSION SET NLS_LANGUAGE = KOREAN; -- �ѱ��϶�

-- last_day : �ش� ���� ������ ��¥�� ��ȯ
SELECT sysdate, last_day(sysdate) from dual;

-- trunc  : ��¥�� �߶�
select hiredate from emp where deptno=10;
select hiredate,trunc(hiredate,'MONTH')from emp where deptno=10;

-- round : �Լ��� ����(����) ���� �����ϸ� ���� �̿��� ��¥�� ���ؼ��� �ݿø��� ������ �� �ִ�.
-- round(date,'MONTH');
-- �Ի����� �� �������� �ݿø�
select hiredate from emp where deptno=10;
select hiredate,round(hiredate,'MONTH')from emp where deptno=10; 

-- �� : 7�� 1�Ϻ��� �ݿø�
-- �� : 16���� �������� �ݿø�
-- �� : �� �ְ� ���۵Ǵ� ��¥�� �������� �ݿø�
-- �ð� : ���� �������� �ݿø�

/*
��ȯ�Լ� : �ڷ����� ��ȯ��Ű���� �Ҷ� ����ϴ� �Լ�

  TO_CHAR : ��¥�� �Ǵ� �������� ���������� ��ȯ�ϰ��� �Ҷ�
  TO_DATE : �������� ��¥������ ��ȯ�ϰ��� �Ҷ�
  TO_NUMBER : �������� ���������� ��ȯ�ϰ��� �Ҷ�
  
*/

/* TO_CHAR (��¥ ������, '�������')

  ������� ����
    YYYY : �⵵ ǥ��(4�ڸ�)
    YY : �⵵ ǥ��(2�ڸ�) 
    MM : �� ǥ��
    MON : ���� ���ĺ����� ǥ��
    DD : �� ǥ��
    DAY : ���� ǥ��
    DY : ���� ��� ǥ��
*/
select hiredate,TO_CHAR(hiredate,'YYYY/MM/DD') from emp where deptno=20;
select sysdate,TO_CHAR(sysdate,'YYYY/MON/DD DaY') from dual;

/*
�ð� ��� ����

AM �Ǵ� PM : ����, ����
A.M �Ǵ� P.M : ����, ����
HH �Ǵ� HH12 : �ð�(1~12)
HH24 : �ð�(1~24��)(0���� 23)
MI : ��
SS : ��

*/
select to_char(sysdate,'YYYY/MM/DD, HH12:MI:SS')from dual;

/*
   to_char : �������� ���������� ��ȯ
   
   ���� �������
    0 : �ڸ����� ��Ÿ���� �ڸ����� ���� ���� ��� 0���� ä���.
    9 : �ڸ����� ��Ÿ���� �ڸ����� ���� �ʾƵ� ä���� �ʴ´�.
    L : �� ������ ��ȭ ��ȣ�� �տ� ǥ���Ѵ�. $,��,��
    . : �Ҽ���
    , : õ ���� �ڸ� ����
    
    ����              ����                ���
    
    12345.67      999,999,999        12,345.67
    12345.67      99999              12345
    12345.67      $999,999,999       $12,345.67
    12345.67      L999,999,999       ��12,345.67
    12345.67      S999,999,999       +12,345.67
*/

select ename,sal from emp where deptno=10;
select ename,sal,to_char(sal,'$999,999')from emp where deptno=10;

select * from emp;


