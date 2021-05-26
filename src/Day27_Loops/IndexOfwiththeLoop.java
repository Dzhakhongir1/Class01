package Day27_Loops;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class IndexOfwiththeLoop {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int idx=-1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                idx = i ;
                System.out.println(letter +" is found at index " + idx);



            }
        }
    }
}
