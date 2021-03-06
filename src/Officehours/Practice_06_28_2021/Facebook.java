package Officehours.Practice_06_28_2021;


import java.util.*;

public class Facebook extends SocialMedia {

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;

    static {
        Platform="Facebook";
    }

    public Facebook(String username ,String password){
        this.username=username;
        setPassword(password);
        personUrl="facebook.com/"+username;
        allPosts=new ArrayList<>();

    }
    public Facebook(String username, String password, String fullName){
        this(username, password);
        setFullName(fullName);
    }
    public Facebook(String username,String password,String fullName, int age,int numberOfFriends){
        this( username,  password,  fullName);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void directMessage(String userName, String body) {

    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notifications() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(this.username)){
            System.out.println("Password contained username");
            this.password="password";
        }else{
            this.password=password;
        }
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            if(!Character.isLetter(fullName.charAt(i))){
                System.out.println("invalid name");
                this.fullName = "no name";
            }
        }
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else{
            System.out.println("invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if (this.numberOfFriends<5000){
            this.numberOfFriends = numberOfFriends;
        }else{
            System.out.println("invalid number of friends");
        }
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }
}
