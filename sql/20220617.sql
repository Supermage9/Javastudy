SELECT * FROM emp;
--���̺� ��ȸ 

--���̺� ���� Ȯ�� ���
desc emp;
/*
����Ŭ �ڷ���
 ������ ������
NUMBER(ũ������) : �⺻ ũ��� 4byte
DATE ��¥�� : ��,��,��,��,��,��,����

 ������ ������
VARCHAR2(ũ������) : 
CHAR(ũ������) : �ѹ� ������ ũ������� ������ ����.


 SELECT : �����ͺ��̽� ���� �ִ� �����͸� ��ȸ�ϱ� ���� ����̴�.
  * : ��� �÷�(��)�� �ǹ���.
 Ư�� �÷� (�̸�,��ȣ) empno,ename
*/
SELECT empno,ename,sal from emp;
-- from : ���̺� �����Ҷ� from �������� ���̺�� ����

SELECT * FROM dept;
SELECT * from emp;
-- emp ���̺��� �����(ename)�� �޿�(sal)�� �Ի���(hiredate)�� ����ϴ� �������� �ۼ��Ͻÿ�.

SELECT ename,sal,hiredate from emp;

-- ��������� : +, -, *, / 4��

SELECT ename,sal*12 from emp;

SELECT ename,sal,sal*12 from emp;

/*
NULL�� �������̴�.
NULL�� �ǹ� : 
             1. 0�� �ƴϰ�
             2. �� ������ �ƴϰ�
             3. ��Ȯ�� ���� �ǹ���.
             4. � ������ �� �� ������ � ���� �����ϰ� �ִ�.
             5. ? Ȥ�� �� �� �ǹ̵� ����.
             6. ����, �Ҵ�, �񱳰� �Ұ����ϴ�.

*/
100+?
SELECT 100+? from dual;

desc dual;

/*
dual ���̺�
- �� ������ ����� ����ϱ� ���� ���̺�
DUMMY �÷����� �Ѱ��� ���ڸ��� ������ �� �ִ� x��� ���� ����
�� �ϳ��� �ุ�� ������.
*/

select * from dept;
select 24*60*60 from dual;

desc dual;
desc dept;
