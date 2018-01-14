public abstract class Bakery {
    enum BreadType {BROWN_BREAD, WHITE_BREAD, MULTIGRAIN_BREAD};
    Bread b;

    void orderBread(BreadType type){

        b=createBread(type);
        makeSlices();
        pack();
        System.out.println("order is ready to dispatched");
    }

    void pack(){
        System.out.println("order is packed");
    }

    void makeSlices(){
        System.out.println("slices are ready");
    }

    abstract Bread createBread(BreadType type);


}
