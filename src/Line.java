public class Line
{
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public static final int GRAY = 0;
    public static final int BLUE = 1;
    public static final int RED = 2;
    public static int status;

    public Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        status = GRAY;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setStatus(int color)
    {
        status = color;
    }

    public int getStatus()
    {
        return status;
    }

}
