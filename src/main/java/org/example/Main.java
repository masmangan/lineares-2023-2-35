package org.example;


class Stack {
    private int[] data;
    private int top;

    public Stack() {
        data = new int[5];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(int value) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException();
        }
        top++;
        data[top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        int value = data[top];
        top--;
        return value;
    }

    public int peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return data[top];
    }
}

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

        System.out.println(" Pilhas! ");
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }

    }
}