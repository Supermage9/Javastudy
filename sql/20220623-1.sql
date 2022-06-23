-- ���� ��ĥ�� �������� ��¥�� ����Ͽ� ����Ͻÿ�.

-- TO_DATE
select sysdate -'2022/01/01' from dual; -- �����߻�
select trunc(sysdate-TO_DATE('2022/01/01','YYYY/MM/DD')) from dual;


/*
�Ϲ��Լ�(��Ÿ�Լ�)

NVL    : ù��° ���ڷ� ���� ���� NULL�� ������ �� ��° ���� ������ ����
DECODE : ù��° ���ڷ� ���� ���� ���ǿ� ���� ����(if���� ����)
CASE   : ���ǿ� �´� ������ ������(switch-case�� ����) 

*/

-- NVL : NULL���� �ٸ� ������ ��ȯ�ϴ� �Լ�
--       NULL�� 0 �Ǵ� �ٸ� ������ ��ȯ�ϱ� ���� ����ϴ� �Լ�

select ename, sal, comm, job from emp order by job;

--������ ����ϱ� ���ؼ� �޿��� 12�� ���� �� Ŀ�̼��� ���غ���?
select ename, sal, comm, sal*12, sal*2+comm from emp order by job; -- null�� ����Ŀ��� null�̱� ������ 0���� �ٲ���� ��

select ename, sal, sal*12, sal*2+NVL(comm,0) from emp order by job; -- NVL(NULL��, �ٲܰ�)

desc emp;
select ename, NVL(to_CHAR(mgr,'9999'),'CEO') from emp ORDER BY JOB;


select deptno from emp;
select distinct(deptno) from emp;
select deptno, dname from dept;
select * from emp;

/*
   ���ǿ� �´� ������ �����ϱ� ���� �Լ�
   switch case���� ���� �������� ��쿡 ���� ������ �� �ִ� �Լ�
   DECODE(ǥ����, ����1, ���1,
                 ����2, ���2,
                 ����3, ���3
                 �⺻��� n)
*/
select deptno, decode(deptno, 10, 'ACCOUNTING',
                              20, 'RESEARCH',
                              30, 'SALES',
                              40, 'OPERATIONS')as dname from emp;

/*
     CASE : ���ǿ� ���� ���� �ٸ� ó���� ������ �Լ�
     
             CASE ǥ���� WHEN ����1 THEN ���1
                  ǥ���� WHEN ����1 THEN ���2
                  ǥ���� WHEN ����1 THEN ���3
                  ELSE ��� n
             END
*/
select deptno, 
          CASE WHEN DEPTNO = 10 THEN 'ACCOUNTING'
               WHEN DEPTNO = 20 THEN 'RESEARCH'
               WHEN DEPTNO = 30 THEN 'SALES'
               WHEN DEPTNO = 40 THEN 'OPERATIONS'
          END DNAME from emp;


--��] ���޿� ���� ���ʽ��� �����ϱ� ���� ������ 'MANAGER'�� ����� 15% �λ��ϰ� 
--    ������ 'CLERK'�� ����� 5%�λ��ϵ��� ó���Ͻÿ� (DECODE �Լ� ���)

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








/*  �׷��Լ�

*/


select * from emp;
select trunc(avg (sal)) from emp;
select max(sal),min(sal) from emp;
select count(*),count(comm) from emp;
select count(comm) from emp where deptno=30;

-- GROUP BY : Ư�� �÷����� �������� ���̺��� �׷캰�� ������ ���� ���
-- ���� : select �÷���, �׷��Լ� from ���̺�� where ���ǽ� group by �÷���

-- ������� �μ���ȣ�� �������� 3��
select deptno,sum(sal),trunc(avg(sal)),max(sal),min(sal) from emp group by deptno; 
select deptno ,trunc(avg(sal)) from emp group by deptno HAVING avg(sal)>=2000; -- �׷��� ���� HAVING
select deptno ,max(sal),min(sal) from emp group by deptno having max(sal)>=2900;






select * from tab;
show user;

-- TABLESPACE ����
create TABLESPACE firstbank
DATAFILE 'C:\app\oradata\orcl\first01.dbf' SIZE 10M;


-- TABLESPACE ����
ALTER  TABLESPACE firstbank
add DATAFILE 'C:\app\oradata\orcl\first02.dbf' SIZE 1M;


-- ����������(DATABASE)�� ũ�� ����
ALTER DATABASE 
DATAFILE 'C:\app\oradata\orcl\first02.dbf' RESIZE 10M;


-- ���������� ũ�� �ڵ�ȭ
ALTER DATABASE
DATAFILE 'C:\app\oradata\orcl\first01.dbf'
AUTOEXTEND ON
NEXT 1M
MAXSIZE 20;


-- TABLESPACE ����
DROP TABLESPACE firstbank;
-- ���������ϵ� ���� ����
DROP TABLESPACE firstbank INCLUDING CONTENTS AND DATAFILES;

select tablespace_name, status, contents from dba_tablespaces;

/*
    create table �ڷ���
    �÷��� �������ڷ���,
    �÷��� �������ڷ���,
    �÷��� �������ڷ���,
    �÷��� �������ڷ���
    
    char : �������� ���� ������ �ּ� ũ��� 1, �ִ� 2000byte
    varchar2 : �������� ���� ������ �����Էµ� ���ڿ��� ���̸�ŭ ������ �ּ�ũ�� 1, �ִ�ũ�� 4000byte
    number : ������ ������ ����, �ִ� 40�ڸ����� ������ �� ����, �Ҽ����̳� ��ȣ�� ���̿� ���Խ�Ű�� ����
    number(w) : ������ �ڸ����� ��ġ�� �ִ� 38�ڸ����� ������.
    number(w,d) : w�� ��ü�ڸ���, d�� �Ҽ������� �ڸ����̸� �Ҽ����� �ڸ����� ���Ե��� ����.
    date : ��¥ �����͸� ����(�����,�����)
    long : �������� ������ ������ Ÿ��, �ִ�ũ�� : 2GByte
    lob : 2GB������ �������� ���̳ʸ� �����͸� �����Ŵ(���̳ʸ������� : �̹���, ��������, ���� ��������)
    rowid : �����ͺ��̽��� ����Ǿ� ���� ������ �����ͺ��̽� �����͵� �ƴϴ�.
*/


/*
   ���̺��� �÷����� �ο��ϱ� ���� ��Ģ
    - �ݵ�� ���ڷ� �����ؾ��Ѵ�.
    - 1~30�� ���� �����ϴ�.
    - A ~ Z ���� ��ҹ���, 0 ~ 9 ����, Ư������(_,$,#)�� ������
    - ������ �����������
    - ���� ���̺�� �ߺ� �Ұ�
*/
select * from emp;

create table emp01(
empno number(4),
ename varchar2(20),
sal number(7,2)
);
desc emp01;


