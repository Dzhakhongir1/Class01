package day14_multi_branch_if_statments;

public class ChooseLanguage {
    public static void main(String[]args){
        int selection = 1;
        if (selection==1){
            System.out.println("hello, thank you for call");
        }else if (selection==2){
            System.out.println("hola, gracias para llmar");
        }else if (selection==3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if (selection==4){
            System.out.println("privet, spasibo za vash zvonik");
        }else if (selection ==5){
            System.out.println("metci, pout votre applel");
        }else{
            System.out.println("lets talk java and english , hello");
        }
    }

}
