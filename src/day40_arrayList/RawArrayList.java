package day40_arrayList;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {
        //first way to write arraylist
        ArrayList list1= new ArrayList();
        //second way to write array list
        List list2= new ArrayList();
        // when we declares array list by default java gives us 10 empty null data
        list1.add("java");
        list1.add("c++");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");
        System.out.println(list1);
        System.out.println("size= "+list1.size());
        // in above example we did something called raw array list
        // it can store any object types although , it's not recommended to use like this

        //this is restricted Array list
        ArrayList <Integer> nums = new ArrayList<>();
        //Array list internally uses normal arrays . it is based on array
        // it just copyes values and becomes resizible


    }
}
