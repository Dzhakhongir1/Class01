package Day35_Method_with_param;

public class Counters {
    public static void main(String[] args) {
        countToInput(6);
        countToInput(10);
        countToInput(3);
        int nums =999;
        countToInput(nums);
        String word = "Wooden spoon";
        countToInput(word.length());
        printAge(38);
    }
    public static void countToInput(int input){
        for (int i = 0; i <=input ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }
    public static void printAge(int input){
        int yearBorn= 2021-input;
        System.out.println("birt year "+yearBorn+" age "+input);

    }

}
