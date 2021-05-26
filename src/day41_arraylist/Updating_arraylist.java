package day41_arraylist;

import java.util.*;

public class Updating_arraylist {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");
        System.out.println(myCars.toString());
        String allCarsIn1St = myCars.toString();
        System.out.println(allCarsIn1St);
        //change index = to lamborghini
        myCars.set(0,"lamborghini");
        System.out.println("after set ="+myCars.toString());
        myCars.set(4,"honda");
        System.out.println("after set = "+myCars.toString());
        myCars.set(myCars.indexOf("ford"),"BMW" );
        System.out.println(myCars);
        int mosckvivhIndex=myCars.indexOf("moskvich");
        System.out.println(mosckvivhIndex);
        System.out.println();
        myCars.set(mosckvivhIndex,"ziguli");
        System.out.println(myCars);

        for (int i = 0; i <myCars.size();i++){
            if (myCars.get(i).equals("lamborghini")){
                myCars.set(i,"prius");
            }else if (myCars.get(i).equals("toyota")){
                myCars.set(i,"lexus");
            }else if (myCars.get(i).equals("ziguli")){
                myCars.set(i,"merce");
            }
        }
        System.out.println("my cars after loop \n "+ myCars);

    }
}
