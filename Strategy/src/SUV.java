
public class SUV extends Car{
    public SUV(Runnable runBehaviour) {
        super(runBehaviour);
    }

    @Override
    public void showCar() {
        System.out.println("This is a SUV");
    }
}
