public class GameData
{
    public Line line1 = new Line(0,0, 1, 0);
    public Line line2 = new Line(1,0,2,0);
    public Line line3 = new Line(2,0,3,0);
    public Line line4 = new Line(3,0,4,0);
    public Line line5 = new Line(4,0,5,0);

    public Line line6 = new Line(0,0,0,1);
    public Line line7 = new Line(1,0,1,1);
    public Line line8 = new Line(2,0,2,1);
    public Line line9 = new Line(3,0,3,1);
    public Line line10 = new Line(4,0,4,1);
    public Line line11 = new Line(5,0,5,1);

    public Line line12 = new Line(0,1,1,1);
    public Line line13 = new Line(1,1,2,1);
    public Line line14 = new Line(2,1,3,1);
    public Line line15 = new Line(3,1,4,1);
    public Line line16 = new Line(4,1,5,1);

    public Line line17 = new Line(0,1,0,2);
    public Line line18 = new Line(1,1,1,2);
    public Line line19 = new Line(2,1,2,2);
    public Line line20 = new Line(3,1,3,2);
    public Line line21 = new Line(4,1,4,2);
    public Line line22 = new Line(5,1,5,2);

    public Line line23 = new Line(0,2,1,2);
    public Line line24 = new Line(1,2,2,2);
    public Line line25 = new Line(2,2,3,2);
    public Line line26 = new Line(3,2,4,2);
    public Line line27 = new Line(4,2,5,2);

    public Line line28 = new Line(0,2,0,3);
    public Line line29 = new Line(1,2,1,3);
    public Line line30 = new Line(2,2,2,3);
    public Line line31 = new Line(3,2,3,3);
    public Line line32 = new Line(4,2,4,3);
    public Line line33 = new Line(5,2,5,3);

    public Line line34 = new Line(0,3,1,3);
    public Line line35 = new Line(1,3,2,3);
    public Line line36 = new Line(2,3,3,3);
    public Line line37 = new Line(3,3,4,3);
    public Line line38 = new Line(4,3,5,3);

    public Line line39 = new Line(0,3,0,4);
    public Line line40 = new Line(1,3,1,4);
    public Line line41 = new Line(2,3,2,4);
    public Line line42 = new Line(3,3,3,4);
    public Line line43 = new Line(4,3,4,4);
    public Line line44 = new Line(5,3,5,4);

    public Line line45 = new Line(0,4,1,4);
    public Line line46 = new Line(1,4,2,4);
    public Line line47 = new Line(2,4,3,4);
    public Line line48 = new Line(3,4,4,4);
    public Line line49 = new Line(4,4,5,4);

    public Line line50 = new Line(0,4,0,5);
    public Line line51 = new Line(1,4,1,5);
    public Line line52 = new Line(2,4,2,5);
    public Line line53 = new Line(3,4,3,5);
    public Line line54 = new Line(4,4,4,5);
    public Line line55 = new Line(5,4,5,5);

    public Line line56 = new Line(0,5,1,5);
    public Line line57 = new Line(1,5,2,5);
    public Line line58 = new Line(2,5,3,5);
    public Line line59 = new Line(3,5,4,5);
    public Line line60 = new Line(4,5,5,5);

    //keep going
    public Box box1, box2, box3, box4, box5, box6, box7, box8;

    public int redScore;
    public int blueScore;

    public GameData()
    {
        redScore = 0;
        blueScore = 0;
    }

    public void setScores()
    {

    }
}
