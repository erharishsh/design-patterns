
public class Sedan extends Car{
    public Sedan(Runnable runBehaviour) {
        super(runBehaviour);
    }

    @Override
    public void showCar() {
        System.out.println("This is a Sedan");
    }
}
