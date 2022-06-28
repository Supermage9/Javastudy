create user javauser identified by java;

grant connect, resource to javauser;

REVOKE connect, resource from javauser;

grant create view TO SCOTT;