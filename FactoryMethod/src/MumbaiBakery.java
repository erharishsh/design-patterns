import java.net.URLStreamHandler;

public class MumbaiBakery extends Bakery {
    @Override
    Bread createBread(BreadType type) {
        Bread b=null;
        if (type == BreadType.BROWN_BREAD) {
            b = new BrownBread();
        } else if (type ==BreadType.WHITE_BREAD) {
            b = new WhiteBread();
        } else if (type == BreadType.MULTIGRAIN_BREAD) {
            b = new MultiGrainBread();
        }
        return b;
    }

}
