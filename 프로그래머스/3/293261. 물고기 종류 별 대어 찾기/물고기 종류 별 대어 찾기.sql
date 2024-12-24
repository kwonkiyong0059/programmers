-- 코드를 작성해주세요
SELECT F1.ID, F2.FISH_NAME, F1.LENGTH
FROM FISH_INFO F1
INNER JOIN FISH_NAME_INFO F2
ON F1.FISH_TYPE = F2.FISH_TYPE
WHERE F1.LENGTH=(
    SELECT MAX(LENGTH)
    FROM FISH_INFO F3
    WHERE F3.FISH_TYPE = F1.FISH_TYPE
)
ORDER BY F1.ID;