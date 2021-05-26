package day14_multi_branch_if_statments;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("GO to park");
        }else if(weather.equals("rainy")) {
            System.out.println("Stay home , drink some tea and code java");
        }else if(weather.equals("snowy")){
            System.out.println("take time and clean your car for tommorow");
        }else if(weather.equals("windy")) {
        }else{
            System.out.println("just keep coding ");
        }

    }
}
