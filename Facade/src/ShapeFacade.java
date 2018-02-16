public class ShapeFacade {

    Circle circle;
    Rectangle rectangle;
    Line line;


    ShapeFacade() {
         rectangle=new Rectangle();
         circle =new Circle();
         line=new Line();
    }


    void drawImage1() {
        rectangle.draw();
        circle.draw();
        rectangle.draw();
        line.draw();
    }


    void drawImage2() {
        circle.draw();
        line.draw();
    }

}
