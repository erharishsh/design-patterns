
public class Car {

    Runnable runBehaviour;


    public Car(Runnable runBehaviour){
        this.runBehaviour=runBehaviour;
    }

    public void getCategory(){
        System.out.println("This is a four wheeler");
    }

    public void showCar(){

    }



    public void performRunning(){
        runBehaviour.run();
    }


}
