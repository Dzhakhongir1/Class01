package dAY32_aRRAYS_SPLIT;

public class reverse {
    public static void main(String[] args) {
        String sentense = "java is fun";
        String[] reverseSentense=sentense.split(" ");
        String reversed="";
        for (int i=reverseSentense.length-1;i>=0;i--){
//            System.out.println(reverseSentense[i]+" ");
            reversed+=reverseSentense[i]+" ";
        }
        System.out.println("sentence ="+sentense);
        System.out.println("reversed sentance = "+reversed.trim());



    }
}
