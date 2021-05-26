package day37_methods_overLoading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] differentName) {
        System.out.println("hello from real main method ");
        main(5);
        main(false);
        System.out.println(Arrays.toString(differentName));
    }
    public static void main(int num){
        System.out.println(num);

    }
    public static void main(boolean yes){
        System.out.println(yes==true);
    }
}
