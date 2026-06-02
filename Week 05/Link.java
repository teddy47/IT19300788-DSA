public class Link {
    public int id;
    public int marks;
    public Link next;

    public Link(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public void displayLink() {
        System.out.println("ID: " + id + ", Marks: " + marks);
    }
}
