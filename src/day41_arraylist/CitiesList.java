package day41_arraylist;

import java.util.*;

public class CitiesList {
    public static void main(String[] args) {
        //declare array list
        ArrayList <String> cities = new ArrayList<>();
        // add values add cities to arrays
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        cities.add(0,"Ashgabat");
        System.out.println(cities);
        System.out.println("first city= "+cities.get(0));
        System.out.println("second city= "+cities.get(cities.size()-1));
        System.out.println("count of items= "+cities.size());
        for (int i = 0;i < cities.size()/2;i++){
            System.out.println(cities.get(i));
        }
        for (String each :cities){
            System.out.print(each);
            System.out.println();
        }
        cities.remove(3);
        cities.remove("New York");
        System.out.println("Cities after remove ="+cities);
        cities.clear();
        System.out.println("cities = " + cities);
        if(cities.isEmpty()){
            System.out.println("list is empty ");
        }
        if (cities.size()==0){
            System.out.println("list is empty ");
        }
    }
}
