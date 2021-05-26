package day08_casting__scanner;

import sun.awt.geom.AreaOp;

public class CastingExamples {
    public static void main(String[] args) {
        // byte-short-int-long
  //      byte num1=100;
    //    short num2=num1;
      //  int num3=num2;
        //long num4=num3;
//        int num5=1000;

       // System.out.println(num4);
        //int num8=3456;
     //   double num9= num8;
      //  System.out.println("num9 =" + num9);
       double num13=55.3;
       float num14 = (float)num13;
        System.out.println(num13);
        System.out.println(num14);
          double num15 = 1234.5;
          // if you dont want desimal write smaller varioble it will remove decimal and keeping the change

          int num16 =(int) num15;
          System.out.println("num 15 = "+num15);
          System.out.println("num 16 = "+num16);

          int num17= 300;
          byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
    // summary of casting
        /*
       casting char to int
       char letter ='a'; // 97
       int numLetter = letter;
       System.out.println(numLetter);->97

         */
        char letter ='j'; // 106
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println(numLetter);//->106+
        char ch='j';
        int chNum = ch;
        //Summary we can cast primitives from one to another .
        //from smaller to larger to automatic casting/conversion
        //from larger to smaller -. implicit casting , we nned to use ()
        //byte -short-int-long-float-double

        double d =10.5;
        short sh =(short) d;
        System.out.println(sh);
        double c = 123.55;
        short a =(short) c;
        System.out.println(a);
        /*when we cast from small to large we dont need prentesis and casting
        when we go large to small we need to cast them whic put prentesis and data type of varioble
        ex
           double d =10.5;
        short sh =(short) d;
        System.out.println(sh);

        double c = 123.55;
        short a =(short) c;
        System.out.println(a);


         */
    }
}
