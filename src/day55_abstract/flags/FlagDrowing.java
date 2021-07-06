package day55_abstract.flags;

import java.awt.*;

public class FlagDrowing {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setColor(0,0, Color.RED);
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.WHITE);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.BLUE);
                }else{
                    grid.setColor(row, col, Color.RED);
                }
            }
        }



    }
}
