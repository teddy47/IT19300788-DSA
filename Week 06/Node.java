public class Node {
    public int empNumber;
    public String name;
    public Node leftChild;
    public Node rightChild;

    public Node(int empNumber, String name) {
        this.empNumber = empNumber;
        this.name = name;
    }

    public void displayNode() {
        System.out.println("Emp No: " + empNumber + ", Name: " + name);
    }
}
