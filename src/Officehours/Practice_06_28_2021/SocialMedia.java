package Officehours.Practice_06_28_2021;
/*

 */
public abstract class SocialMedia {
    String personUrl;
    int accountLength;
    static String Platform;

    public abstract void directMessage(String userName, String body);
    public abstract void post(String body);
    public abstract void notifications();
}
