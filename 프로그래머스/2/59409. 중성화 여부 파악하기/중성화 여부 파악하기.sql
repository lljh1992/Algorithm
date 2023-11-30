-- 코드를 입력하세요
SELECT animal_id, name,
CASE
WHEN sex_upon_intake LIKE 'Neutered Male%'
OR sex_upon_intake LIKE 'Spayed Female%'
THEN 'O'
ELSE 'X'
END 중성화
FROM ANIMAL_INS
ORDER BY animal_id;