package Officehours.Practice_04_27_21;

public class Armstron {
    public static void main(String[] args) {
        System.out.println(isArmStrong(1534));
    }

    public static boolean isArmStrong(int num){
        String strNum= ""+num;
        int power = strNum.length();
        int sum=0;
        for (int i = 0; i<strNum.length();i++){
            int eachDigit = Integer.parseInt(strNum.substring(i,i+1));
            sum+=Math.pow(eachDigit,power);

        }
        return num==sum;
    }

}
