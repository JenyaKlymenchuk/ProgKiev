package HomeWork1;


import java.util.ArrayList;


/**
 * Created by klimenchukev on 08.10.2016.
 */
public class LineRunner {
    public static void main(String[] args){
        Line line1 = new Line(new Point(2, 5), new Point(4, 7));
        Line line2 = new Line(new Point(7, 3), new Point(5, 1));
        Line line3 = new Line(new Point(0, 4), new Point(3, 1));

        ArrayList<Line> lineList = new ArrayList<>();
        lineList.add(0, line1);
        lineList.add(1, line2);
        lineList.add(2, line3);
        
        lineSummary(lineList);
        biggestLine(lineList);
    }

    public static double lineSummary(ArrayList<Line> lineArrayList){
        double lineSumm = 0;
        for(int i = 0; i < lineArrayList.size(); i++){
            lineSumm += lineArrayList.get(i).getLenght();
        }
        return lineSumm;
    }

    public static double biggestLine(ArrayList<Line> lineArrayList){
        double biggestLine = 0;
        for(int i = 0; i < lineArrayList.size(); i++){
            if (lineArrayList.get(i).getLenght() > biggestLine){
                biggestLine = lineArrayList.get(i).getLenght();
            }

        }
        return biggestLine;
    }
}
