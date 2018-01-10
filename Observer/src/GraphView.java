public class GraphView implements Observer {
    int userCount;
    Subject dataGrabber;


    GraphView(Subject dataGrabber){
        this.dataGrabber=dataGrabber;
        dataGrabber.registerObserver(this);
    }

    @Override
    public void update(int userCount) {
        this.userCount=userCount;
        System.out.println("=This is graph view==User count is: "+userCount);
    }
}
