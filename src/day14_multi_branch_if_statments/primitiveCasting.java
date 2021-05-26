package day14_multi_branch_if_statments;

import java.util.Scanner;
public class primitiveCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how is the weather today ?");
        String weather = scan.next();
        if (weather.equals("sunny")){
            System.out.println(weather+"Go to part, hiking and do some fun");
        }else if (weather.equals("rainy")){
            System.out.println(weather+" stay home, drink tea,and code java ");
        }else if (weather.equals("snowy")){
            System.out.println(weather+"Clean the car build the snow man ");
        }else if (weather.equals("windy")){
            System.out.println(weather+ "Get ready for power loss");
        }else{
            System.out.println("just keep coding");
        }
    }
}

