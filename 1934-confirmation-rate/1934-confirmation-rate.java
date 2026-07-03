
# Write your MySQL query statement below
select s.user_id , ROUND(AVG(
    CASE
        WHEN action = 'confirmed'
        THEN 1 ELSE 0 END ),2)
 as confirmation_rate
from signups s left join confirmations c on s.user_id = c.user_id
GROUP BY s.user_id