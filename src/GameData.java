import java.util.ArrayList;

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
    public ArrayList<Line> lines = new ArrayList<>();

    //keep going
    public char[][] boxes;


    public int redScore;
    public int blueScore;

    public GameData()
    {
        redScore = 0;
        blueScore = 0;
        boxes = new char[5][5];
        for(int i = 0; i< boxes.length; i++)
        {
            for(int j = 0; j< boxes[0].length; j++)
            {
                boxes[i][j] = ' ';
            }
        }
        //add all lines to line
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);
        lines.add(line4);
        lines.add(line5);
        lines.add(line6);
        lines.add(line7);
        lines.add(line8);
        lines.add(line9);
        lines.add(line10);
        lines.add(line11);
        lines.add(line12);
        lines.add(line13);
        lines.add(line14);
        lines.add(line15);
        lines.add(line16);
        lines.add(line17);
        lines.add(line18);
        lines.add(line19);
        lines.add(line20);
        lines.add(line21);
        lines.add(line22);
        lines.add(line23);
        lines.add(line24);
        lines.add(line25);
        lines.add(line26);
        lines.add(line27);
        lines.add(line28);
        lines.add(line29);
        lines.add(line30);
        lines.add(line31);
        lines.add(line32);
        lines.add(line33);
        lines.add(line34);
        lines.add(line35);
        lines.add(line36);
        lines.add(line37);
        lines.add(line38);
        lines.add(line39);
        lines.add(line40);
        lines.add(line41);
        lines.add(line42);
        lines.add(line43);
        lines.add(line44);
        lines.add(line45);
        lines.add(line46);
        lines.add(line47);
        lines.add(line48);
        lines.add(line49);
        lines.add(line50);
        lines.add(line51);
        lines.add(line52);
        lines.add(line53);
        lines.add(line54);
        lines.add(line55);
        lines.add(line56);
        lines.add(line57);
        lines.add(line58);
        lines.add(line59);
        lines.add(line60);
    }

    public char[][] getBoxes()
    {
        return boxes;
    }
    public ArrayList<Line> getLines()
    {
        return lines;
    }


    public void reset()
    {

        boxes = new char[5][5];
        for(int r=0;r<boxes.length; r++)
            for(int c=0; c<boxes[0].length; c++)
                boxes[r][c]=' ';
    }

    public boolean isWinner(char player)
    {
        int numBoxesPlayerColor = 0;

        //if theres an empty box, return false
        //if all the boxes are full, see if the player has the most boxes
        for(int i = 0; i<boxes.length; i++)
        {
            for(int j = 0; j<boxes[0].length; j++)
            {
                if(boxes[i][j] == ' ')
                {
                    return false;
                }
                else if(boxes[i][j] == player)
                {
                    numBoxesPlayerColor++;
                }
            }
        }

        return numBoxesPlayerColor >= 13;

    }

    public void setBoxes()
    {
        //box 0,0
        if(line1.getStatus() == Line.RED && line6.getStatus() == Line.RED && line7.getStatus() == Line.RED && line12.getStatus() == Line.RED)
        {
            boxes[0][0] = 'R';
        }
        else if(line1.getStatus() == Line.BLUE && line6.getStatus() == Line.BLUE && line7.getStatus() == Line.BLUE && line12.getStatus() == Line.BLUE)
        {
            boxes[0][0] = 'B';
        }

        //box 0,1
        if(line2.getStatus() == Line.RED && line7.getStatus() == Line.RED && line8.getStatus() == Line.RED && line13.getStatus() == Line.RED)
        {
            boxes[0][1] = 'R';
        }
        else if(line2.getStatus() == Line.BLUE && line7.getStatus() == Line.BLUE && line8.getStatus() == Line.BLUE && line13.getStatus() == Line.BLUE)
        {
            boxes[0][1] = 'B';
        }

        //box 0,2
        if(line3.getStatus() == Line.RED && line8.getStatus() == Line.RED && line9.getStatus() == Line.RED && line14.getStatus() == Line.RED)
        {
            boxes[0][2] = 'R';
        }
        else if(line3.getStatus() == Line.BLUE && line8.getStatus() == Line.BLUE && line9.getStatus() == Line.BLUE && line14.getStatus() == Line.BLUE)
        {
            boxes[0][2] = 'B';
        }

        //box 0,3
        if(line4.getStatus() == Line.RED && line9.getStatus() == Line.RED && line10.getStatus() == Line.RED && line15.getStatus() == Line.RED)
        {
            boxes[0][3] = 'R';
        }
        else if(line4.getStatus() == Line.BLUE && line9.getStatus() == Line.BLUE && line10.getStatus() == Line.BLUE && line15.getStatus() == Line.BLUE)
        {
            boxes[0][3] = 'B';
        }

        //box 0,4
        if(line5.getStatus() == Line.RED && line10.getStatus() == Line.RED && line11.getStatus() == Line.RED && line16.getStatus() == Line.RED)
        {
            boxes[0][4] = 'R';
        }
        else if(line5.getStatus() == Line.BLUE && line10.getStatus() == Line.BLUE && line11.getStatus() == Line.BLUE && line16.getStatus() == Line.BLUE)
        {
            boxes[0][4] = 'B';
        }

        //box 1,0
        if(line12.getStatus() == Line.RED && line17.getStatus() == Line.RED && line18.getStatus() == Line.RED && line23.getStatus() == Line.RED)
        {
            boxes[1][0] = 'R';
        }
        else if(line12.getStatus() == Line.BLUE && line17.getStatus() == Line.BLUE && line18.getStatus() == Line.BLUE && line23.getStatus() == Line.BLUE)
        {
            boxes[1][0] = 'B';
        }

        //box 1,1
        if(line13.getStatus() == Line.RED && line18.getStatus() == Line.RED && line19.getStatus() == Line.RED && line24.getStatus() == Line.RED)
        {
            boxes[1][1] = 'R';
        }
        else if(line13.getStatus() == Line.BLUE && line18.getStatus() == Line.BLUE && line19.getStatus() == Line.BLUE && line24.getStatus() == Line.BLUE)
        {
            boxes[1][1] = 'B';
        }

        //box 1,2
        if(line14.getStatus() == Line.RED && line19.getStatus() == Line.RED && line20.getStatus() == Line.RED && line25.getStatus() == Line.RED)
        {
            boxes[1][2] = 'R';
        }
        else if(line14.getStatus() == Line.BLUE && line19.getStatus() == Line.BLUE && line20.getStatus() == Line.BLUE && line25.getStatus() == Line.BLUE)
        {
            boxes[1][2] = 'B';
        }

        //box 1,3
        if(line15.getStatus() == Line.RED && line20.getStatus() == Line.RED && line21.getStatus() == Line.RED && line26.getStatus() == Line.RED)
        {
            boxes[1][3] = 'R';
        }
        else if(line15.getStatus() == Line.BLUE && line20.getStatus() == Line.BLUE && line21.getStatus() == Line.BLUE && line26.getStatus() == Line.BLUE)
        {
            boxes[1][3] = 'B';
        }

        //box 1,4
        if(line16.getStatus() == Line.RED && line21.getStatus() == Line.RED && line22.getStatus() == Line.RED && line27.getStatus() == Line.RED)
        {
            boxes[1][4] = 'R';
        }
        else if(line16.getStatus() == Line.BLUE && line21.getStatus() == Line.BLUE && line22.getStatus() == Line.BLUE && line27.getStatus() == Line.BLUE)
        {
            boxes[1][4] = 'B';
        }

        //box 2,0
        if(line23.getStatus() == Line.RED && line28.getStatus() == Line.RED && line29.getStatus() == Line.RED && line34.getStatus() == Line.RED)
        {
            boxes[2][0] = 'R';
        }
        else if(line23.getStatus() == Line.BLUE && line28.getStatus() == Line.BLUE && line29.getStatus() == Line.BLUE && line34.getStatus() == Line.BLUE)
        {
            boxes[2][0] = 'B';
        }

        //box 2,1
        if(line24.getStatus() == Line.RED && line29.getStatus() == Line.RED && line30.getStatus() == Line.RED && line35.getStatus() == Line.RED)
        {
            boxes[2][1] = 'R';
        }
        else if(line24.getStatus() == Line.BLUE && line29.getStatus() == Line.BLUE && line30.getStatus() == Line.BLUE && line35.getStatus() == Line.BLUE)
        {
            boxes[2][1] = 'B';
        }

        //box 2,2
        if(line25.getStatus() == Line.RED && line30.getStatus() == Line.RED && line31.getStatus() == Line.RED && line36.getStatus() == Line.RED)
        {
            boxes[2][2] = 'R';
        }
        else if(line25.getStatus() == Line.BLUE && line30.getStatus() == Line.BLUE && line31.getStatus() == Line.BLUE && line36.getStatus() == Line.BLUE)
        {
            boxes[2][2] = 'B';
        }

        //box 2,3
        if(line26.getStatus() == Line.RED && line31.getStatus() == Line.RED && line32.getStatus() == Line.RED && line37.getStatus() == Line.RED)
        {
            boxes[2][3] = 'R';
        }
        else if(line26.getStatus() == Line.BLUE && line31.getStatus() == Line.BLUE && line32.getStatus() == Line.BLUE && line37.getStatus() == Line.BLUE)
        {
            boxes[2][3] = 'B';
        }

        //box 2,4
        if(line27.getStatus() == Line.RED && line32.getStatus() == Line.RED && line33.getStatus() == Line.RED && line38.getStatus() == Line.RED)
        {
            boxes[2][4] = 'R';
        }
        else if(line27.getStatus() == Line.BLUE && line32.getStatus() == Line.BLUE && line33.getStatus() == Line.BLUE && line38.getStatus() == Line.BLUE)
        {
            boxes[2][4] = 'B';
        }

        //box 3,0

        if(line34.getStatus() == Line.RED && line39.getStatus() == Line.RED && line40.getStatus() == Line.RED && line45.getStatus() == Line.RED)
        {
            boxes[3][0] = 'R';
        }
        else if(line34.getStatus() == Line.BLUE && line39.getStatus() == Line.BLUE && line40.getStatus() == Line.BLUE && line45.getStatus() == Line.BLUE)
        {
            boxes[3][0] = 'B';
        }

        //box 3,1

        if(line35.getStatus() == Line.RED && line40.getStatus() == Line.RED && line41.getStatus() == Line.RED && line46.getStatus() == Line.RED)
        {
            boxes[3][1] = 'R';
        }
        else if(line35.getStatus() == Line.BLUE && line40.getStatus() == Line.BLUE && line41.getStatus() == Line.BLUE && line46.getStatus() == Line.BLUE)
        {
            boxes[3][1] = 'B';
        }

        //box 3,2

        if(line36.getStatus() == Line.RED && line41.getStatus() == Line.RED && line42.getStatus() == Line.RED && line47.getStatus() == Line.RED)
        {
            boxes[3][2] = 'R';
        }
        else if(line36.getStatus() == Line.BLUE && line41.getStatus() == Line.BLUE && line42.getStatus() == Line.BLUE && line47.getStatus() == Line.BLUE)
        {
            boxes[3][2] = 'B';
        }

        //box 3,3

        if(line37.getStatus() == Line.RED && line42.getStatus() == Line.RED && line43.getStatus() == Line.RED && line48.getStatus() == Line.RED)
        {
            boxes[3][3] = 'R';
        }
        else if(line37.getStatus() == Line.BLUE && line42.getStatus() == Line.BLUE && line43.getStatus() == Line.BLUE && line48.getStatus() == Line.BLUE)
        {
            boxes[3][3] = 'B';
        }

        //box 3,4

        if(line38.getStatus() == Line.RED && line43.getStatus() == Line.RED && line44.getStatus() == Line.RED && line49.getStatus() == Line.RED)
        {
            boxes[3][4] = 'R';
        }
        else if(line38.getStatus() == Line.BLUE && line43.getStatus() == Line.BLUE && line44.getStatus() == Line.BLUE && line49.getStatus() == Line.BLUE)
        {
            boxes[3][4] = 'B';
        }

        //box 4,0
        if(line45.getStatus() == Line.RED && line50.getStatus() == Line.RED && line51.getStatus() == Line.RED && line56.getStatus() == Line.RED)
        {
            boxes[4][0] = 'R';
        }
        else if(line45.getStatus() == Line.BLUE && line50.getStatus() == Line.BLUE && line51.getStatus() == Line.BLUE && line56.getStatus() == Line.BLUE)
        {
            boxes[4][0] = 'B';
        }

        //box 4,1

        if(line46.getStatus() == Line.RED && line51.getStatus() == Line.RED && line52.getStatus() == Line.RED && line57.getStatus() == Line.RED)
        {
            boxes[4][1] = 'R';
        }
        else if(line46.getStatus() == Line.BLUE && line51.getStatus() == Line.BLUE && line52.getStatus() == Line.BLUE && line57.getStatus() == Line.BLUE)
        {
            boxes[4][1] = 'B';
        }

        //box 4,2
        if(line47.getStatus() == Line.RED && line52.getStatus() == Line.RED && line53.getStatus() == Line.RED && line58.getStatus() == Line.RED)
        {
            boxes[4][2] = 'R';
        }
        else if(line47.getStatus() == Line.BLUE && line52.getStatus() == Line.BLUE && line53.getStatus() == Line.BLUE && line58.getStatus() == Line.BLUE)
        {
            boxes[4][2] = 'B';
        }

        //box 4,3
        if(line48.getStatus() == Line.RED && line53.getStatus() == Line.RED && line54.getStatus() == Line.RED && line59.getStatus() == Line.RED)
        {
            boxes[4][3] = 'R';
        }
        else if(line48.getStatus() == Line.BLUE && line53.getStatus() == Line.BLUE && line54.getStatus() == Line.BLUE && line59.getStatus() == Line.BLUE)
        {
            boxes[4][3] = 'B';
        }

        //box 4,4
        if(line49.getStatus() == Line.RED && line54.getStatus() == Line.RED && line55.getStatus() == Line.RED && line60.getStatus() == Line.RED)
        {
            boxes[4][4] = 'R';
        }
        else if(line49.getStatus() == Line.BLUE && line54.getStatus() == Line.BLUE && line55.getStatus() == Line.BLUE && line60.getStatus() == Line.BLUE)
        {
            boxes[4][4] = 'B';
        }
    }
}
