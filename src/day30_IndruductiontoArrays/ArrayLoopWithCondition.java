package day30_IndruductiontoArrays;

public class ArrayLoopWithCondition {
    public static void main(String[] args) {
        double [] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[]countries={"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        System.out.println("prices less than 100");
        for (double n:prices){
            if (n>100){
                System.out.println(n);
            }
        }
        System.out.println("Prices between 10 and 70");
        for (double eachPrice:prices){
            if (eachPrice>=10&&eachPrice<=70){
                System.out.print(eachPrice+" ");
            }
        }
        System.out.println("\n=============count prices that are more than 50");
        int count =0;
        for (double eachPrice:prices){
            if (eachPrice>50){
                count++;
            }

        }
        System.out.println("\n countries woth length more than 7");
        count++;
        for(String eachCountry:countries){
            if (eachCountry.length()>=7){
                System.out.println(eachCountry+" "+eachCountry.length()+" ");
            }
        }

    }
}
