package HomeWork1;


/**
 * Created by klimenchukev on 06.10.2016.
 */
public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public double getLenght(){
        return Math.sqrt(Math.pow((start.getX() - end.getX()), 2) + Math.pow((start.getY() - end.getY()), 2));
    }
}
