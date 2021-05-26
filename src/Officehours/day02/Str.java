package Officehours.day02;

public class Str {
    public static void main(String[] args) {
       String str ="cybertek";
        for (int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));

        }
        String input = "today it will be 100 degrees !";
        int n=0;
        while(n++<input.length()){
            if(n==8){
             continue;
            }else if(n==9){
                break;
            }
            System.out.println(input.charAt(++n));
        }

    }
}
