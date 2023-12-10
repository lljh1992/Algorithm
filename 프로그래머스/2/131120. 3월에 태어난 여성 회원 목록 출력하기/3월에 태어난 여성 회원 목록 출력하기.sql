-- 코드를 입력하세요
SELECT member_id, member_name, gender, DATE_FORMAT(date_of_birth, '%Y-%m-%d') AS date_of_birth
FROM MEMBER_PROFILE
WHERE (MONTH(date_of_birth) = 3) AND (GENDER = 'W') AND (TLNO IS NOT NULL)
ORDER BY member_id ASC