package day37_methods_overLoading;

public class VarArgs {
    public static void main(String[] args) {
     addNums(5,6);
    }
    public static void addNums(int... nums){
        int sum = 0;
        for (int n:nums){
            sum+=n;
        }
        System.out.println("sum= "+sum);
    }
}
