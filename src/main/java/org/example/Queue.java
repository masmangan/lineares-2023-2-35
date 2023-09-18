package org.example;

import java.util.Arrays;

class Queue {

    private int[] data;
    private int inicio;
    private int fim;

    public Queue() {
        data = new int[5];
        inicio = 0;
        fim = 0;
    }

    public void enqueue(int value) throws QueueFullException {
        data[fim] = value;
        if (fim == data.length - 1) {
            if (inicio == 0) {
                throw new QueueFullException();
            }
            fim = 0;
        } else {
            fim = fim + 1;
        }
    }

    public int dequeue() throws QueueEmptyException {
        if (inicio == fim) {
            throw new QueueEmptyException();
        }
        int value = data[inicio];
        if (inicio == data.length - 1) {
            inicio = 0;
        } else {
            inicio = inicio + 1;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + Arrays.toString(data) +
                ", inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}
