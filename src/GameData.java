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

    public char[][] boxes = {{' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '}};
    public int redScore = 0;
    public int blueScore = 0;


    public void addLines()
    {
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
        printBoard();
        int numPlayerBoxes = 0;
        for(int i = 0; i<boxes.length;i++)
        {
            for(int j = 0; j<boxes[0].length; j++)
            {
                if(boxes[i][j] == ' ')
                {
                    System.out.println(i+" "+j+" ");
                    return false;
                }
                else if(boxes[i][j] == player)
                {
                    numPlayerBoxes++;
                }
            }
        }
        if (numPlayerBoxes>=13)
        {
            return true;
        }
        else
        {
            return false;
        }


    }

    public int score(char player)
    {
        int numBoxesPlayerColor = 0;
        for(int i = 0; i<boxes.length; i++)
        {
            for(int j = 0; j<boxes[0].length; j++)
            {
                if(boxes[i][j] == player)
                {
                    numBoxesPlayerColor++;
                }
            }
        }
        return numBoxesPlayerColor;
    }

    public void setBoxes(String line, char player)
    {
        if(line.equals("line1"))
        {
            if(line6.getStatus() !=Line.GRAY && line7.getStatus() !=Line.GRAY && line12.getStatus() !=Line.GRAY)
            {
                boxes[0][0] = player;
            }
        }
        else if(line.equals("line2"))
        {
            if(line7.getStatus() !=Line.GRAY && line8.getStatus() !=Line.GRAY && line13.getStatus() !=Line.GRAY)
            {
                boxes[0][1] = player;
            }
        }
        else if(line.equals("line3"))
        {
            if(line8.getStatus() !=Line.GRAY && line9.getStatus() !=Line.GRAY && line14.getStatus() !=Line.GRAY)
            {
                boxes[0][2] = player;
            }
        }
        else if(line.equals("line4"))
        {
            if(line9.getStatus() !=Line.GRAY && line10.getStatus() !=Line.GRAY && line15.getStatus() !=Line.GRAY)
            {
                boxes[0][3] = player;
            }
        }
        else if(line.equals("line5"))
        {
            if(line10.getStatus() !=Line.GRAY && line11.getStatus() !=Line.GRAY && line16.getStatus() !=Line.GRAY)
            {
                boxes[0][4] = player;
            }
        }
        else if(line.equals("line6"))
        {
            if(line1.getStatus() !=Line.GRAY && line7.getStatus() !=Line.GRAY && line12.getStatus() !=Line.GRAY)
            {
                boxes[0][0] = player;
            }
        }
        else if(line.equals("line7"))
        {
            if(line1.getStatus() !=Line.GRAY && line6.getStatus() !=Line.GRAY && line12.getStatus() !=Line.GRAY)
            {
                boxes[0][0] = player;
            }
            if(line2.getStatus() !=Line.GRAY && line8.getStatus() !=Line.GRAY && line13.getStatus() !=Line.GRAY)
            {
                boxes[0][1] = player;
            }
        }
        else if(line.equals("line8"))
        {
            if(line2.getStatus() !=Line.GRAY && line7.getStatus() !=Line.GRAY && line13.getStatus() !=Line.GRAY)
            {
                boxes[0][1] = player;
            }
            if(line3.getStatus() !=Line.GRAY && line9.getStatus() !=Line.GRAY && line14.getStatus() !=Line.GRAY)
            {
                boxes[0][2] = player;
            }
        }
        else if(line.equals("line9"))
        {
            if(line3.getStatus() !=Line.GRAY && line8.getStatus() !=Line.GRAY && line14.getStatus() !=Line.GRAY)
            {
                boxes[0][2] = player;
            }
            if(line4.getStatus() !=Line.GRAY && line10.getStatus() !=Line.GRAY && line15.getStatus() !=Line.GRAY)
            {
                boxes[0][3] = player;
            }
        }
        else if(line.equals("line10"))
        {
            if(line4.getStatus() !=Line.GRAY && line9.getStatus() !=Line.GRAY && line15.getStatus() !=Line.GRAY)
            {
                boxes[0][3] = player;
            }
            if(line5.getStatus() !=Line.GRAY && line11.getStatus() !=Line.GRAY && line16.getStatus() !=Line.GRAY)
            {
                boxes[0][4] = player;
            }
        }
        else if(line.equals("line11"))
        {
            if(line5.getStatus() !=Line.GRAY && line10.getStatus() !=Line.GRAY && line16.getStatus() !=Line.GRAY)
            {
                boxes[0][4] = player;
            }
        }
        else if(line.equals("line12"))
        {
            if(line1.getStatus() !=Line.GRAY && line6.getStatus() !=Line.GRAY && line7.getStatus() !=Line.GRAY)
            {
                boxes[0][0] = player;
            }
            if(line17.getStatus() !=Line.GRAY && line18.getStatus() !=Line.GRAY && line23.getStatus() !=Line.GRAY)
            {
                boxes[1][0] = player;
            }
        }
        else if(line.equals("line13"))
        {
            if(line2.getStatus() !=Line.GRAY && line8.getStatus() !=Line.GRAY && line7.getStatus() !=Line.GRAY)
            {
                boxes[0][1] = player;
            }
            if(line18.getStatus() !=Line.GRAY && line19.getStatus() !=Line.GRAY && line24.getStatus() !=Line.GRAY)
            {
                boxes[1][1] = player;
            }
        }
        else if(line.equals("line14"))
        {
            if(line3.getStatus() !=Line.GRAY && line8.getStatus() !=Line.GRAY && line9.getStatus() !=Line.GRAY)
            {
                boxes[0][2] = player;
            }
            if(line19.getStatus() !=Line.GRAY && line20.getStatus() !=Line.GRAY && line25.getStatus() !=Line.GRAY)
            {
                boxes[1][2] = player;
            }
        }
        else if(line.equals("line15"))
        {
            if(line4.getStatus() !=Line.GRAY && line9.getStatus() !=Line.GRAY && line10.getStatus() !=Line.GRAY)
            {
                boxes[0][3] = player;
            }
            if(line20.getStatus() !=Line.GRAY && line21.getStatus() !=Line.GRAY && line26.getStatus() !=Line.GRAY)
            {
                boxes[1][3] = player;
            }
        }
        else if(line.equals("line16"))
        {
            if(line5.getStatus() !=Line.GRAY && line10.getStatus() !=Line.GRAY && line11.getStatus() !=Line.GRAY)
            {
                boxes[0][4] = player;
            }
            if(line21.getStatus() !=Line.GRAY && line22.getStatus() !=Line.GRAY && line27.getStatus() !=Line.GRAY)
            {
                boxes[1][4] = player;
            }
        }
        else if(line.equals("line17"))
        {
            if(line12.getStatus() !=Line.GRAY && line18.getStatus() !=Line.GRAY && line23.getStatus() !=Line.GRAY)
            {
                boxes[1][0] = player;
            }
        }
        else if(line.equals("line18"))
        {
            if(line12.getStatus() !=Line.GRAY && line17.getStatus() !=Line.GRAY && line23.getStatus() !=Line.GRAY)
            {
                boxes[1][0] = player;
            }
            if(line13.getStatus() !=Line.GRAY && line19.getStatus() !=Line.GRAY && line24.getStatus() !=Line.GRAY)
            {
                boxes[1][1] = player;
            }
        }
        else if(line.equals("line19"))
        {
            if(line13.getStatus() !=Line.GRAY && line18.getStatus() !=Line.GRAY && line24.getStatus() !=Line.GRAY)
            {
                boxes[1][1] = player;
            }
            if(line14.getStatus() !=Line.GRAY && line20.getStatus() !=Line.GRAY && line25.getStatus() !=Line.GRAY)
            {
                boxes[1][2] = player;
            }
        }
        else if(line.equals("line20"))
        {
            if(line14.getStatus() !=Line.GRAY && line19.getStatus() !=Line.GRAY && line25.getStatus() !=Line.GRAY)
            {
                boxes[1][2] = player;
            }
            if(line15.getStatus() !=Line.GRAY && line21.getStatus() !=Line.GRAY && line26.getStatus() !=Line.GRAY)
            {
                boxes[1][3] = player;
            }
        }
        else if(line.equals("line21"))
        {
            if(line15.getStatus() !=Line.GRAY && line20.getStatus() !=Line.GRAY && line26.getStatus() !=Line.GRAY)
            {
                boxes[1][3] = player;
            }
            if(line16.getStatus() !=Line.GRAY && line22.getStatus() !=Line.GRAY && line27.getStatus() !=Line.GRAY)
            {
                boxes[1][4] = player;
            }
        }
        else if(line.equals("line22"))
        {
            if(line16.getStatus() !=Line.GRAY && line21.getStatus() !=Line.GRAY && line27.getStatus() !=Line.GRAY)
            {
                boxes[1][4] = player;
            }
        }
        else if(line.equals("line23"))
        {
            if(line12.getStatus() !=Line.GRAY && line17.getStatus() !=Line.GRAY && line18.getStatus() !=Line.GRAY)
            {
                boxes[1][0] = player;
            }
            if(line28.getStatus() !=Line.GRAY && line29.getStatus() !=Line.GRAY && line34.getStatus() !=Line.GRAY)
            {
                boxes[2][0] = player;
            }
        }
        else if(line.equals("line24"))
        {
            if(line13.getStatus() !=Line.GRAY && line18.getStatus() !=Line.GRAY && line19.getStatus() !=Line.GRAY)
            {
                boxes[1][1] = player;
            }
            if(line29.getStatus() !=Line.GRAY && line30.getStatus() !=Line.GRAY && line35.getStatus() !=Line.GRAY)
            {
                boxes[2][1] = player;
            }
        }
        else if(line.equals("line25"))
        {
            if(line14.getStatus() !=Line.GRAY && line19.getStatus() !=Line.GRAY && line20.getStatus() !=Line.GRAY)
            {
                boxes[1][2] = player;
            }
            if(line30.getStatus() !=Line.GRAY && line31.getStatus() !=Line.GRAY && line36.getStatus() !=Line.GRAY)
            {
                boxes[2][2] = player;
            }
        }
        else if(line.equals("line26"))
        {
            if(line15.getStatus() !=Line.GRAY && line20.getStatus() !=Line.GRAY && line21.getStatus() !=Line.GRAY)
            {
                boxes[1][3] = player;
            }
            if(line31.getStatus() !=Line.GRAY && line32.getStatus() !=Line.GRAY && line37.getStatus() !=Line.GRAY)
            {
                boxes[2][3] = player;
            }
        }
        else if(line.equals("line27"))
        {
            if(line16.getStatus() !=Line.GRAY && line21.getStatus() !=Line.GRAY && line22.getStatus() !=Line.GRAY)
            {
                boxes[1][4] = player;
            }
            if(line32.getStatus() !=Line.GRAY && line33.getStatus() !=Line.GRAY && line38.getStatus() !=Line.GRAY)
            {
                boxes[2][4] = player;
            }
        }
        else if(line.equals("line28"))
        {
            if(line23.getStatus() !=Line.GRAY && line29.getStatus() !=Line.GRAY && line34.getStatus() !=Line.GRAY)
            {
                boxes[2][0] = player;
            }
        }
        else if(line.equals("line29"))
        {
            if(line23.getStatus() !=Line.GRAY && line28.getStatus() !=Line.GRAY && line34.getStatus() !=Line.GRAY)
            {
                boxes[2][0] = player;
            }
            if(line24.getStatus() !=Line.GRAY && line30.getStatus() !=Line.GRAY && line35.getStatus() !=Line.GRAY)
            {
                boxes[2][1] = player;
            }
        }
        else if(line.equals("line30"))
        {
            if(line24.getStatus() !=Line.GRAY && line29.getStatus() !=Line.GRAY && line35.getStatus() !=Line.GRAY)
            {
                boxes[2][1] = player;
            }
            if(line25.getStatus() !=Line.GRAY && line31.getStatus() !=Line.GRAY && line36.getStatus() !=Line.GRAY)
            {
                boxes[2][2] = player;
            }
        }
        else if(line.equals("line31"))
        {
            if(line25.getStatus() !=Line.GRAY && line30.getStatus() !=Line.GRAY && line36.getStatus() !=Line.GRAY)
            {
                boxes[2][2] = player;
            }
            if(line26.getStatus() !=Line.GRAY && line32.getStatus() !=Line.GRAY && line37.getStatus() !=Line.GRAY)
            {
                boxes[2][3] = player;
            }
        }
        else if(line.equals("line32"))
        {
            if(line26.getStatus() !=Line.GRAY && line31.getStatus() !=Line.GRAY && line37.getStatus() !=Line.GRAY)
            {
                boxes[2][3] = player;
            }
            if(line27.getStatus() !=Line.GRAY && line33.getStatus() !=Line.GRAY && line38.getStatus() !=Line.GRAY)
            {
                boxes[2][4] = player;
            }
        }
        else if(line.equals("line33"))
        {
            if(line27.getStatus() !=Line.GRAY && line32.getStatus() !=Line.GRAY && line38.getStatus() !=Line.GRAY)
            {
                boxes[2][4] = player;
            }
        }
        else if(line.equals("line34"))
        {
            if(line23.getStatus() !=Line.GRAY && line28.getStatus() !=Line.GRAY && line29.getStatus() !=Line.GRAY)
            {
                boxes[2][0] = player;
            }
            if(line39.getStatus() !=Line.GRAY && line40.getStatus() !=Line.GRAY && line45.getStatus() !=Line.GRAY)
            {
                boxes[3][0] = player;
            }
        }
        else if(line.equals("line35"))
        {
            if(line24.getStatus() !=Line.GRAY && line29.getStatus() !=Line.GRAY && line30.getStatus() !=Line.GRAY)
            {
                boxes[2][1] = player;
            }
            if(line40.getStatus() !=Line.GRAY && line41.getStatus() !=Line.GRAY && line46.getStatus() !=Line.GRAY)
            {
                boxes[3][1] = player;
            }
        }
        else if(line.equals("line36"))
        {
            if(line25.getStatus() !=Line.GRAY && line30.getStatus() !=Line.GRAY && line31.getStatus() !=Line.GRAY)
            {
                boxes[2][2] = player;
            }
            if(line41.getStatus() !=Line.GRAY && line42.getStatus() !=Line.GRAY && line47.getStatus() !=Line.GRAY)
            {
                boxes[3][2] = player;
            }
        }
        else if(line.equals("line37"))
        {
            if(line26.getStatus() !=Line.GRAY && line31.getStatus() !=Line.GRAY && line32.getStatus() !=Line.GRAY)
            {
                boxes[2][3] = player;
            }
            if(line42.getStatus() !=Line.GRAY && line43.getStatus() !=Line.GRAY && line48.getStatus() !=Line.GRAY)
            {
                boxes[3][3] = player;
            }
        }
        else if(line.equals("line38"))
        {
            if(line27.getStatus() !=Line.GRAY && line32.getStatus() !=Line.GRAY && line33.getStatus() !=Line.GRAY)
            {
                boxes[2][4] = player;
            }
            if(line43.getStatus() !=Line.GRAY && line44.getStatus() !=Line.GRAY && line49.getStatus() !=Line.GRAY)
            {
                boxes[3][4] = player;
            }
        }
        else if(line.equals("line39"))
        {
            if(line34.getStatus() !=Line.GRAY && line40.getStatus() !=Line.GRAY && line45.getStatus() !=Line.GRAY)
            {
                boxes[3][0] = player;
            }
        }
        else if(line.equals("line40"))
        {
            if(line34.getStatus() !=Line.GRAY && line39.getStatus() !=Line.GRAY && line45.getStatus() !=Line.GRAY)
            {
                boxes[3][0] = player;
            }
            if(line35.getStatus() !=Line.GRAY && line41.getStatus() !=Line.GRAY && line46.getStatus() !=Line.GRAY)
            {
                boxes[3][1] = player;
            }
        }
        else if(line.equals("line41"))
        {
            if(line35.getStatus() !=Line.GRAY && line40.getStatus() !=Line.GRAY && line46.getStatus() !=Line.GRAY)
            {
                boxes[3][1] = player;
            }
            if(line36.getStatus() !=Line.GRAY && line42.getStatus() !=Line.GRAY && line47.getStatus() !=Line.GRAY)
            {
                boxes[3][2] = player;
            }
        }
        else if(line.equals("line42"))
        {
            if(line36.getStatus() !=Line.GRAY && line41.getStatus() !=Line.GRAY && line47.getStatus() !=Line.GRAY)
            {
                boxes[3][2] = player;
            }
            if(line37.getStatus() !=Line.GRAY && line43.getStatus() !=Line.GRAY && line48.getStatus() !=Line.GRAY)
            {
                boxes[3][3] = player;
            }
        }
        else if(line.equals("line43"))
        {
            if(line37.getStatus() !=Line.GRAY && line42.getStatus() !=Line.GRAY && line48.getStatus() !=Line.GRAY)
            {
                boxes[3][3] = player;
            }
            if(line38.getStatus() !=Line.GRAY && line44.getStatus() !=Line.GRAY && line49.getStatus() !=Line.GRAY)
            {
                boxes[3][4] = player;
            }
        }
        else if(line.equals("line44"))
        {
            if(line38.getStatus() !=Line.GRAY && line43.getStatus() !=Line.GRAY && line49.getStatus() !=Line.GRAY)
            {
                boxes[3][4] = player;
            }
        }
        else if(line.equals("line45"))
        {
            if(line34.getStatus() !=Line.GRAY && line39.getStatus() !=Line.GRAY && line40.getStatus() !=Line.GRAY)
            {
                boxes[3][0] = player;
            }
            if(line50.getStatus() !=Line.GRAY && line51.getStatus() !=Line.GRAY && line56.getStatus() !=Line.GRAY)
            {
                boxes[4][0] = player;
            }
        }
        else if(line.equals("line46"))
        {
            if(line35.getStatus() !=Line.GRAY && line40.getStatus() !=Line.GRAY && line41.getStatus() !=Line.GRAY)
            {
                boxes[3][1] = player;
            }
            if(line51.getStatus() !=Line.GRAY && line52.getStatus() !=Line.GRAY && line57.getStatus() !=Line.GRAY)
            {
                boxes[4][1] = player;
            }
        }
        else if(line.equals("line47"))
        {
            if(line36.getStatus() !=Line.GRAY && line41.getStatus() !=Line.GRAY && line42.getStatus() !=Line.GRAY)
            {
                boxes[3][2] = player;
            }
            if(line52.getStatus() !=Line.GRAY && line53.getStatus() !=Line.GRAY && line58.getStatus() !=Line.GRAY)
            {
                boxes[4][2] = player;
            }
        }
        else if(line.equals("line48"))
        {
            if(line37.getStatus() !=Line.GRAY && line42.getStatus() !=Line.GRAY && line43.getStatus() !=Line.GRAY)
            {
                boxes[3][3] = player;
            }
            if(line53.getStatus() !=Line.GRAY && line54.getStatus() !=Line.GRAY && line59.getStatus() !=Line.GRAY)
            {
                boxes[4][3] = player;
            }
        }
        else if(line.equals("line49"))
        {
            if(line38.getStatus() !=Line.GRAY && line43.getStatus() !=Line.GRAY && line44.getStatus() !=Line.GRAY)
            {
                boxes[3][4] = player;
            }
            if(line54.getStatus() !=Line.GRAY && line55.getStatus() !=Line.GRAY && line60.getStatus() !=Line.GRAY)
            {
                boxes[4][4] = player;
            }
        }
        else if(line.equals("line50"))
        {
            if(line45.getStatus() !=Line.GRAY && line51.getStatus() !=Line.GRAY && line56.getStatus() !=Line.GRAY)
            {
                boxes[4][0] = player;
            }
        }
        else if(line.equals("line51"))
        {
            if(line45.getStatus() !=Line.GRAY && line50.getStatus() !=Line.GRAY && line56.getStatus() !=Line.GRAY)
            {
                boxes[4][0] = player;
            }
            if(line46.getStatus() !=Line.GRAY && line52.getStatus() !=Line.GRAY && line57.getStatus() !=Line.GRAY)
            {
                boxes[4][1] = player;
            }
        }
        else if(line.equals("line52"))
        {
            if(line46.getStatus() !=Line.GRAY && line51.getStatus() !=Line.GRAY && line57.getStatus() !=Line.GRAY)
            {
                boxes[4][1] = player;
            }
            if(line47.getStatus() !=Line.GRAY && line53.getStatus() !=Line.GRAY && line58.getStatus() !=Line.GRAY)
            {
                boxes[4][2] = player;
            }
        }
        else if(line.equals("line53"))
        {
            if(line47.getStatus() !=Line.GRAY && line52.getStatus() !=Line.GRAY && line58.getStatus() !=Line.GRAY)
            {
                boxes[4][2] = player;
            }
            if(line48.getStatus() !=Line.GRAY && line54.getStatus() !=Line.GRAY && line59.getStatus() !=Line.GRAY)
            {
                boxes[4][3] = player;
            }
        }
        else if(line.equals("line54"))
        {
            if(line48.getStatus() !=Line.GRAY && line53.getStatus() !=Line.GRAY && line59.getStatus() !=Line.GRAY)
            {
                boxes[4][3] = player;
            }
            if(line49.getStatus() !=Line.GRAY && line55.getStatus() !=Line.GRAY && line60.getStatus() !=Line.GRAY)
            {
                boxes[4][4] = player;
            }
        }
        else if(line.equals("line55"))
        {
            if(line49.getStatus() !=Line.GRAY && line54.getStatus() !=Line.GRAY && line60.getStatus() !=Line.GRAY)
            {
                boxes[4][4] = player;
            }
        }
        else if(line.equals("line56"))
        {
            if(line45.getStatus() !=Line.GRAY && line50.getStatus() !=Line.GRAY && line51.getStatus() !=Line.GRAY)
            {
                boxes[4][0] = player;
            }
        }
        else if(line.equals("line57"))
        {
            if(line46.getStatus() !=Line.GRAY && line51.getStatus() !=Line.GRAY && line52.getStatus() !=Line.GRAY)
            {
                boxes[4][1] = player;
            }
        }
        else if(line.equals("line58"))
        {
            if(line47.getStatus() !=Line.GRAY && line52.getStatus() !=Line.GRAY && line53.getStatus() !=Line.GRAY)
            {
                boxes[4][2] = player;
            }
        }
        else if(line.equals("line59"))
        {
            if(line48.getStatus() !=Line.GRAY && line53.getStatus() !=Line.GRAY && line54.getStatus() !=Line.GRAY)
            {
                boxes[4][3] = player;
            }
        }
        else if(line.equals("line60"))
        {
            if(line49.getStatus() !=Line.GRAY && line54.getStatus() !=Line.GRAY && line55.getStatus() !=Line.GRAY)
            {
                boxes[4][4] = player;
            }
        }
    }

    public Line getLine1() {
        return line1;
    }

    public Line getLine2() {
        return line2;
    }

    public Line getLine3() {
        return line3;
    }

    public Line getLine4() {
        return line4;
    }

    public Line getLine5() {
        return line5;
    }

    public Line getLine6() {
        return line6;
    }

    public Line getLine7() {
        return line7;
    }

    public Line getLine8() {
        return line8;
    }

    public Line getLine9() {
        return line9;
    }

    public Line getLine10() {
        return line10;
    }

    public Line getLine11() {
        return line11;
    }

    public Line getLine12() {
        return line12;
    }

    public Line getLine13() {
        return line13;
    }

    public Line getLine14() {
        return line14;
    }

    public Line getLine15() {
        return line15;
    }

    public Line getLine16() {
        return line16;
    }

    public Line getLine17() {
        return line17;
    }

    public Line getLine18() {
        return line18;
    }

    public Line getLine19() {
        return line19;
    }

    public Line getLine20() {
        return line20;
    }

    public Line getLine21() {
        return line21;
    }

    public Line getLine22() {
        return line22;
    }

    public Line getLine23() {
        return line23;
    }

    public Line getLine24() {
        return line24;
    }

    public Line getLine25() {
        return line25;
    }

    public Line getLine26() {
        return line26;
    }

    public Line getLine27() {
        return line27;
    }

    public Line getLine28() {
        return line28;
    }

    public Line getLine29() {
        return line29;
    }

    public Line getLine30() {
        return line30;
    }

    public Line getLine31() {
        return line31;
    }

    public Line getLine32() {
        return line32;
    }

    public Line getLine33() {
        return line33;
    }

    public Line getLine34() {
        return line34;
    }

    public Line getLine35() {
        return line35;
    }

    public Line getLine36() {
        return line36;
    }

    public Line getLine37() {
        return line37;
    }

    public Line getLine38() {
        return line38;
    }

    public Line getLine39() {
        return line39;
    }

    public Line getLine40() {
        return line40;
    }

    public Line getLine41() {
        return line41;
    }

    public Line getLine42() {
        return line42;
    }

    public Line getLine43() {
        return line43;
    }

    public Line getLine44() {
        return line44;
    }

    public Line getLine45() {
        return line45;
    }

    public Line getLine46() {
        return line46;
    }

    public Line getLine47() {
        return line47;
    }

    public Line getLine48() {
        return line48;
    }

    public Line getLine49() {
        return line49;
    }

    public Line getLine50() {
        return line50;
    }

    public Line getLine51() {
        return line51;
    }

    public Line getLine52() {
        return line52;
    }

    public Line getLine53() {
        return line53;
    }

    public Line getLine54() {
        return line54;
    }

    public Line getLine55() {
        return line55;
    }

    public Line getLine56() {
        return line56;
    }

    public Line getLine57() {
        return line57;
    }

    public Line getLine58() {
        return line58;
    }

    public Line getLine59() {
        return line59;
    }

    public Line getLine60() {
        return line60;
    }

    public void printBoard()
    {
        for(int i = 0; i<getBoxes().length;i++)
        {
            for(int j = 0; j<getBoxes()[0].length; j++)
            {
                if(getBoxes()[i][j] == ' ')
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(getBoxes()[i][j]);
                }
            }
            System.out.println();
        }
    }
}
