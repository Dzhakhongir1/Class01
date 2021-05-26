package day21_string_manipulation;

public class practice {
    public static void main(String[] args) {
        String word = "jahaj";
        char firstletter = word.charAt(0);
        char lastletter = word.charAt(word.length()-1);
        System.out.println("Last letter - "+lastletter);
        if (firstletter==lastletter){
            System.out.println("letter is -"+lastletter);

        }else{
            System.out.println("letter is _"+firstletter);
        }
    }
}
