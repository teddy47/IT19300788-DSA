public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, int marks) {
        Link newLink = new Link(id, marks);
        newLink.next = first;
        first = newLink;
    }

    public void insertAfter(int key, int id, int marks) {
        Link current = find(key);
        if (current == null) {
            System.out.println("Key " + key + " not found.");
            return;
        }
        Link newLink = new Link(id, marks);
        newLink.next = current.next;
        current.next = newLink;
    }

    public Link find(int key) {
        Link current = first;
        while (current != null) {
            if (current.id == key)
                return current;
            current = current.next;
        }
        return null;
    }

    public Link deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int key) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }
        if (first.id == key) {
            return deleteFirst();
        }
        Link previous = first;
        Link current = first.next;
        while (current != null) {
            if (current.id == key) {
                previous.next = current.next;
                return current;
            }
            previous = current;
            current = current.next;
        }
        System.out.println("Key " + key + " not found.");
        return null;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
