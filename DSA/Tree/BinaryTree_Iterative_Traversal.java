import java.util.Stack;

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



class IterativeTreeTraversal {
    // Iterative Inorder Traversal
    void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }

    // Iterative Preorder Traversal
    void preorderTraversal(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.data + " ");

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }

    // Iterative Postorder Traversal
    void postorderTraversal(TreeNode root) {
        if (root == null)
            return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode current = stack1.pop();
            stack2.push(current);

            if (current.left != null)
                stack1.push(current.left);

            if (current.right != null)
                stack1.push(current.right);
        }

        while (!stack2.isEmpty()) {
            TreeNode current = stack2.pop();
            System.out.print(current.data + " ");
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

    // Main method to run the examples
    public static void main(String[] args) {
        IterativeTreeTraversal traversal = new IterativeTreeTraversal();
        TreeNode root = createBinaryTree();

        System.out.print("Inorder Traversal: ");
        traversal.inorderTraversal(root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        traversal.preorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        traversal.postorderTraversal(root);
        System.out.println();
    }
}
