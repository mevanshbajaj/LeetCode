# Write your MySQL query statement below
select salary from employee where < (select max(salary) from employee);