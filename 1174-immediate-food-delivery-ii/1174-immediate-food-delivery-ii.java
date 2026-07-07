
select round(avg(case when d.order_date = d.customer_pref_delivery_date then 1
else 0 end)*100,2) as immediate_percentage from delivery d
join
(SELECT customer_id, MIN(order_date) AS first_order FROM Delivery
GROUP BY customer_id ) f 
ON d.customer_id=f.customer_id
AND d.order_date=f.first_order;