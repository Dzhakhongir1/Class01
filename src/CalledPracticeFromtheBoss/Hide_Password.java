package CalledPracticeFromtheBoss;

import java.util.*;

public class Hide_Password {
    public static void main(String[] args) {
        List<String>input = new ArrayList<>();
        input.add("one");
        input.add("hi");
        input.add("hold");
        List<String>output = new ArrayList<>();
        String result = "";
        for (int i = 0; i <input.size() ; i++) {
            result = "";
            for (int j = 0; j <input.get(i).length() ; j++) {
                result += "*";
            }
            input.set(i,result);
        }
        System.out.println(input);

    }
}
