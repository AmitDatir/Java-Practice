// 1. Define the building block of the tree structure
class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

// 2. Define the tree container and insertion operations
class BinaryTree {
    Node root;

    // Standard constructor for an empty tree
    public BinaryTree() {
        root = null;
    }

    // Insert operation exposed to the user
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Internal helper to find the correct tree branch via recursion
    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    // Print out elements using In-Order Traversal (Left, Root, Right)
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }
}

// 3. Driver program to execute and verify the custom tree
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Adding elements to the custom tree structure
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);

        // This will print the contents in ascending, sorted order: 20 30 40 50 70
        System.out.print("In-Order Traversal: ");
        tree.traverseInOrder(tree.root);
    }
}
