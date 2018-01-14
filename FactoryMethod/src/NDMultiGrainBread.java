public class NDMultiGrainBread implements Bread {

    NDMultiGrainBread(){
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("New Delhi MultiGrain Bread is ready");
    }
}
