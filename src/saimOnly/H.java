package saimOnly;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class H {
    public static void main(String[] args) {
        String [] words = {"java","python"};
        for (int i =0; i<words.length;i++){
            if(words[i].equals("java")){
                System.out.print(words[i].replace("java","selenium"));
            }else if(words[i].equals("python")){
                System.out.println(words[i].replace("python","is a lot of fun"));
            }
        }
    }
}
