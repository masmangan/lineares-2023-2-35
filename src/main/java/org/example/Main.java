package org.example;

class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class MyLinkedList {
    private Node first;

    public MyLinkedList() {
        first = null;
    }

    public void add(int value) {
        Node newNode = new Node(value, first);
        first = newNode;
    }

    public void append(int value) {
        if (this.first == null) {
            add(value);
        } else {
            Node newNode = new Node(value, null);
            Node n = this.first;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    public void insert(int value, int i) {
        // inserir nodo com valor value na posição i
        // se i == 0 chamar add()
        // se i == size() chamar append()
        // senão é contar os nodos até o nodo i - 1 e fazer a inserção
    }


    public int size() {
        int s = 0;
        Node n = this.first;
        while (n != null) {
            s = s + 1;
            n = n.next;
        }
        return s;
    }

    public int get(int i) {
        if (i < 0)  {
            throw new IllegalArgumentException();
        }
        Node n = first;
        int p = 0;
        while (n != null) {
            if (p == i) {
                return n.value;
            }
            p = p + 1;
            n = n.next;
        }
        throw new IndexOutOfBoundsException();
    }
}




public class Main {

    public static void main(String[] args) {
        System.out.println(" Linked List ");

        MyLinkedList m1 = new MyLinkedList();
        System.out.println(m1.size());
        m1.add(70);
        System.out.println(m1.size());
        m1.add(40);
        System.out.println(m1.size());
        m1.append(12);
        System.out.println(m1.size());
        for (int i = 0; i < m1.size(); i++) {
            System.out.printf("#%d %d%n", i, m1.get(i));
        }
    }
}
