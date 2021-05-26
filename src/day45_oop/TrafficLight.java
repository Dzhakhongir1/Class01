package day45_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrafficLight {
    String color;

    public void showColor(){
        System.out.println("current color ="+color);
    }
    public void changeColor(String newColor){
        System.out.println("changing color to "+newColor);
        color = newColor;

    }
    public void ListofColors(List<String> tcolor){
        for (int i =0; i<tcolor.size(); i++){
            if (tcolor.get(i).equals("green")||tcolor.get(i).equals("yellow")||tcolor.get(i).equals("red")){
                color =tcolor.get(i);
                System.out.println("new color assigned "+color);
            }else{
                System.out.println("Different mounten ");
            }
        }
    }

    public static void main(String[] args) {
        TrafficLight light1= new TrafficLight();
       // light1.color="red";
       // light1.showColor();
        light1.changeColor("green");
        light1.showColor();
        light1.changeColor("yellow");
        light1.showColor();
        light1.changeColor("red");
        light1.showColor();
        List<String>ligth = new ArrayList<>(Arrays.asList("red","green","yellow"));
        light1.ListofColors(ligth);


    }
}
