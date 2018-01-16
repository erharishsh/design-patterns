public class Main {
    private static MySingelton m1,m2;

    public static void main(String[] args) throws InterruptedException {

  /*  MySingelton1 m=MySingelton1.mInstance;
    MySingelton1 m1=MySingelton1.mInstance;

    System.out.println("MySingleton1==="+MySingelton1.count);



        MySingelton m2=MySingelton.getInstance();
        MySingelton m3=MySingelton.getInstance();

        System.out.println("MySingleton==="+MySingelton.count);
*/
        MySingelton.getInstance();

       Thread t1= new Thread(() -> {
            m1=MySingelton.getInstance();
        });
       t1.start();

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
             m2= MySingelton.getInstance();
            }
        });
        t2.start();


        t1.join();
        t2.join();

        System.out.println("MySingleton==="+MySingelton.count);
        System.out.println("m1==="+m1);
        System.out.println("m2==="+m2);



    }
}
