package day37_methods_overLoading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi",3,'|'));
    }
    public static String repeatString(String word, int times,char delimiter){
        String result="";
        for (int i =1; i<=times;i++){
         result+=delimiter+word;

        }
        return result.substring(1);
    }
}
