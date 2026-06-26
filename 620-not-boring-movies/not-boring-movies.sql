# Write your MySQL query statement below
SELECT * from Cinema
Where id%2!=0 and NOT description='boring' 
ORDER BY rating DESC;