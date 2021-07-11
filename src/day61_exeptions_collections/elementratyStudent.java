package day61_exeptions_collections;

public class elementratyStudent {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<5 || age>=12){
            throw new IllegalArgumentException("Age cannot be less than 5 or more then 12 ");
        }else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()){
        throw new IllegalArgumentException("Name can not be empty");
        }else {
            this.name = name;
        }
    }
}
