-- 코드를 입력하세요
SELECT a.title
, a.board_id
, b.reply_id
, b.writer_id
, b.contents
, DATE_FORMAT(b.created_date, '%Y-%m-%d') AS CREATED_DATE  
FROM USED_GOODS_BOARD AS a
JOIN USED_GOODS_REPLY AS b
ON a.board_id = b.board_id
WHERE DATE_FORMAT(a.created_date, '%Y-%m') = '2022-10'
ORDER BY b.created_date, a.title;