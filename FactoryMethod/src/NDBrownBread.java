public class NDBrownBread implements Bread {

    NDBrownBread(){
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("New Delhi Brown Bread is ready");
    }
}
