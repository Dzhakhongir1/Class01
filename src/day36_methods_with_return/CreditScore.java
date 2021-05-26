package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
    checkEligible(getCreditScore());
       //?? System.out.println(checkEligible(711)); error due to void thing
        System.out.println(getCreditScore());
        int score= getCreditScore();
        System.out.println("score = " + score);

    }
    public static void checkEligible(int creditScore){
        if (creditScore>=700){
            System.out.println("eligible for this car ");
        }else {
            System.out.println("Sorry you're not eligible for leasing this car ");
        }
    }
    public static int getCreditScore() {
    return 800;
    }

}
