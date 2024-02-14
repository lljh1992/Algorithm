-- 코드를 입력하세요
SELECT history_id, 
       FLOOR(IF (duration >= 7, 
                 (duration * daily_fee) * (SELECT (100-discount_rate) * 0.01
                                           FROM car_rental_company_discount_plan
                                           WHERE car_type=t.car_type
                                           AND duration_type=(CASE WHEN t.duration >= 90 THEN '90일 이상'
                                                                   WHEN t.duration >= 30 THEN '30일 이상'
                                                                   ELSE '7일 이상' END)),
                 (duration * daily_fee))) AS fee

FROM (SELECT history_id, h.car_id, c.car_type, c.daily_fee, 
             (TIMESTAMPDIFF(DAY, start_date, end_date)+1) AS duration
      FROM car_rental_company_rental_history AS h
      JOIN car_rental_company_car AS c ON c.car_id=h.car_id
      WHERE c.car_type='트럭') AS t

ORDER BY fee DESC, history_id DESC
;