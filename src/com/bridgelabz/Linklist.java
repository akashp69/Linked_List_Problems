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
     * This method is used for search the elements in linked list
     */
    public void search(T data) {
        Node current = head;
        int i = 1;
        boolean flag = false;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }

        }
        if (flag) {
            System.out.println("The Node with value "  + data +  " is present in the list at the position : " + i);

        } else {
            System.out.println("Node with value is not present in the list");
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