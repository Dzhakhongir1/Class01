package day61_exeptions_collections.checked_exeptions;

public class CheckedExeptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("about to sleep for 5 seconds");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Thread.sleep(5000);
        System.out.println("wake up after 5 seconds");
    }

}
