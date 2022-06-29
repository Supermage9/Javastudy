create user javauser identified by java;

grant connect, RESOURCE to javauser;

REVOKE connect, resource from javauser;

grant create view TO SCOTT;



create tablespace scott_data datafile 'c:\ora\scott_data.dbf' size 10m;

create user backupuser IDENTIFIED by backup1234 default TABLESPACE scott_data;

grant connect, resource to backupuser;

commit;
