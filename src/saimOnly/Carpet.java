package saimOnly;

public class Carpet {
    public double length, width, unitPrice ,totalPrice;
    public boolean isPersian =true;

    public Carpet(){
        this.length=300*300;
        this.totalPrice=200;
        this.unitPrice=0;
        this.isPersian=false;

    }
    public Carpet (double width, double length, double unitPrice,boolean isPersian  ){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.totalPrice= width +length * totalPrice;
        if (isPersian==true){
            totalPrice+=200;
        }
    }

}
