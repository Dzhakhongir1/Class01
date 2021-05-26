package Day28_SomePracticeAndNewTopic;

public class Interb {
    public static void main(String[] args) {
        String word = "java";

        String unique ="";

        for(int i =0;i<word.length();i++){
            if(!unique.contains(word.charAt(i)+"")){
            unique+=word.charAt(i);
            }

        }
        System.out.println(unique);
    }
}
