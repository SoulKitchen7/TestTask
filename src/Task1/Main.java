package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создаем дерево для тестирования
        TreeNode root = new TreeNode();
        root.setValue(10);

        TreeNode node1 = new TreeNode();
        node1.setValue(20);

        TreeNode node2 = new TreeNode();
        node2.setValue(5);

        TreeNode node3 = new TreeNode();
        node3.setValue(15);

        TreeNode node4 = new TreeNode();
        node4.setValue(25);

        root.setChildren(List.of(node1, node2));
        node1.setChildren(List.of(node3, node4));

        // Задаем значение N
        int N = 10;

        // Вызываем метод для поиска узлов с value больше N
        List<TreeNode> nodes = TreeSearch.findNodesWithValueGreaterThanN(root, N);

        // Выводим результат
        System.out.println("Узлы с value больше " + N + ":");
        for (TreeNode node : nodes) {
            System.out.println(node.getValue());
        }
    }
}

