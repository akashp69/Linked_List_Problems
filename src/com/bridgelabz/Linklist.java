package com.bridgelabz;

public class Linklist<T> {
    Node<T> head;
    Node<T> tail;
    /**
     * This method is used for add the elements in linked list
     */

    public void add(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    /**
     * This method is used for delete the elements in linked list
     */
    public void pop() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            temp = null;
        }
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