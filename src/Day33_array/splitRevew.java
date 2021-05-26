package Day33_array;

import java.util.Arrays;

public class splitRevew {
    public static void main(String[] args) {
        String word = "java";
        String [] wordTOArray= word.split("a");
        System.out.println(Arrays.toString(wordTOArray));
        System.out.println(wordTOArray.length);
        int countOfA=wordTOArray.length-1;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("count OfA= "+countOfA);
        System.out.println();
        String []strArr=word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
    }
}
