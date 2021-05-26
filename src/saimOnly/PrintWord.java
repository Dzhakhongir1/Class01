package saimOnly;



public class PrintWord {
    public static void main(String[] args) {
        int treeSize = 0;
        int growthCm = 1;
        for (int i = 1; i<=10; i++){

            if (i>3){
                treeSize+=1;
                growthCm=2;
            }
            System.out.println("year  " +i+" - growth "+growthCm+" cm");
            treeSize++;
            System.out.println("tree size: "+treeSize+"cm");

            }
        }

    }

