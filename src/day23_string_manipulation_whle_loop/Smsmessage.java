package day23_string_manipulation_whle_loop;

public class Smsmessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] from number <2223334444> Message:{Hello, let's code some java}";
        System.out.println(message.indexOf("<"));
        System.out.println(message.indexOf(">"));
        System.out.println(message.substring(28 ,39+1));
        String phoneNumber = message.substring(28,39+1);
        System.out.println(phoneNumber);
        System.out.println(message.indexOf("["));
        System.out.println(message.indexOf("]"));
        String name = message.substring(8,14+1);
        System.out.println("Name of the sender is: "+name+" Phone number of the sender is: "+phoneNumber);
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        String Sender = message.substring(start+1,end);
        System.out.println("Sender = " + Sender);
        
        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);;
        String whatMessagecontains = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("message says  = " + whatMessagecontains+" from "+name+"number "+phoneNumber);;

    }
}
