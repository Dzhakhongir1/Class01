package day19_class_vs_object_string;

public class StringStartsWithEndsWith {
    public static void main(String[] args){
        String word = "Jahon da";
        System.out.println(word.endsWith("a"));
        System.out.println(word.startsWith("J"));
        System.out.println(word.startsWith("J")+" and "+word.endsWith("da"));
        String name = "Maria";
        if (name.endsWith("a")){
            System.out.println("Maybe it is female name");
            String firstName = "Dr.Nadir";
            if (firstName.startsWith("Dr")){
                System.out.println("correct ");
            }else if(firstName.startsWith("Mr")) {
                System.out.println("Wrongs he is doctor");
            }else if(firstName.startsWith("Mrs")){
                System.out.println("Wrong he is doctor");
            }else if(firstName.startsWith("Sr")){
                System.out.println("Wrong he is doctor");
            }
        }

    }
}
