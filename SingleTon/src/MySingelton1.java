import java.io.Serializable;

public class MySingelton1 implements Serializable{

    public static MySingelton1 mInstance=new MySingelton1();
    public static int count;

    private MySingelton1() {
        if(mInstance!=null){
            throw new RuntimeException("Instance already created");
        }
        count++;
    }

    Object readResolve(){
        return mInstance;
    }


}
