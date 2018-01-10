
public class PremiumSUV extends Car{
    public PremiumSUV(Runnable runBehaviour) {
        super(runBehaviour);
    }

    @Override
    public void showCar() {
        System.out.println("This is a PremiumSUV");
    }


}
