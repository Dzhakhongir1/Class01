package Day25Loops;

public class BrakeTime {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if (i%3==0&&i%5==0&&i%2==1) {
                System.out.println(i + ",");
            }
        }
    }
}
