package Day25Loops;

public class main {
    public static void main(String[] args) {
        int sum =0;
        for(int count=100;count>1;count++){
            System.out.println(count); 
            sum+=count;
            //adding whaever we have inside of the count so it was zero now it came to 1 than 2 than 3 and so one

        }
        System.out.println("sum = " + sum);

    }
}
