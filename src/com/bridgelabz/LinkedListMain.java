package com.bridgelabz;

class LinkListMain {
    /**
     *  This is Main method is used for  Ability to search the 30 value element in the LinkedList
     */
    public static void main(String[] args) {

        Linklist<Integer> list1 = new Linklist();
        list1.add(56);
        list1.add(30);
        list1.add(70);
        list1.show();
        list1.search(30);


    }
}
