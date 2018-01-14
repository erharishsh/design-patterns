public class MultiGrainBread implements Bread {

    MultiGrainBread(){
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("MultiGrain Bread is ready");
    }
}
