package day52_inharitance.a2;

public class Admin extends User{
    public String toString(){
        return "Admin{" +
                "lvl='" + getLvl() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
    public Admin(){
        super();
        System.out.println("Admin class constructor");
    }
    public Admin(String name , int id){
        super("Admin",name,id);
        System.out.println("Ad,im class 2 args constructor");
    }
}
