
# Write your MySQL query statement below
select s.student_id , s.student_name , sb.subject_name , count(sb.subject_name) as attended_exams
from student s cross join subject sb
left join examinations e 