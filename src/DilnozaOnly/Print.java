package DilnozaOnly;

public class Print {
    public static void main(String[] args) {
        String []arr={"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};
        for(int i=0; i<arr.length-1;i+=2){
            System.out.println(arr[i]+", "+arr[i+1]);
        }

    }
}
