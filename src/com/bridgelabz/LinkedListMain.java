package com.bridgelabz;

class LinkListMain {
    /**
     *  This is Main method is used for add elemets  in between two elements
     *  insert 30 between 56 and 70
     */
    public static void main(String[] args) {

        Linklist<Integer> list1 = new Linklist();
        list1.add(56);
        list1.add(70);

        list1.insertAtMid(30);
        list1.show();

        System.out.println();

    }
}
