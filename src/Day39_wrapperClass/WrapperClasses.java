package Day39_wrapperClass;

import sun.text.normalizer.UCharacter;

public class WrapperClasses {
    public static void main(String[] args) {
        int num =100;
        Integer n=new Integer(500);
        System.out.println("is n 500>?="+n.equals(500));
        System.out.println(n+300);
        Integer n2=1000;
        String numStr=n2+"";
        String numSt=n2.toString();
        System.out.println(numSt);
        Byte b1= new Byte((byte)5);
        Byte b2 =10;

        Short sh1=new Short((short)40);
        Short sh2=50;

        Integer i1 =new Integer(100);
        Integer i2=200;

        Long l1 =new Long(300l);
        Long l2= 3455l;

        Float fl1= new Float(5.2);
        Float fl2=45.3f;

        Double d1 = new Double (345.3);
        Double d2 = 234.5;

        Character ch1= new Character('Q');
        Character ch2='V';

        Boolean bl1=new Boolean(true);
        Boolean bl2= false;

    }
}
