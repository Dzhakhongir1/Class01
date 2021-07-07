package IQJava;

public class IfCointais {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 3;
        boolean check=false;
        for (int i =0; i<nums.length; i++){
            if (target==i){
                check=true;
                break;
            }
        }
        System.out.println(check);
    }
}
