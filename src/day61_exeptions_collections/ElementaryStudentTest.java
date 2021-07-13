package day61_exeptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        elementratyStudent el = null;
        try {
            el = new elementratyStudent();
            el.setName("bob");
            el.setAge(1);
            System.out.println(el.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Execution completed");
    }
}
