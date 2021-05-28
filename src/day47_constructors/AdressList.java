package day47_constructors;

public class AdressList {
    public static void main(String[] args) {
        Address adress = new Address();
        adress.setStreet("11624 burke st");
        adress.setCity("Omaha");
        adress.setState("Ne");
        adress.setZipCode("68154");
        adress.setCountry("USA");
        System.out.println(adress.toString());
        Address myHome= new Address("burke","Omaha","Ne","68541");
        System.out.println(myHome);
    }
}
