/* выведите всю таблицу*/
SELECT * FROM Jaegers;
/*отобразите только не уничтоженных роботов*/
SELECT * FROM Jaegers WHERE status != 'Destroyed';
/*отобразите роботов нескольких серий, например Mark-1 и Mark-6*/
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
/*отсортируйте таблицу по убыванию по столбцу mark*/
SELECT * FROM Jaegers ORDER BY mark DESC;
/*отобразите самого старого робота*/
SELECT * FROM Jaegers ORDER BY launch LIMIT 1;
/*отобразите роботов, которые уничтожили больше/меньше всех kaiju*/
SELECT * FROM Jaegers ORDER BY kaijuKill LIMIT 1;
SELECT * FROM Jaegers ORDER BY kaijuKill DESC LIMIT 1;
/*отобразите средний вес роботов*/
SELECT ROUND(AVG(weight), 2) AS averageWeight FROM Jaegers;
/*увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены*/
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';
/*удалите уничтоженных роботов*/
DELETE FROM Jaegers WHERE status != 'Destroyed';
