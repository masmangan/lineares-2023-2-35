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
