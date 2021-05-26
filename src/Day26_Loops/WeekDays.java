package Day26_Loops;

import java.sql.SQLOutput;

public class WeekDays {
    public static void main(String[] args) {
        for (int i =1;i<=10;i++){
            switch (i){
                case 1:
                    System.out.println("day "+i+" [Monday]   ->java");
                    break;
                case 2:
                    System.out.println("day "+i+"[Tuesday]   ->java");
                    break;
                case 3:
                    System.out.println("day "+i+" [Wednesday]->java");
                    break;
                case 4:
                    System.out.println("day "+i+" [Thursday] ->Soft skill");
                    break;
                case 5:
                    System.out.println("day "+i+" [Friday]   ->no class");
                    break;
                case 6:
                    System.out.println("day "+i+" [Saturday] ->java");
                    break;
                case 7:
                    System.out.println("day "+i+" [Sunday]   ->java \nrepeat");
                    break;

            }
        }
    }
}
