public class WhiteBread implements Bread {

    WhiteBread() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("White Bread is ready");
    }
}
