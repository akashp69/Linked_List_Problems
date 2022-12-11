package com.bridgelabz;

public class Linklist<T> {
    Node<T> head;
    Node<T> tail;
    /**
     * This method is used for append the elements in linked list
     */

    public void append(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    /**
     * This method is used for showing the elements in linked list
     */

    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
}