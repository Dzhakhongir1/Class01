package Day29_arrays;

public class StringnestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i=0; i<=word.length()-1;i++){
            for (int j =i; j<=word.length()-1;j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
