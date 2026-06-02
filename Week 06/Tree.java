public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int emp) {
        Node current = root;
        while (current != null) {
            if (emp == current.empNumber)
                return current;
            else if (emp < current.empNumber)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return null;
    }

    public void insert(int emp, String name) {
        Node newNode = new Node(emp, name);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (emp < current.empNumber) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public void inOrder() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node node) {
        if (node != null) {
            inOrderHelper(node.leftChild);
            node.displayNode();
            inOrderHelper(node.rightChild);
        }
    }

    public void preOrder() {
        preOrderHelper(root);
    }

    private void preOrderHelper(Node node) {
        if (node != null) {
            node.displayNode();
            preOrderHelper(node.leftChild);
            preOrderHelper(node.rightChild);
        }
    }

    public void postOrder() {
        postOrderHelper(root);
    }

    private void postOrderHelper(Node node) {
        if (node != null) {
            postOrderHelper(node.leftChild);
            postOrderHelper(node.rightChild);
            node.displayNode();
        }
    }

    public Node findRecursive(int emp) {
        return findRecursiveHelper(root, emp);
    }

    private Node findRecursiveHelper(Node node, int emp) {
        if (node == null)
            return null;
        if (emp == node.empNumber)
            return node;
        else if (emp < node.empNumber)
            return findRecursiveHelper(node.leftChild, emp);
        else
            return findRecursiveHelper(node.rightChild, emp);
    }

    public void deleteAll() {
        root = null;
    }
}
