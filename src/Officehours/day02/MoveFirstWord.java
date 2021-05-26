package Officehours.day02;

public class MoveFirstWord {
    public static void main(String[] args) {
        String str = "java is fun language";
        int space = str.lastIndexOf(" ");
        String lastWord= str.substring(space);
        System.out.println(lastWord.trim()+" "+str.substring(0,space).trim());
        System.out.println();
    }
}
