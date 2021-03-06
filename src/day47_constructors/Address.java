package day47_constructors;

public class Address {

    private  String street;
    private  String city;
    private String state;
    private String zipCode;
    private String country;


    public Address(){
        System.out.println("Address constructor");
        street ="123 unknown street";
        city ="unknown";
        state ="unknown";
        zipCode="00000";
    }
    public Address(String street ,String city, String state, String zipCode){
        this.city=city;
        this.street=street;
        this.state=state;
        this.zipCode=zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String toString() {
        return
                 street + '\'' +
                ", " + city + '\'' +
                ", " + state + '\'' +
                ", " + zipCode + '\'' +
                ", " + country + '\'' +
                '}';
    }
}
