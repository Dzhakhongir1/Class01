package Day25Loops;

public class EvenOrOddNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=100;i+=2){

            System.out.println(i);
        }
        for (int i=0;i<=100;i++){
                if (i%3==0&&i%5==0){
                    System.out.println(i+",");

                }
            }
        }

    }

