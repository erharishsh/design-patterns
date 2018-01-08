public class BarView implements Observer {
    int userCount;
    Subject dataGrabber;


    BarView(Subject dataGrabber){
        this.dataGrabber=dataGrabber;
        dataGrabber.registerObserver(this);
    }

    @Override
    public void update(int userCount) {
        this.userCount=userCount;
        ((DataGrabber)dataGrabber).getUserCount();
        System.out.println("=This is bar view==User count is: "+userCount);
    }
}
