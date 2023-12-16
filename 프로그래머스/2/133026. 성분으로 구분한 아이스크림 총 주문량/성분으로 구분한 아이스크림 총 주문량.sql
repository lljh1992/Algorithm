-- 코드를 입력하세요
SELECT I.INGREDIENT_TYPE, SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM ICECREAM_INFO I, FIRST_HALF F
WHERE I.FLAVOR = F.FLAVOR
GROUP BY INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC