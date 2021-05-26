package day22_string_manipulation;

public class IndexOf {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucomber";
        System.out.println(technologies.indexOf(","));
        // las comma
        System.out.println(technologies.lastIndexOf(","));
        System.out.println(technologies.indexOf("h"));
        int IndexOfJava = technologies.indexOf("java");
        System.out.println("java is at index "+IndexOfJava);
        int idxOfCss = technologies.indexOf("css");
        System.out.println(idxOfCss);
        int selen = technologies.indexOf("testng");
        System.out.println(selen);
        int idexOfCucomber = technologies.indexOf("cucomber");
        System.out.println(idexOfCucomber);
        int indexOfSql = technologies.indexOf("Sql");
        System.out.println(indexOfSql);
        if (technologies.indexOf("maven")>-1){
            System.out.println("maven is present ");
        }else {
            System.out.println("maven is not present");
            /*
            index of method when found returns int index position number whis is always 0 or more
            when not found returns -1
             */
        }

    }
}
