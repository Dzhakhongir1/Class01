package day48_constructor_static;

public class Customer {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Customer(){
        System.out.println("No-args constructor");
        name = "new customer";
        id =-1;
    }
    public Customer (String name , int id){
        this.name=name;
        this.id=id;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
