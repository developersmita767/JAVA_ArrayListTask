//Write a program to demonstrate arraylist and its methods(add,set,size,isEmpty,get,remove).

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Orange");
        arrayList.add("Pinaple");
        arrayList.add("Apple");

        System.out.println("ArrayList after adding elements: " + arrayList);//add()

        System.out.println("Size of ArrayList: " + arrayList.size());//size()

        System.out.println("Is ArrayList empty " + arrayList.isEmpty());//isEmpty()

        System.out.println("Element at index 1: " + arrayList.get(1));//get()

        arrayList.set(1, "Grapes");
        System.out.println("ArrayList after modifying element at index 1: " + arrayList);//set()

       arrayList.remove("Apple");
        System.out.println("ArrayList after removing 'Cherry': " + arrayList);//remove
    }
}
