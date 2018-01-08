public class Main {
    public static void main(String[] args) {
        DataGrabber dataGrabber=new DataGrabber();
        TableView tableView=new TableView(dataGrabber);
        GraphView graphView=new GraphView(dataGrabber);
        BarView barView=new BarView(dataGrabber);

        dataGrabber.setUserCount(5);
        dataGrabber.setUserCount(15);

        tableView.stopWatching();

        dataGrabber.setUserCount(5);

    }
}
