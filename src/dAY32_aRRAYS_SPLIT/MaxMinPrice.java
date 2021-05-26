package dAY32_aRRAYS_SPLIT;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        double max =0;
        int indesOf=0;
        for (int i = 0; i< prices.length;i++){
            if (prices[i]>max){
                max=prices[i];
                indesOf=i;

            }


        }
        System.out.print(items[indesOf] + "- $" + prices[indesOf] + " - #" + itemIDs[indesOf]+"\n max price "+max+
                " \nindex of mmax number"+indesOf+"\n");
        System.out.println("+++++++++++++++++++++find min number ++++++++++++++++++++++++++++++++++++++++++++");
        double min=1000;
        for (int i = 0; i< prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
                indesOf=i;

            }


        }
        System.out.print(items[indesOf] + "- $" + prices[indesOf] + " - #" + itemIDs[indesOf]+"\n cheapest"+min+
                "\nindex of min number"+indesOf);
    }
}
