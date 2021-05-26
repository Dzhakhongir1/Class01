package CalledPracticeFromtheBoss;

import java.util.ArrayList;

public class Nanuk {
    public static void main(String[] args) {

    }
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
        Integer countOfNanuks=0;
        Integer totalOfHunts=0;
        for (int i =0; i<r.size();i++ ){
            if (r.get(i).equals("nanuk")){
                countOfNanuks++;
            }else{
                totalOfHunts += Integer.parseInt(r.get(i));
            }
        }
        if (totalOfHunts>=boast && countOfNanuks<=way_stones){
            return true;
        } else {
            return false;
        }
    }







    }

