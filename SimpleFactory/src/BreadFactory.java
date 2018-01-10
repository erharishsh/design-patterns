public class BreadFactory {

    enum BreadType {BROWN_BREAD, WHITE_BREAD, MULTIGRAIN_BREAD};

    public static Bread getBread(BreadType type) {
        Bread b=null;
        if (type == BreadType.BROWN_BREAD) {
            b = new BrownBread();
        } else if (type == BreadType.WHITE_BREAD) {
            b = new WhiteBread();
        } else if (type == BreadType.MULTIGRAIN_BREAD) {
            b = new MultiGrainBread();
        }
        return b;
    }
}
