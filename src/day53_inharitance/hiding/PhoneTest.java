package day53_inharitance.hiding;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone  = new Phone();
        Mobile mobile = new Mobile();

        phone.call();
        mobile.text();
        mobile.call();
    }
}
