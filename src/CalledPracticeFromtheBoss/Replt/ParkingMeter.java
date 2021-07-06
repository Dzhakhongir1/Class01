package CalledPracticeFromtheBoss.Replt;

public class ParkingMeter {
    private int timeLeft =0;
    private int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime=maxTime;
    }
    public boolean add(int num){
        boolean check = false;
        if (num==25 && timeLeft<=maxTime){
            this.timeLeft+=30;
            check = true;
        }else {
            check = false;
        }
        return check;

    }
    public void tick (){
        if (this.timeLeft>0) {
            this.timeLeft--;
        }
    }
    public boolean isExpired(){
        if (this.timeLeft==0){
            return true;
        }else {
            return false;
        }
    }
}
