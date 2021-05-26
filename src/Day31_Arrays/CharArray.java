package Day31_Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] array= {'j','a','v','a',' ' ,'i','s',' ','f','u','n'};
        for (char each:array){
            System.out.print(each+" ");

        }
        String sentence = new String(array);
        System.out.println("\nsentence ="+sentence);

        String item = "Wooden spoon";
        char[]itemArray=item.toCharArray();
        System.out.println(itemArray);

        String []fruits = {"bananas","apples","oranges","mango","kiwi","strawberry"};
        String fruitStr="";
        for (String each: fruits){
            System.out.print(each+"-");
            fruitStr+=each+"-";
        }
        System.out.println(fruitStr);
        String []languages={"java","python","c++","sql","ruby","javascript"};
        System.out.println(String.join("|",languages));
        String joinedlanguage= String.join("<>",languages);
        System.out.println(joinedlanguage);



    }
}
