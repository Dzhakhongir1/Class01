package day40b_ReviewClass;

public class Sumofnumbers {
    public static void main(String[] args) {
        System.out.println(getSomeFrom("a5bc12def100g"));
    }
  public static int getSomeFrom(String str){
      int sum =0;
      String num="";  //  5
      for (int i=0; i<str.length();i++){
          if(Character.isDigit(str.charAt(i))){
              num+= str.charAt(i);
              if(!Character.isDigit(str.charAt(i+1))){
                  sum+=Integer.parseInt(num);
                  num="";//
              }
          }

      }
      return sum;





  }
}
