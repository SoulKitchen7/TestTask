Задание 1
Дано дерево, состоящее из экземпляров класса TreeNode:
import java.util.List;
import lombok.Data;

@Data
public class TreeNode {
	private int value;
	private List<TreeNode> children;
}

Требуется написать класс, метод которого получит на вход корень такого дерева, найдёт в этом дереве узлы, у которых value больше N (N задаётся параметром), и вернёт список этих узлов.
Задание 2
Требуется написать класс, который готовит данные для прорисовки окружности.
Вход: Координаты центра (в миллиметрах), диаметр (в миллиметрах), разрешение (в DPI).
Выход: Список кортежей, содержащих координаты точек (в пикселях), принадлежащих окружности.
Уточнение: толщина окружности – 1 пиксель.
Задание 3
Дана модель плоскости в виде двумерного массива целых чисел. Свойства модели:
1.	На плоскости есть незанятые точки, они моделируются числом 0.
2.	На плоскости есть занятые точки, они моделируются числом 1. Сколько точек занято, и где они расположены – вариабельно. 
3.	Занятые точки могут быть соседними. Занятая точка может иметь больше одного занятого соседа. Называем две занятые точки N и M связанными, если можно построить путь от N к М, перемещаясь на каждом шаге пути на какую-либо из соседних занятых точек.
Даны координаты двух занятых точек A и B.
Требуется на этой модели построить путь от A к B, и промаркировать числом 2 ранее незанятые точки, принадлежащие этому пути. Свойства пути:
1.	Ширина пути – 1 точка;
2.	Путь не может проходить через занятую точку, если эта точка не связана ни с точкой A, ни с точкой B;
3.	Путь не может проходить через свободную точку, если хотя бы одна из её соседних точек занята и не связана ни с точкой A, ни с точкой B.

