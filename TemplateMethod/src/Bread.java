abstract public class Bread {
    void prepareBread(){
        prepareIngredients();
        bake();
        makeSlices();
    }


    void makeSlices(){
        System.out.println("slices are ready");
    }

    abstract void prepareIngredients();
    abstract void bake();

}
