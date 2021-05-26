package Day28_SomePracticeAndNewTopic;

public class City {
    public static void main(String[] args) {
        int startWith=1;
        int endWith=30;
        int totalCases=0;
        for (int day =startWith;day<=endWith;day++){
            if (day%7==0){
                totalCases+=500;
            }else{
                totalCases+=200;
            }
            System.out.println("Day"+day+"| roral case "+totalCases);

        }
        System.out.println(totalCases);


    }
}
