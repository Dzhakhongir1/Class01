package IQJava;

import java.util.ArrayList;
import java.util.Arrays;

public class removeNAmeFromTheLsit {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John","Ahmed","Eic","Ahmed"));
        ArrayList<String> names2=new ArrayList<>();
        for (String each : names){
            if (each.equals("Ahmed")){
                each.replace("Ahmed","");
            }else{
                names2.add(each);
            }
        }
        System.out.println(names2);
    }
}
