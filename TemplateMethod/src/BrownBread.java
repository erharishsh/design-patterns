public class BrownBread extends Bread {
    @Override
    void prepareIngredients() {
        System.out.println("Brown bread Ingredients are ready");
    }

    @Override
    void bake() {
        System.out.println("Brown bread baked at 90 c");
    }
}
