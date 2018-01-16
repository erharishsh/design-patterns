import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSerializedSingletonMain {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        MySingelton1 m1,m2 = null;

        m1=MySingelton1.mInstance;


        try {
            FileOutputStream fout=new FileOutputStream("test.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fout);

            objectOutputStream.writeObject(m1);

            objectOutputStream.close();
            fout.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fis=new FileInputStream("test.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fis);
            m2= (MySingelton1) objectInputStream.readObject();

            objectInputStream.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("===m1=="+m1);
        System.out.println("===m2=="+m2);

    }

}
