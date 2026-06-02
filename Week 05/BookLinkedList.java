public class BookLinkedList {
    private BookLink first;

    public BookLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, String title, int copies) {
        BookLink newLink = new BookLink(id, title, copies);
        newLink.next = first;
        first = newLink;
    }

    public void insertAfter(int key, int id, String title, int copies) {
        BookLink current = find(key);
        if (current == null) {
            System.out.println("Book ID " + key + " not found.");
            return;
        }
        BookLink newLink = new BookLink(id, title, copies);
        newLink.next = current.next;
        current.next = newLink;
    }

    public BookLink find(int key) {
        BookLink current = first;
        while (current != null) {
            if (current.bookID == key)
                return current;
            current = current.next;
        }
        return null;
    }

    public BookLink deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }
        BookLink temp = first;
        first = first.next;
        return temp;
    }

    public BookLink delete(int key) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }
        if (first.bookID == key) {
            return deleteFirst();
        }
        BookLink previous = first;
        BookLink current = first.next;
        while (current != null) {
            if (current.bookID == key) {
                previous.next = current.next;
                return current;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Book ID " + key + " not found.");
        return null;
    }

    public void displayList() {
        BookLink current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
