public class NDWhiteBread implements Bread {

    NDWhiteBread() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("New Delhi White Bread is ready");
    }
}
