package DilnozaOnly;

public class Groups {
    public static void main(String[] args) {
        String str = " We have java not python";

        int countOfJava= 0;
        int countOfPython=0;
        for (int i =0;i<str.length()-3;i++){
            String subString = str.substring(i,i+4);
            if (subString.equals("java")){
                countOfJava++;
            }

        }
        for (int i =0;i<str.length()-5;i++) {
            String subString = str.substring(i, i + 6);
            if (subString.equals("python")) {
                countOfPython++;
            }
        }
        System.out.println(countOfJava==countOfPython);
    }
}
