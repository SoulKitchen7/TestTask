package Task1;

import java.util.ArrayList;
import java.util.List;

public class TreeSearch {

    public static List<TreeNode> findNodesWithValueGreaterThanN(TreeNode root, int N) {
        List<TreeNode> result = new ArrayList<>();
        searchNodes(root, N, result);
        return result;
    }


    private static void searchNodes (TreeNode node, int N, List<TreeNode> result) {
        if (node == null) {
            return;
        }

        if (node.getValue() > N) {
            result.add(node);
        }

        if (node.getChildren() != null) {
            for (TreeNode child : node.getChildren()) {
                searchNodes(child, N, result);
            }
        }
    }
}