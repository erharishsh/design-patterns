public class NDBakery extends Bakery {
    @Override
    Bread createBread(BreadType type) {
        Bread b=null;
        if (type == BreadType.BROWN_BREAD) {
            b = new NDBrownBread();
        } else if (type ==BreadType.WHITE_BREAD) {
            b = new NDWhiteBread();
        } else if (type == BreadType.MULTIGRAIN_BREAD) {
            b = new NDMultiGrainBread();
        }
        return b;
    }
}
