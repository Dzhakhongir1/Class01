package CalledPracticeFromtheBoss;

public class AmazonFreeShipping {
    public static void main(String[] args) {
           int number =0;
            while(number<=100) {
                number++;
                if (number%3==0&&number%5==0&&number%2==1){
                    //take the number first divide it by 3 make sure there is no remainder then check if the same number can be
                    //divided by 5 and will have no remainder and then check if that number that's divided by 3 and 5 is an odd number
                    //the only way to find if it is the odd number if the number is divided by 2 it gives remainder 1
                    System.out.print(number+",");
                }
            }
        }
    }

