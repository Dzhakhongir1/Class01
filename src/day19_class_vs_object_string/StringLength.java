package day19_class_vs_object_string;

public class StringLength {
    public static void main(String []args){
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count = "+ word.length());
        String firstName = "dzhakhongir";
        System.out.println(firstName.toUpperCase()+firstName.length());

        String password = "abc123";
        if (password.length()>=6){
            System.out.println("continue setting up your account");
        }else {
            if (password.length()<=5){
                System.out.println("invalid put more characters");
            }else {
                System.out.println("Plse more");
            }
            }
        }
    }

