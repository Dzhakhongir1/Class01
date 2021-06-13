package CalledPracticeFromtheBoss;

public class StringConcatPractice {
    public static void main(String[] args) {
        System.out.println("java" +5 +3);//java53
        //will print 53 reason is it will go from left to right and will concatenate 5 then 3 "Java"
        //if we want to do the math we have to put () . Value in parenthesis will be evaluated/calculadted first.
        /*

        System.out.println("java"+ (5+3));//java8
        System.out.println(5+3+"java");//8java
         */
        System.out.println("java"+ (5+3));//java8
        System.out.println(5+3+"java");//8java
        System.out.println(5+(3+"java"));
        System.out.println("hello"+1+2+3);
                        //"hello123"
        System.out.println("hello"+(1+2+3) );//hello6
        String str = "hello";
        String str2 = "Friends";
        System.out.println(str+str2);
        //hello friends
        System.out.println(str+ " "+ str2);
        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);//15
        // 1 5
        System.out.println(num1+" "+num2);
        System.out.println(num1+""+num2);
        // empry string with no value itis empty but still String object
        //how :
            // String word = " "; word has empty string value now
            //" " ->space
            // "" ->empty
        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2);
        System.out.println(char1+""+char2);//ab

    }
}
