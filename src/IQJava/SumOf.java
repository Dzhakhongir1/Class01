package IQJava;

public class SumOf {
    public static void main(String[] args) {
        System.out.println(sumOfString("123456"));
    }
    public static int sumOfString(String num){
        int count =0;
        char [] cn = num.toCharArray();
        for (int i = 0; i <num.length() ; i++) {
            if (Character.isDigit(cn[i])){
                count+=Integer.valueOf(""+num.charAt(i));
            }
        }
        return count;
    }
}
