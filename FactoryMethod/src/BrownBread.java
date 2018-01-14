public class BrownBread implements Bread {

    BrownBread(){
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Brown Bread is ready");
    }
}
