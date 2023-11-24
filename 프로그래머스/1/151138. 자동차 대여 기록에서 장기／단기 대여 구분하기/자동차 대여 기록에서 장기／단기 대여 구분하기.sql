-- 코드를 입력하세요
SELECT history_id, car_id
, DATE_FORMAT(start_date, '%Y-%m-%d') AS start_date
, DATE_FORMAT(end_date, '%Y-%m-%d') AS end_date
, CASE WHEN DATEDIFF(end_date, start_date) + 1 >= 30 THEN "장기 대여"
ELSE "단기 대여" END AS rent_type
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE start_date BETWEEN '2022-09-01' AND '2022-09-30'
ORDER BY history_id DESC;