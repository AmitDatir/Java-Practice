import java.util.LinkedList;
import java.util.Queue;

// Java
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class LevelOrderTraversal {
    // Level Order Traversal (BFS)
    void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
        }
    }

    
}


public class Main {
    // Helper method to create the binary tree
    static TreeNode createBinaryTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(25);
        return root;
    }

    // Main method to run the example
    public static void main(String[] args) {
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        TreeNode root = createBinaryTree();

        System.out.print("Level Order Traversal (BFS): ");
        traversal.levelOrderTraversal(root);
    }
}
