import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingleton {

    enum Logger{
        MYLOGGER;

        void printLogs(){
            System.out.println("here is my logger");
        }
    }

    public static void main(String[] args) {

        Logger l=Logger.MYLOGGER;
        l.printLogs();
        Constructor<Logger>[] c = (Constructor<Logger>[]) Logger.class.getDeclaredConstructors();
        for(Constructor co:c){
            co.setAccessible(true);
            try {
                co.newInstance(null);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }

}
