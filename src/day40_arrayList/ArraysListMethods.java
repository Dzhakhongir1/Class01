package day40_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraysListMethods {
    public static void main(String[] args) {
        List<String> shoppingList=new ArrayList<>();
        System.out.println("size = "+shoppingList.size());
        System.out.println("is empty = "+shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("list is empty , keep coding java");
        }else{
            System.out.println("list is not empty, code java then goto mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("java book");
        shoppingList.add("tesla");
        if (shoppingList.isEmpty()){
            System.out.println("list is empty , keep coding java");
        }else{
            System.out.println("list is not empty, code java then goto mall");
        }
        int count =shoppingList.size();
        System.out.println("items to buy = "+count);

        System.out.println("is cheap monitor in my list? ="+shoppingList.contains("cheap monitor"));
        if(shoppingList.contains("cheap monitor")){
            System.out.println("no need to buy new monitor you have it already ");
        }else{
            System.out.println("keep coding java , go to mall and get another cheap monitor ");
        }
        shoppingList.remove("cheap monitor");
        System.out.println(shoppingList);
        if(shoppingList.contains("cheap monitor")){
            System.out.println("no need to buy new monitor you have it already ");
        }else{
            System.out.println("keep coding java , go to mall and get another cheap monitor ");
        }
        System.out.println("done with shopping ");
        shoppingList.clear();

    }
}
