import java.util.ArrayList;
import java.util.Observable;

public class DataGrabber implements Subject {

   ArrayList<Observer> observers;

   int userCount;

   public DataGrabber(){
       observers=new ArrayList();
   }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        int index=observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers) {
            o.update(userCount);
        }
    }

    void setUserCount(int count){
       this.userCount=count;
       notifyObservers();
    }

    int getUserCount(){
      return userCount;
    }

}
