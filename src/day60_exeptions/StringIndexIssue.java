package day60_exeptions;

public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
           System.out.println(word.charAt(10));
        }catch (Exception e){
            System.out.println("This exeption is cathched " +e);
        }

        String word1 = "selenium";
        try{
            System.out.println("word1= "+word);
            System.out.println(word1.substring(0,5));
            System.out.println(word1.substring(0,15));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Type of exeption " +e.getClass().getSimpleName());
            System.out.println("Reason "+ e.getMessage());
        }
        System.out.println("__END__");

    }
}
