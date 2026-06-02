public class stackx {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public stackx(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (!isFull()) {
            top++;
            stackArray[top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static String reverseString(String text) {
        CharStack s = new CharStack(text.length());

        for (int i = 0; i < text.length(); i++) {
            s.push(text.charAt(i));
        }

        String reversed = "";
        while (!s.isEmpty()) {
            reversed = reversed + s.pop();
        }

        return reversed;
    }

    public static boolean isBalanced(String str) {
        CharStack s = new CharStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    return false;
                }

                char topChar = s.pop();

                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}

class CharStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public CharStack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item) {
        top++;
        stackArray[top] = item;
    }

    public char pop() {
        char value = stackArray[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
