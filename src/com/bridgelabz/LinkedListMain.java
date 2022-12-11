package com.bridgelabz;

class LinkListMain {
    /**
     *  This is Main method is used for  Ability to delete the last element in the LinkedList
     */
    public static void main(String[] args) {

        Linklist<Integer> list1 = new Linklist();
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.show();
        list1.popBack();
        System.out.println("After delet last element in linked list");
        list1.show();

        System.out.println();

    }
}
