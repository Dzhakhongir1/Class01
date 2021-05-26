package day21_string_manipulation;

public class Charmanipulation {
    public static void main(String[] args) {
        String word = "mom";
        char first = 'm';
        char last = 'm';
        if (first==last){
            System.out.println("it's correct");

        }
        String friend = "level";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length()-1);
        System.out.println("lastLetter = " + lastLetter);
        System.out.println("firstLetter = " + firstLetter);
        if (firstLetter==lastLetter){
            System.out.println(friend+"- first match");
        }else{
            System.out.println(friend+"- first and last match");
        }
    }
}
