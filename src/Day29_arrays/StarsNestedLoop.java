package Day29_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int outter =1; outter<=5;outter++){
            for (int inner =1; inner<=10; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int outer =1; outer<=10;outer++){
            for (int inner = 1; inner<=outer;inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
