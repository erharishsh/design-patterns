public class Main {
    public static void main(String[] args) {
        Bakery b=new Bakery();
        b.orderBread(BreadFactory.BreadType.MULTIGRAIN_BREAD);
        b.orderBread(BreadFactory.BreadType.WHITE_BREAD);
        b.orderBread(BreadFactory.BreadType.BROWN_BREAD);
    }
}
