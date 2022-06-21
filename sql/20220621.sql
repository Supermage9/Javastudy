select * from dept;

select deptno, dname from dept;

select * from emp;

/*  emp ���̺��� ��� �̸�, �޿�, �Ի��ϸ��� ����ϴ� �������� �ۼ��Ͻÿ�
*/

select ename as"����̸�", sal as"�޿�", hiredate"�Ի���" from emp;

-- ��Ī : �÷��� ����� �ٷ� �ڿ� as��� �� �� ��Ī�� ����Ѵ�.
-- ��Ī���� ���鹮��, Ư������($, _, #)�� ���ڸ� ǥ���ϰ� �Ͱų� ��ҹ��ڸ� �����ϰ� ������
-- ""�� ����Ͽ� ����Ѵ�.
-- as�� �����ϰ� ""�� ����Ͽ� ��Ī�� ����ϴ� ���� �����ϴ�.

select deptno"DepartmentNo", dname"DepartmentName" from dept;

-- DISTINCT : �ߺ��� �����͸� �ѹ��� ����Ҷ� ���
select DISTINCT job from emp;
select DISTINCT deptno from emp;

-- where ���ǰ� �񱳿�����
-- select column from table where ���ǹ�;
-- �񱳿����� : =,>,<,<=,>=, (<>, !=, ^=)�����ʴ�

-- ex)�޿��� 3000�̻� �޴� ����� ������� �����ȣ, ����̸�, �޿��� ����Ͻÿ�.
select ename,empno,sal from emp where sal>=3000;

--��1) ������̺��� �μ���ȣ�� 10�� ����� ���� ��� ������ ����϶�
select * from emp where deptno=10;

--��2) ������̺��� �޿��� 2000 �̸��� ����� ���� �����ȣ,�̸�,�޿��� ���
select EMPNO,ename,sal from emp where sal<2000;

/*
���� ������ ��ȸ
 - ���� �����ʹ� �ݵ�� �̱����� �ȿ� ǥ���ϰ� ��ҹ��ڸ� �����Ѵ�.
*/
select * from emp;

select * from emp where ename='SCOTT';
-- ��1 ����̸��� MILLER�� ����� ��ȣ�� �̸� ������ ���
select empno, ename, job from emp where ename='MILLER';

-- �Ի����� 85�� ������ ����� �̸�, �Ի��� ���
select ename, hiredate from emp where hiredate>='85/01/01';

/*
��������
AND : �ΰ��� ������ ��� �����ؾ� �˻�����
OR : �ΰ��� ������ �ϳ��� �����ص� �˻�����
NOT : ���ǿ� �������� ���ϴ� �͸� �˻�
BETWEEN AND : Ư�� ���� ���� ���ϴ� �����͸� �˻��ϰ��� �Ҷ� ���
IN : ������ �÷��� ������ ���� �ϳ����� �˾ƺ����� �� �� �����.
*/
--�μ���ȣ�� 10���̰�, ������ MANAGER�� ����� ������ ���
select * from emp where deptno=10 and job='MANAGER';


--�޿��� 1000���� 3000������ ������� ���� ���
select * from emp where sal<=3000 and sal>=1000;
select * from emp where sal BETWEEN 1000 and 3000;


-- �μ���ȣ�� 10���̰ų� ������ MANAGER�� ��� ���� ���
select * from emp where deptno=10 or job='MANAGER'; 


--�����ȣ�� 7844 �̰ų� 7654 �̰ų� 7521�� ����� ���� ���
select * FROM emp where empno=7844 or empno=7654 or empno=7521;
select * from emp where empno in (7844,7654,7521);

/* 
LIKE ������
 - �˻��ϰ��� �ϴ� ���� ��Ȯ�� �𸦰�� ���ϵ�ī��� �Բ� ����Ͽ�
   ���ϴ� ������ �˻��ϴ� ������.
   
   ���ϵ�ī��
   % : ���ڰ� ���ų�, �ϳ��̻��� ���ڰ� � ���� ���� �������.
   _ : �ϳ��� ���ڰ� � ���� ���� �������.
*/
-- K�� �����ϴ� ����� �˻��Ͽ� ���� ���
select ename from emp where ename like 'K%';
-- %�� ��� ���ڰ� ���� �������.

-- �̸��� K�� ���� ��� ���
select ename from emp where ename like '%k%';

-- �̸��� �ι�° ���� A�� ��� ���� ���
select ename from emp where ename like'_A%';

-- �̸��� A�� ���� �ʴ� ��� ���� ���
select ename from emp where ename not like'%A%';

-- null�� ����� ���� is ������ ���. = �� ���Ұ�.
select comm from emp where comm is not null;

/*
NULL�� ���� ������
 ����Ŭ������ �÷��� NULL���� ����Ǵ� ���� �����.
 NULL�� ��Ȯ��, �� �� ���� ���� �ǹ���.
 0�� ������� �ƴ� � ���� �����ϱ�� ������ � ������ �˾Ƴ� �� ���� ���� �ǹ���.
 NULL�� ����, �Ҵ�, �񱳰� �Ұ����ϴ�.
 
 is NULL�� is not NULL
 - Ư�� �÷� ������ ���� ��쿡�� �񱳿�����(=)�� ������� �ʰ� is null �����ڸ� �����.
 - null���� �ƴ����� �˾ƺ����� �Ҷ��� �񱳿����� (<>)�� ������� �ʰ� is not NULL �����ڸ� �����
 
 is null : null�̸� ����
 is not null : null�� �ƴϸ� ����
 
*/
select 100 + null from dual;
--Ŀ�̼��� ���� �ʴ� ���
select ename, comm from emp where comm is null;
--Ŀ�̼��� �޴� ���
select ename, comm from emp where comm is not null;

select * from emp;
-- �ڽ��� ���ӻ���� ���� ����� �̸��� ���ް� ���ӻ���� �����ȣ�� ����Ͻÿ�
select ename,job,empno,mgr from emp where mgr is null;

/*
������ ���� order by ��

order by ���� �ο�(��)�� �����ϴµ� ���
������ �ǵڿ� ����ϸ� ������ ������ �Ǵ� �÷� �̸� �Ǵ� select ������ ��õ� ��Ī�� �����

  ����          ��������(asc)         ��������(desc)
  ����          ���� ������ ����       ū ������ ����
  ����          ���� ������ ����       ������ �ݴ������ ����
  ��¥          ���� ��¥ �������      ���� ��¥ �������
  NULL         ���� �������� ����      ���� ���� ����
  
  �������� ��� �ҹ��ڸ� ���� ū������,null���� ��� ���� ���� ���� ������ �ν���
*/

-- �����ȣ�� �������� �������� �����Ͻÿ�
--���������϶��� asc ���̵� �ڵ��ν�
select empno from emp ORDER BY empno desc;

--��] �����ȣ, �̸�, �޿��� �޿��� ���������� ����Ͻÿ�
select empno,ename,sal from emp ORDER BY sal desc;

--��] �Ի����� ���� �ֱ��� ��������� �����ȣ, �̸�, �Ի����� ����Ͻÿ�
select empno,ename,hiredate from emp ORDER BY hiredate desc;

/*
sql                         sqlplus
���� ǥ�� DB���              ����Ŭ������ ����ϴ� ���
DB�� �����͸� ������ �� ����    DB�� �����͸� ������ �� ����.
��� ��ɾ��� ���� ;           ��� ��ɾ�� ����Ű�� ���� ����(;�� ����)
                            ��� ������ ��� �̾��� ��� -(������)�� �߰���
��� ��� �Ұ�                ��� ��� ����                            
*/

/*
������ �Լ�
   - �ึ�� �Լ��� ����Ǿ� ����� �ݿ��ϴ� �Լ�
   
   �����Լ� : ���ڿ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   �����Լ� : ���ڰ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   ��¥�Լ� : ��¥���� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
   ��ȯ�Լ� : ����,����,��¥���� ���� �ٸ� Ÿ������ ��ȯ�Ͽ� ��Ÿ��
   �Ϲ��Լ� : ��Ÿ�Լ�
   
�׷��Լ�
  - �ϳ� �̻��� ���� �׷����� ���� �����Ͽ� �ϳ��� ����� ��Ÿ��
  SUM : �׷��� ���� �հ踦 ����
  AVG : �׷��� ����� ����
  COUNT : �׷��� �� ����� ����
  MAX : �׷��� �ִ밪�� ����
  MIN : �׷��� �ּҰ��� ����
  STDDEV : �׷��� ǥ�������� ����
  VARIANCE : �׷��� �л��� ����
*/

/* �����Լ� : ���ڿ��� �ٸ� ���·� ��ȯ�Ͽ� ��Ÿ��
            �������� ���� �����Ͽ� ��ȯ�� ���� ���� ��ȯ��
            
     LOWER : �ҹ��ڷ� ��ȯ
     UPPER : �빮�ڷ� ��ȯ
     INITCAP : ù���ڸ� �빮�ڷ� ��ȯ
     CONCAT : ���ڰ��� ����
     SUBSTR : ���ڸ� �߶� ����
     SUBSTRB : ���ڸ� �߶� ����
     LENGTH : ������ ���̸� ��ȯ
     LENGTHB : ������ ���̸� ��ȯ
     INSTR : Ư�� ������ ��ġ���� ��ȯ
     INSTRB : Ư�� ������ ��ġ���� ��ȯ
     LPAD,RPAD : �Է¹��� ���ڿ��� ��ȣ�� �����Ͽ� Ư�� ���ڿ��� ���̸� ��ȯ
     TRIM : �߶󳻰� ���� ���ڸ� ǥ����
     CONVERT : ���� ���� ��ȯ
     CHR : ASCII �ڵ� ������ ��ȯ
     ASCII : ASCII �ڵ尪�� ���ڷ� ��ȯ
     REPLACE : ���ڿ����� Ư�� ���ڸ� ����
*/
--LOWER
select 'DataBase',LOWER('DataBase') from dual;
select ename,LOWER(ename) from emp;

--UPPER
select empno,ename,job from emp where job=upper('manager');

--INITCAP
select INITCAP('DATA BASE PROGRAMMING') from dual;

--��] ������̺��� 10���μ� �Ҽ� ����� �̸��� ù���ڸ� �빮�ڷ� 
select empno,INITCAP(ename) from emp where deptno=10;

--��] 'Smith'�� �̸��� ����� ���, �̸�, �޿��� Ŀ�̼� ���
select empno,ename,sal,comm from emp where INITCAP(ename)='Smith';
