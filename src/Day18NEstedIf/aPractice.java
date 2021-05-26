package Day18NEstedIf;

public class aPractice {
    public static void main(String[] args) {
        int last4ssn = 4555;
        int pinCode =4555;
        int exptLast4ssn =1234;
        int expPinCode =4555;
        if (last4ssn==exptLast4ssn&&pinCode==last4ssn){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if(last4ssn!=exptLast4ssn){
                System.out.println("Last 4 ssn number is incorrect");
            }if(pinCode!=expPinCode){
                System.out.println("pin code is not correct ");
            }
         }

    }
}
