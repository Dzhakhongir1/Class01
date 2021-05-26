package day37_methods_overLoading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(2));
        System.out.println(getDayName(25));
        for (int i = 1; i <9 ; i++) {
            System.out.println(i+" ="+getDayName(i));

        }
        String store= getDayName(5);
        System.out.println("today is"+store);
        String someDay= getDayName(0);
        if (someDay==null){
            System.out.println("someDay is null for invalid day ");
        }
        System.out.println(getDayNameV2(6));

    }
    public static String getDayName(int day){
        switch (day){
            case 1:
                return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Chose number between 1-7 ";

        }
        /*
        we can not use brake in switch statments with return statments code will be unrichable
        null in java means just an empty container
        null is not same as ""(empty double quotes)
        ""->is a valid String object that has characters
        String word=null: ->no object
        String word2="";->valid String object /value
        THE ABOVE EXAMPLE IS NOT SAME
         */
    }
    public static String getDayNameV2(int day){
        String dayName;
        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName= "Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName= "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                System.out.println("invalid day"+day);
                dayName=null;
        }
    return dayName;


    }

}
