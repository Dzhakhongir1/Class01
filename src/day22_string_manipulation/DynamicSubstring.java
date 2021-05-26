package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:123456";
        System.out.println(result.substring(13));
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        System.out.println(result.substring(result.indexOf(":")+1));
        System.out.println();
        String today = "i learned[java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(start);
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}
