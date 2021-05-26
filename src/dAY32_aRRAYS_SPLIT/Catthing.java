package dAY32_aRRAYS_SPLIT;

public class Catthing {
    public static void main(String[] args) {
        String catTypes= "bengal cat tabby cat persian cat no cat here";
        String [] catsArray = catTypes.split("cat");
        System.out.println("Number of cats ="+(catsArray.length-1));
        for (String type:catsArray){
            System.out.println(type);
        }
        String app = "etsy";
        String zones = "us-east-1 ,us-west-2 ,us-west-1";
        String[] count = zones.split(",");
        System.out.println("count of camas in zones "+(count.length-1));
        for (String each : count){
            System.out.println("deployment ["+app+"] to "+each+"....");
            System.out.println("deployment comp for "+each+"...");

        }
        System.out.println("all deployment complete ");




    }
}
