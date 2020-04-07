-- <0407> hw

-- 1. �μ���ġ�� CHICAGO�� ��� ����� ���� �̸�,����,�޿� ����ϴ� SQL�� �ۼ��ϼ���.
select ename, job, sal 
from emp inner join dept
on emp.deptno = dept.deptno
where emp.deptno = (select deptno from dept where loc = "CHICAGO");


-- 2. ���������� ���� ����� �����ȣ,�̸�,����,�μ���ȣ ����ϴ� SQL�� �ۼ��ϼ���. (?)
select empno, ename, job, deptno
from emp
where empno not in (select mgr from emp where mgr is not null);


-- 3. BLAKE�� ���� ��縦 ���� ����� �̸�,����,����ȣ ����ϴ� SQL�� �ۼ��ϼ���.
select ename, job, mgr from emp
where mgr = (select mgr from emp where ename = 'blake');

-- 4. �Ի����� ���� ������ ��� 5���� �˻��ϼ���.
select * from emp
order by hiredate limit 5
;

-- 5. JONES �� ���� ������ �̸�, ����, �μ����� �˻��ϼ���.
select ename, job, dname
from emp, dept
where mgr = (select empno from emp where ename = 'jones')
and emp.deptno = dept.deptno;