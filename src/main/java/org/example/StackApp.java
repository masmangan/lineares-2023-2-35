package org.example;


public class StackApp {
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