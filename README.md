<h2>Задача 1</h2>

- Используйте класс Student из урока 42 (см. Student.java).
- Создайте список учеников с баллами.
- Попросите пользователя ввести минимальный проходной балл.
- Выведите список учеников согласно следующим условиям:

--каждый ученик выведен в отдельной строке

--баллы каждого ученика выше минимального проходного

--ученики отсортированы по убыванию среднего балла

--в списке не больше 10 учеников (извините, конкурс)

--Для обработки и вывода результата используйте потоки (Stream).

-- Примечание --
- Сортировка потока выполняется при помощи промежуточного метода
  sorted(Comparator<? super T> comparator).
- В качестве компаратора используйте лямбда-функцию.
