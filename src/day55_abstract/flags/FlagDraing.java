package day55_abstract.flags;

public class FlagDraing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        FranchFlag franchFlag = new FranchFlag();
        franchFlag.draw();

        UkraineFlag ukraineFlag = new UkraineFlag();
        ukraineFlag.draw();
    }
}
