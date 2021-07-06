public class TV {
    private int channel =1;
    private int volumeLevel=0;
    private boolean on = false;
    private String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }
    public TV(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (volumeLevel<=120 && channel>0) {
            this.channel = channel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (isOn() && volumeLevel>0 && volumeLevel<7) {
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }
    public boolean isOn(){
        return this.on;
    }
    public void turnOn(){
        if (this.on){
            System.out.println("TV is already ON");
        }else{
            this.on=true;
        }
    }
    public void turnOff(){
        if (!this.on){
            System.out.println("TV is already OFF");
        }else{
            this.on=true;
        }
    }


}
