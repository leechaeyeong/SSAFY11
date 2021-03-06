-- <0407> hw

-- 1. 부서위치가 CHICAGO인 모든 사원에 대해 이름,업무,급여 출력하는 SQL을 작성하세요.
select ename, job, sal 
from emp inner join dept
on emp.deptno = dept.deptno
where emp.deptno = (select deptno from dept where loc = "CHICAGO");


-- 2. 부하직원이 없는 사원의 사원번호,이름,업무,부서번호 출력하는 SQL을 작성하세요. (?)
select empno, ename, job, deptno
from emp
where empno not in (select mgr from emp where mgr is not null);


-- 3. BLAKE와 같은 상사를 가진 사원의 이름,업무,상사번호 출력하는 SQL을 작성하세요.
select ename, job, mgr from emp
where mgr = (select mgr from emp where ename = 'blake');

-- 4. 입사일이 가장 오래된 사람 5명을 검색하세요.
select * from emp
order by hiredate limit 5
;

-- 5. JONES 의 부하 직원의 이름, 업무, 부서명을 검색하세요.
select ename, job, dname
from emp, dept
where mgr = (select empno from emp where ename = 'jones')
and emp.deptno = dept.deptno;