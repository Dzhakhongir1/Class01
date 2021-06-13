package day52_inharitance;

public class Discord extends MobileApp{
    public void chat (String someone ){
        System.out.println("chatting with "+someone+" on Discord");
    }
    @Override
    protected boolean download(){
        System.out.println("Download Discord version 0.023 from App Store");
        return true;

    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Murodil");
    }
    public  void printing(){
        System.out.println("App name = "+ getName());
        System.out.println("App version = "+getVersion());
    }
}
