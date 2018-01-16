import static java.lang.Thread.sleep;

public class MySingelton {


    static MySingelton mInstance;
    public static int count;

    private MySingelton() {
        count++;
    }

    static MySingelton getInstance() {
        if (mInstance == null) {
            synchronized (MySingelton.class) {
                if (mInstance == null)
                    mInstance = new MySingelton();
            }
        }
        return mInstance;
    }


}
