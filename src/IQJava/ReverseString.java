package IQJava;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversedVersion= "";
        for (int i = str.length()-1; i>=0; i--){
            reversedVersion += ""+str.charAt(i);
        }
        System.out.println(reversedVersion);
    }
}
