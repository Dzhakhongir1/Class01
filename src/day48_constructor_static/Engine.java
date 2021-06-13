package day48_constructor_static;

public class Engine {
    private int cilinder;

    public Engine(int cilinder) {
        this.cilinder = cilinder;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cilinder=" + cilinder +
                '}';
    }

    public Engine() {
    }

    public int getCilinder() {
        return cilinder;
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }
}
