-------------------------  STRAT DML(������ ���۾�)  -----------------------------

/*
   ���ο� ���� �߰��ϴ� INSERT INTO  (C)
   ���� ��ȸ�ϴ� SELECT             (R)
   ���� ���� �����ϴ� UPDATE SET     (U)
   ���� �����ϴ� DELETE             (D)
*/
-------------------------------------------------------------------------------
/*  ���ο� ���� �߰��ϴ� INSERT INTO (C)
   
     Ư���� �÷����� �����͸� �Է��ϴ� ���
     INSERT INTO ���̸�(�÷���1, �÷���2) VALUES(��1, ��2);
     
     ��� �÷��� �����͸� �Է��ϴ� ���
     INSERT INTO ���̺�� VALUES (��1, ��2);
*/

create table dept01( 
                     deptno number(2),
                     dname varchar2(14),
                     loc varchar2(13)
                   );            
-- �μ���ȣ :10, �μ��� : ACCOUNTING, ���� : NEW YORK �� �߰��Ͻÿ�
insert into dept01(deptno,dname,loc)values(10,'ACCOUNTING','NEW YORK');
insert into dept01 values(20,'RESEARCH','DALLAS');
insert into dept01(deptno,dname) values(30,'SALES'); -- �Է����� ���� �÷��� �ڵ����� null���� ��



INSERT INTO DEPT(deptno) values(null);
-- ���̺� ���� �� ����
create table dept02 as select * from dept;

-- emp04 ���̺����
create table emp04(
                   deptno number(2) not null,
                   dname varchar2(14),
                   loc varchar2(13)
                  );
-- �� ����        
insert into emp04 values(10,null,null);
insert into emp04 values(20,'','');

select * from tab;
-------------------------------------------------------------------------------
-- ����
/*
   ���� ���� �����ϴ� UPDATE SET (U)
   
     ����
     UPDATE ���̺�� SET �÷���1 = ��1, �÷���2 = ��2 where ���ǽ�
     
     � ���� �����͸� �����ϴ��� where���� �̿��Ͽ� ������ ����
     where���� ������� ������ ���̺� �ִ� ��� ���� ������
*/


create table emp01 as select * from emp;
select * from emp01;

--��� ����� �μ���ȣ�� 30������ ����
update emp01 set deptno=30;
rollback;

-- ��� ����� �޿��� 10% �λ�
update emp01 set sal=sal*1.1;

-- ��� ����� �Ի����� ���÷�
update emp01 set hiredate = sysdate;

-- 1987�⿡ �Ի��� ����� �Ի����� ���÷� ����
select * from emp01 where substr(hiredate,1,2)='87';
update emp01 set hiredate = sysdate where substr(hiredate,1,2)='87';
select * from emp01;

-- SCOTT ����� �μ���ȣ�� 10, ������ MANAGER�� ����
select deptno, job from emp01 where ename='SCOTT';
update emp01 set deptno =10 , job = 'MANAGER' where ename = 'SCOTT';  --���氪�� 2�� �̻��϶� ,�� �����ϰ� ������ 2���̻��϶��� and�� ����

/*
    DELETE
     ���̺� Ư�� ���� ������ ��
     
    ����
     DELETE FROM ���̺�� where ����
*/
create table dept01 as select * from dept;
select * from dept01;
delete from dept01 where deptno=30;
rollback;
-- �÷� ���� : ALTER DROP , ���̺���� DROP, �� ���� DELETE, TRUNCATE


-------------------- DML �� --------------------------------------

/*
   Ʈ����� (Transaction)
     - �����ͺ��̽����� �����͸� ó���ϴ� �ϳ��� ������ �۾������� �ǹ���
     - Ʈ������� ����ϴ� ���� : 1.�������� �ϰ����� ����
                              2.���������� �����͸� ������Ű�� ����
      insert, update, delete ���                         
    
      commit �� rollback
      commit
       - ��� �۾��� ���������� ó���ϰڴٰ� Ȯ���ϴ� ��ɾ�
         Ʈ����� ó�� ������ �����ͺ��̽��� ��� �ݿ���(����� ������ ��� ��������)
         
      rollback
       - �۾��� ������ �߻��Ǿ Ʈ����� ó�� �������� �߻��� ��������� ����ϴ� ���
         ������ ó���� ���۵Ǳ� ���� ���·� �ǵ���
         
         ���������� commit ��� ���ĺ��� ���ο� commit ����� �����ϴ� �������� �����
         ��� DML��ɵ��� �ǹ���.
*/

drop table dept01;

create table dept01 as select * from dept;
select * from dept01;

delete from dept01;
rollback;

delete from dept01 where deptno=20;

commit; -- �ѹ� Ŀ���Ŀ� �ѹ��ص� �Ȼ�Ƴ�.


/*
   savepoint
     - ���� Ʈ������� �۰� ������ �� �ִ�.
       ����� savepoint�� rollback to savepoint ���� ����Ͽ� ǥ���� ������
       rollback �� �� ����
       
     ����
       Ư�� ��ġ�� �����ϴ� ����
       savepoint ���̺��
       
       �����س��� Ư�� ��ġ�� �ǵ��ư��� ����
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


