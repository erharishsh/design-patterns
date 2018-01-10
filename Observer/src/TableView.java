public class TableView implements Observer {
    int userCount;
    Subject dataGrabber;


    TableView(Subject dataGrabber){
        this.dataGrabber=dataGrabber;
        dataGrabber.registerObserver(this);
    }

    @Override
    public void update(int userCount) {
        this.userCount=userCount;
        System.out.println("=This is table view==User count is: "+userCount);
    }


    void stopWatching(){
        if(dataGrabber!=null){
            dataGrabber.unRegisterObserver(this);
        }
    }


}
