public class Bakery {

    Bread b;

    void orderBread(BreadFactory.BreadType type){

        b=BreadFactory.getBread(type);
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


}
