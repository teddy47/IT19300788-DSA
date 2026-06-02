public class Main {
    public static void main(String[] args) {

        // Exercise 1 - Student Linked List
        LinkedList list = new LinkedList();

        list.insertFirst(101, 85);
        list.insertFirst(102, 90);
        list.insertAfter(101, 103, 75);

        System.out.println("List after insertions:");
        list.displayList();

        list.delete(102);
        System.out.println("List after deleting ID 102:");
        list.displayList();

        list.deleteFirst();
        System.out.println("List after deleting first element:");
        list.displayList();

        System.out.println();

        // Exercise 2 - Library Management System
        BookLinkedList library = new BookLinkedList();

        library.insertFirst(1, "Hello", 15);
        library.insertFirst(2, "World", 4);
        library.insertAfter(1, 3, "Welcome", 8);

        System.out.println("List after insertions:");
        library.displayList();

        BookLink found = library.find(1);
        if (found != null) {
            System.out.println("Found: ID: " + found.bookID + ", Title: " + found.bookTitle);
        }

        library.delete(2);
        System.out.println("List after deleting ID 102:");
        library.displayList();

        library.deleteFirst();
        System.out.println("List after deleting first element:");
        library.displayList();
    }
}
