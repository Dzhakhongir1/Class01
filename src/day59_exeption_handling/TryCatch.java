package day59_exeption_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10/3);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        }catch (Exception e){
            System.out.println("Runtime exeption happened and handled ");
        }

        int [] nums = {11,33,44};
        try {
            System.out.println(nums[0]);
            System.out.println(nums[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bond exaprion is cought and handled ");
        }
        System.out.println("After code");
    }
}
