package Day39_wrapperClass;

public class ParseString {
    public static void main(String[] args) {
        String total ="365";
        int count = Integer.parseInt(total);
        boolean check = 5<count;
        System.out.println(check);
        String strPrice = "123.99";
        double price= Double.parseDouble(strPrice);
        System.out.println(price);
        String sentence = "i wrote 1000 lines of code";
        String []arr = sentence.split(" ");
        int linesOfCode=Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);

    }
}
