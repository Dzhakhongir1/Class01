package day30_IndruductiontoArrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String []students={"id","firstName","LastName","batchNum","phoneNumber"};
        String []student1={"1234","dzhakhongr","Islamov","22","4023201122"};
        String []student2={"4321","PAha0","dada","55","40365435054"};
        System.out.println("Student id:\t\t\t "+student1[0]);
        System.out.println("Student name:\t"+student1[1]);
        System.out.println("Student last name: "+student1[2]);
        System.out.println("Batch number:\t\t  "+student1[3]);
        System.out.println("Phone number: "+student1[4]);
        if (student1.length==5){
            System.out.println("True");
        }else {
            System.out.println("Fail");
        }
        if (student1.length==student2.length){
            System.out.println("True");
        }else {
            System.out.println("Fail");
        }
        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());
        System.out.println("-----------------------------------------------------------------------");
        for(int i =0; i<=student1.length-1;i++){
            System.out.println(student1[i]);
        }
    }
}
