
# Write your MySQL query statement below
select person_name
from (select person_name , turn , sum(weight) over (order by turn) as running_weight
from queue ) as queue
WHERE running_weight <= 1000
ORDER BY turn DESC
LIMIT 1;