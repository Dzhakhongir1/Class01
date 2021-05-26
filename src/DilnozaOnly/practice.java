package DilnozaOnly;

public class practice {
    public static void main(String[] args) {
        boolean money = true;
        boolean job = true;
        String jobtitle="Teller";
        if (money&&job){
            System.out.println("I will accept the offer ");
        }else if(job) {
            System.out.println("I dont want the job keep it ");
        }
    }
}
