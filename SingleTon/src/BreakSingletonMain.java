import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonMain {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        MySingelton1 m1,m2 = null;

        m1=MySingelton1.mInstance;


        Constructor[] constructors=MySingelton1.class.getDeclaredConstructors();

        for(Constructor c:constructors){
            c.setAccessible(true);
            m2= (MySingelton1) c.newInstance(null);
        }


        System.out.println("===m1=="+m1);
        System.out.println("===m2=="+m2);

    }

}
