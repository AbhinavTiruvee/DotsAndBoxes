public class Box
{

    public Line firstLine, secondLine, thirdLine, fourthLine;
    int status;

    public static final int GRAY = 0;
    public static final int BLUE = 1;
    public static final int RED = 2;

    public Box (Line firstLine, Line secondLine, Line thirdGrade, Line fourthGrade)
    {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdGrade;
        this.fourthLine = fourthGrade;

        status = GRAY;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus()
    {
        if((firstLine.getStatus() == Line.RED) && (secondLine.getStatus() == Line.RED )&& (thirdLine.getStatus() == Line.RED) && (fourthLine.getStatus() == Line.RED))
        {
            status = RED;
        }
        else if((firstLine.getStatus() == Line.BLUE) && (secondLine.getStatus() == Line.BLUE )&& (thirdLine.getStatus() == Line.BLUE) && (fourthLine.getStatus() == Line.BLUE))
        {
            status = BLUE;
        }
    }
}
