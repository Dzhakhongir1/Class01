package CalledPracticeFromtheBoss;

import java.util.ArrayList;

public class Delivery {
    public static void main(String[] args) {

    }
    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
        int sum = 0;
        int result =0;
        for (int i = 0; i <deliveries.size() ; i++) {
            sum+=deliveries.get(i);

        }
        if (sum % max_fuel!= 0){
            result= (sum/max_fuel)+1;
        }else{
            result=(sum/max_fuel);
        }
        return result;



    }

}
