package Day27_Loops;

public class readStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,black cat,red car";
//        for (int i=0;i<list.length()-2;i++){
//            System.out.println(list.substring(i,i+3));
//        }
        for (int i=0;i<list.length()-2;i++) {
            String part =list.substring(i, i + 3);
            System.out.println("part= "+part);
            if (part.equals("cat")||part.equals("car")){
                System.out.println("car or cat found");
            }
        }
    }
}
