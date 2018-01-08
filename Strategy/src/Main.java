public class Main {
    public static void main(String[] args) {

        Car suv=new SUV(new CanRun());
        suv.showCar();
        suv.performRunning();
    }
}
