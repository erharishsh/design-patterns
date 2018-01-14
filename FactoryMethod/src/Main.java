public class Main {
    public static void main(String[] args) {
        Bakery b=new MumbaiBakery();
        b.orderBread(Bakery.BreadType.MULTIGRAIN_BREAD);


        Bakery b1=new NDBakery();
        b1.orderBread(Bakery.BreadType.MULTIGRAIN_BREAD);

    }
}
