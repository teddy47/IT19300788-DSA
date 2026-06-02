public class QueueX {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int count;

    public QueueX(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = item;
            count++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            count--;
            return temp;
        }
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxSize;
    }

    public int getCount() {
        return count;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            int n = front;
            for (int i = 0; i < count; i++) {
                System.out.print(queueArray[n] + " ");
                n++;
                if (n == maxSize) {
                    n = 0;
                }
            }
            System.out.println();
        }
    }
}
