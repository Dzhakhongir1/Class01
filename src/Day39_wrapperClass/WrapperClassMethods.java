package Day39_wrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println("min int :"+Integer.MIN_VALUE);
        System.out.println("Max int "+Integer.MAX_VALUE);

        System.out.println(Integer.compare(5,1));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isUpperCase('R'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter ='A';
        if (Character.isUpperCase(letter)){
            System.out.println("yes");
        }
        String word= "Java Is FuN";
        String upperOnes="";
        for (int i =0;i<=word.length()-1;i++){
            if (Character.isUpperCase(word.charAt(i))){
                upperOnes+=word.charAt(i);
            }
        }
        System.out.println(upperOnes);

        //String >>int





    }
}
