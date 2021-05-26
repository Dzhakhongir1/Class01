package day20_String_Manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobtitle = "";
        System.out.println(jobtitle.isEmpty());
        System.out.println(jobtitle.length());
        if (jobtitle.isEmpty()){
            System.out.println("Jobtitel is missing "+jobtitle);
        }else{
            System.out.println("You're looking for "+jobtitle);
            String veggie = "carrots";
            if (!veggie.isEmpty()){
                System.out.println("we have "+veggie);
            }
            String word2;
            System.out.println();
        }
    }
}
