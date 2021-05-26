package Day18NEstedIf;

public class Season_finder {
    public static void main(String[] args) {
    int month =2;
      switch(month){
          case 12:
          case 2:
          case 1:
              System.out.println("Winter");
              break;
          case 3:
          case 4:
          case 5:
              System.out.println("Summer");
              break;
          case 9:
          case 10:
          case 11:
              System.out.println("Fall");
              break;
          default:
              System.out.println("season is"+month);
      }

    }
}
