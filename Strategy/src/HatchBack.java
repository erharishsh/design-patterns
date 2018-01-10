
public class HatchBack extends Car{
    public HatchBack(Runnable runBehaviour) {
        super(runBehaviour);
    }

    @Override
    public void showCar() {
        System.out.println("This is a HatchBack");
    }
}
