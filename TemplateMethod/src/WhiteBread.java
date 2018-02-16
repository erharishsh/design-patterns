public class WhiteBread extends Bread {
    @Override
    void prepareIngredients() {
        System.out.println("White bread Ingredients are ready");
    }

    @Override
    void bake() {
        System.out.println("White bread baked at 70 c");
    }
}
