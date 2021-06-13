package day52_inharitance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(11);
        mobileApp.download();

        Instagrram instagrra = new Instagrram();
        instagrra.setName("Instagram");
        instagrra.useTheApp(20);
        instagrra.setVersion(6.23);
        instagrra.download();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.useTheApp(101);
        discord.setVersion(111);
        discord.download();
        discord.printing();
        System.out.println(discord.getName());

    }
}
