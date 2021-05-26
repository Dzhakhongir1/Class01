package dAY32_aRRAYS_SPLIT;

public class sHOPPINGiTEMS {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        for (int i=0;i<items.length;i++){
            System.out.println("item name "+items[i]+" item price$"+prices[i]+" Item id is#"+itemIDs[i]);
        }
        int indexOfGloves =0;
        for (int i =0; i< items.length;i++){
            if (items[i].equals("Gloves")){
                System.out.println("Index is "+i+"for gloves ");
                break;
            }

        }
        boolean ipadExist =false;
        for(String each:items ){
            if (each.equalsIgnoreCase("ipad")){
                break;
            }
        }
        System.out.println("ipad exists= "+!ipadExist);
        for (int i =0;i<items.length;i++){
            if (items[i].equalsIgnoreCase("jacket")){
                System.out.println("Jacket price $"+prices[i]+"- #"+itemIDs[i]);
                break;
            }
        }









    }
}
