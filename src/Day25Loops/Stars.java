package Day25Loops;

public class Stars {
    public static void main(String[] args) {
        for (int stars=1;stars<=15;stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars="";
        for (int i =1; i<=5;i++) {
            myStars += "* ";
            System.out.println(myStars);
        }
        System.out.print(myStars);

    }
}
