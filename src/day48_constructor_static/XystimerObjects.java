package day48_constructor_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XystimerObjects {
    public static void main(String[] args) {
        Customer cs1 =new Customer();
        cs1.setName("D");
        cs1.setId(564523);
        System.out.println(cs1);
        Customer customer2 = new Customer("Agent",007);
        System.out.println(customer2.toString());
        Customer cs3 =new Customer("jaha",8456);
        System.out.println(cs3);
        //array of customers
        Customer [] todaysCustomers = {cs1,customer2,new Customer("bas",566)};
        //arraylist of customer objects
        List<Customer> totalTodayCustomers= new ArrayList<>(Arrays.asList(cs1,customer2,new Customer("dd",2312)));
        System.out.println(totalTodayCustomers);
        System.out.println(todaysCustomers[0]);
        for (int i =0; i<totalTodayCustomers.size();i++){
            System.out.println(totalTodayCustomers.get(i));
        }

        System.out.println("-----------for each now ________________");
        for (Customer each : totalTodayCustomers){
            System.out.println(each);
        }
        System.out.println("LAmbda _______________________");
       totalTodayCustomers.forEach(each-> System.out.println(each.getId()));
        for (int i = 0; i <totalTodayCustomers.size() ; i++) {
            System.out.println(totalTodayCustomers.get(i).getName());
        }
    }
}
