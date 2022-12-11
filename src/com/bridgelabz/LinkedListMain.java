package com.bridgelabz;

class LinkListMain {
    /**
     *  This is Main method is used for create a simple Linked List of 56, 30, and 70.
     */
    public static void main(String[] args) {

        Linklist<Integer> list1 = new Linklist();
        list1.push(70);
        list1.push(30);
        list1.push(56);
        list1.show();

    }
}
