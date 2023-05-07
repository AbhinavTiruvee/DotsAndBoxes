import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
public class DotsAndBoxesFrame extends JFrame implements MouseListener, KeyListener
{
    private String text = "";
    // the letter you are playing as
    private char player;
    // stores all the game data
    private static int blueScore;
    private static int redScore;
    private GameData gameData = null;
    // output stream to the server
    ObjectOutputStream os;
    public DotsAndBoxesFrame(GameData gameData, ObjectOutputStream os, char player)
    {
        super("Dots and Boxes");
        this.gameData = gameData;
        this.os = os;
        this.player = player;
        gameData.addLines();

        addMouseListener(this);

        // makes closing the frame close the program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Set initial frame message
        if(player == 'R')
            text = "Waiting for B to Connect";

        setSize(900,900);
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        // draws the background
        g.setColor(new Color(0, 126, 182));
        g.fillRect(0,0,getWidth(),getHeight());

        // draws the display text to the screen
        g.setColor(Color.BLACK);
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        g.drawString(text,20,55);

        //draw scores to screen
        redScore = gameData.score('R');
        blueScore = gameData.score('B');

        g.drawString("Red: "+redScore+" Blue:"+blueScore, 500,55);

        //boxes
        for(int i = 0; i < gameData.getBoxes().length; i++)
        {
            for(int j = 0; j <  gameData.getBoxes()[0].length; j++)
            {
                if(gameData.getBoxes()[i][j] == ' ')
                {
                    g.setColor(new Color(210, 210, 210));
                }
                else if(gameData.getBoxes()[i][j] == 'R')
                {
                    g.setColor(new Color(255, 87, 87));
                }
                else if(gameData.getBoxes()[i][j] == 'B')
                {
                    g.setColor(new Color(84, 99, 255));
                }
                else
                {
                    g.setColor(Color.PINK);
                }
                g.drawRect(j*150+100, i*150+100, 150, 150);
                g.fillRect(j*150+100, i*150+100, 150, 150);
            }
        }

        //draw lines

        ArrayList<Line> lines = gameData.getLines();
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(20));
        for(int i = 0; i<lines.size();i++)
        {
            if(lines.get(i).getStatus() == Line.GRAY)
            {
                g2.setColor(Color.DARK_GRAY);
            }
            else if(lines.get(i).getStatus() == Line.BLUE)
            {
                g2.setColor(Color.BLUE);
            }
            else if(lines.get(i).getStatus() == Line.RED)
            {
                g2.setColor(Color.RED);
            }
            else
            {
                g2.setColor(Color.PINK);
            }
            g2.drawLine(lines.get(i).getX1()*150+100, lines.get(i).getY1()*150+100, lines.get(i).getX2()*150+100, lines.get(i).getY2()*150+100);
        }

        //dots
        g.setColor(Color.BLACK);
        for(int i = 0 ; i<6; i++)
        {
            for(int j = 0; j<6;j++)
            {
                g.drawOval(j*150+90, i*150+90, 20, 20);
                g.fillOval(j*150+90, i*150+90, 20, 20);
            }
        }


    }

    public void setText(String text) {
        this.text = text;
        repaint();
    }


    public void setTurn(char turn) {
        if(turn==player)
            text = "Your turn";
        else
        {
            text = turn+"'s turn.";
        }
        repaint();
    }

    public void makeMove(String line, char player)
    {
        if(player == 'R')
        {
            if(line.equals("line1"))
            {
                gameData.getLine1().setStatus(Line.RED);
            }
            else if(line.equals("line2"))
            {
                gameData.getLine2().setStatus(Line.RED);
            }
            else if(line.equals("line3"))
            {
                gameData.getLine3().setStatus(Line.RED);
            }
            else if(line.equals("line4"))
            {
                gameData.getLine4().setStatus(Line.RED);
            }
            else if(line.equals("line5"))
            {
                gameData.getLine5().setStatus(Line.RED);
            }
            else if(line.equals("line6"))
            {
                gameData.getLine6().setStatus(Line.RED);
            }
            else if(line.equals("line7"))
            {
                gameData.getLine7().setStatus(Line.RED);
            }
            else if(line.equals("line8"))
            {
                gameData.getLine8().setStatus(Line.RED);
            }
            else if(line.equals("line9"))
            {
                gameData.getLine9().setStatus(Line.RED);
            }
            else if(line.equals("line10"))
            {
                gameData.getLine10().setStatus(Line.RED);
            }
            else if(line.equals("line11"))
            {
                gameData.getLine11().setStatus(Line.RED);
            }
            else if(line.equals("line12"))
            {
                gameData.getLine12().setStatus(Line.RED);
            }
            else if(line.equals("line13"))
            {
                gameData.getLine13().setStatus(Line.RED);
            }
            else if(line.equals("line14"))
            {
                gameData.getLine14().setStatus(Line.RED);
            }
            else if(line.equals("line15"))
            {
                gameData.getLine15().setStatus(Line.RED);
            }
            else if(line.equals("line16"))
            {
                gameData.getLine16().setStatus(Line.RED);
            }
            else if(line.equals("line17"))
            {
                gameData.getLine17().setStatus(Line.RED);
            }
            else if(line.equals("line18"))
            {
                gameData.getLine18().setStatus(Line.RED);
            }
            else if(line.equals("line19"))
            {
                gameData.getLine19().setStatus(Line.RED);
            }
            else if(line.equals("line20"))
            {
                gameData.getLine20().setStatus(Line.RED);
            }
            else if(line.equals("line21"))
            {
                gameData.getLine21().setStatus(Line.RED);
            }
            else if(line.equals("line22"))
            {
                gameData.getLine22().setStatus(Line.RED);
            }
            else if(line.equals("line23"))
            {
                gameData.getLine23().setStatus(Line.RED);
            }
            else if(line.equals("line24"))
            {
                gameData.getLine24().setStatus(Line.RED);
            }
            else if(line.equals("line25"))
            {
                gameData.getLine25().setStatus(Line.RED);
            }
            else if(line.equals("line26"))
            {
                gameData.getLine26().setStatus(Line.RED);
            }
            else if(line.equals("line27"))
            {
                gameData.getLine27().setStatus(Line.RED);
            }
            else if(line.equals("line28"))
            {
                gameData.getLine28().setStatus(Line.RED);
            }
            else if(line.equals("line29"))
            {
                gameData.getLine29().setStatus(Line.RED);
            }
            else if(line.equals("line30"))
            {
                gameData.getLine30().setStatus(Line.RED);
            }
            else if(line.equals("line31"))
            {
                gameData.getLine31().setStatus(Line.RED);
            }
            else if(line.equals("line32"))
            {
                gameData.getLine32().setStatus(Line.RED);
            }
            else if(line.equals("line33"))
            {
                gameData.getLine33().setStatus(Line.RED);
            }
            else if(line.equals("line34"))
            {
                gameData.getLine34().setStatus(Line.RED);
            }
            else if(line.equals("line35"))
            {
                gameData.getLine35().setStatus(Line.RED);
            }
            else if(line.equals("line36"))
            {
                gameData.getLine36().setStatus(Line.RED);
            }
            else if(line.equals("line37"))
            {
                gameData.getLine37().setStatus(Line.RED);
            }
            else if(line.equals("line38"))
            {
                gameData.getLine38().setStatus(Line.RED);
            }
            else if(line.equals("line39"))
            {
                gameData.getLine39().setStatus(Line.RED);
            }
            else if(line.equals("line40"))
            {
                gameData.getLine40().setStatus(Line.RED);
            }
            else if(line.equals("line41"))
            {
                gameData.getLine41().setStatus(Line.RED);
            }
            else if(line.equals("line42"))
            {
                gameData.getLine42().setStatus(Line.RED);
            }
            else if(line.equals("line43"))
            {
                gameData.getLine43().setStatus(Line.RED);
            }
            else if(line.equals("line44"))
            {
                gameData.getLine44().setStatus(Line.RED);
            }
            else if(line.equals("line45"))
            {
                gameData.getLine45().setStatus(Line.RED);
            }
            else if(line.equals("line46"))
            {
                gameData.getLine46().setStatus(Line.RED);
            }
            else if(line.equals("line47"))
            {
                gameData.getLine47().setStatus(Line.RED);
            }
            else if(line.equals("line48"))
            {
                gameData.getLine48().setStatus(Line.RED);
            }
            else if(line.equals("line49"))
            {
                gameData.getLine49().setStatus(Line.RED);
            }
            else if(line.equals("line50"))
            {
                gameData.getLine50().setStatus(Line.RED);
            }
            else if(line.equals("line51"))
            {
                gameData.getLine51().setStatus(Line.RED);
            }
            else if(line.equals("line52"))
            {
                gameData.getLine52().setStatus(Line.RED);
            }
            else if(line.equals("line53"))
            {
                gameData.getLine53().setStatus(Line.RED);
            }
            else if(line.equals("line54"))
            {
                gameData.getLine54().setStatus(Line.RED);
            }
            else if(line.equals("line55"))
            {
                gameData.getLine55().setStatus(Line.RED);
            }
            else if(line.equals("line56"))
            {
                gameData.getLine56().setStatus(Line.RED);
            }
            else if(line.equals("line57"))
            {
                gameData.getLine57().setStatus(Line.RED);
            }
            else if(line.equals("line58"))
            {
                gameData.getLine58().setStatus(Line.RED);
            }
            else if(line.equals("line59"))
            {
                gameData.getLine59().setStatus(Line.RED);
            }
            else if(line.equals("line60"))
            {
                gameData.getLine60().setStatus(Line.RED);
            }

        }
        else if(player == 'B')
        {
            if(line.equals("line1"))
            {
                gameData.getLine1().setStatus(Line.BLUE);
            }
            else if(line.equals("line2"))
            {
                gameData.getLine2().setStatus(Line.BLUE);
            }
            else if(line.equals("line3"))
            {
                gameData.getLine3().setStatus(Line.BLUE);
            }
            else if(line.equals("line4"))
            {
                gameData.getLine4().setStatus(Line.BLUE);
            }
            else if(line.equals("line5"))
            {
                gameData.getLine5().setStatus(Line.BLUE);
            }
            else if(line.equals("line6"))
            {
                gameData.getLine6().setStatus(Line.BLUE);
            }
            else if(line.equals("line7"))
            {
                gameData.getLine7().setStatus(Line.BLUE);
            }
            else if(line.equals("line8"))
            {
                gameData.getLine8().setStatus(Line.BLUE);
            }
            else if(line.equals("line9"))
            {
                gameData.getLine9().setStatus(Line.BLUE);
            }
            else if(line.equals("line10"))
            {
                gameData.getLine10().setStatus(Line.BLUE);
            }
            else if(line.equals("line11"))
            {
                gameData.getLine11().setStatus(Line.BLUE);
            }
            else if(line.equals("line12"))
            {
                gameData.getLine12().setStatus(Line.BLUE);
            }
            else if(line.equals("line13"))
            {
                gameData.getLine13().setStatus(Line.BLUE);
            }
            else if(line.equals("line14"))
            {
                gameData.getLine14().setStatus(Line.BLUE);
            }
            else if(line.equals("line15"))
            {
                gameData.getLine15().setStatus(Line.BLUE);
            }
            else if(line.equals("line16"))
            {
                gameData.getLine16().setStatus(Line.BLUE);
            }
            else if(line.equals("line17"))
            {
                gameData.getLine17().setStatus(Line.BLUE);
            }
            else if(line.equals("line18"))
            {
                gameData.getLine18().setStatus(Line.BLUE);
            }
            else if(line.equals("line19"))
            {
                gameData.getLine19().setStatus(Line.BLUE);
            }
            else if(line.equals("line20"))
            {
                gameData.getLine20().setStatus(Line.BLUE);
            }
            else if(line.equals("line21"))
            {
                gameData.getLine21().setStatus(Line.BLUE);
            }
            else if(line.equals("line22"))
            {
                gameData.getLine22().setStatus(Line.BLUE);
            }
            else if(line.equals("line23"))
            {
                gameData.getLine23().setStatus(Line.BLUE);
            }
            else if(line.equals("line24"))
            {
                gameData.getLine24().setStatus(Line.BLUE);
            }
            else if(line.equals("line25"))
            {
                gameData.getLine25().setStatus(Line.BLUE);
            }
            else if(line.equals("line26"))
            {
                gameData.getLine26().setStatus(Line.BLUE);
            }
            else if(line.equals("line27"))
            {
                gameData.getLine27().setStatus(Line.BLUE);
            }
            else if(line.equals("line28"))
            {
                gameData.getLine28().setStatus(Line.BLUE);
            }
            else if(line.equals("line29"))
            {
                gameData.getLine29().setStatus(Line.BLUE);
            }
            else if(line.equals("line30"))
            {
                gameData.getLine30().setStatus(Line.BLUE);
            }
            else if(line.equals("line31"))
            {
                gameData.getLine31().setStatus(Line.BLUE);
            }
            else if(line.equals("line32"))
            {
                gameData.getLine32().setStatus(Line.BLUE);
            }
            else if(line.equals("line33"))
            {
                gameData.getLine33().setStatus(Line.BLUE);
            }
            else if(line.equals("line34"))
            {
                gameData.getLine34().setStatus(Line.BLUE);
            }
            else if(line.equals("line35"))
            {
                gameData.getLine35().setStatus(Line.BLUE);
            }
            else if(line.equals("line36"))
            {
                gameData.getLine36().setStatus(Line.BLUE);
            }
            else if(line.equals("line37"))
            {
                gameData.getLine37().setStatus(Line.BLUE);
            }
            else if(line.equals("line38"))
            {
                gameData.getLine38().setStatus(Line.BLUE);
            }
            else if(line.equals("line39"))
            {
                gameData.getLine39().setStatus(Line.BLUE);
            }
            else if(line.equals("line40"))
            {
                gameData.getLine40().setStatus(Line.BLUE);
            }
            else if(line.equals("line41"))
            {
                gameData.getLine41().setStatus(Line.BLUE);
            }
            else if(line.equals("line42"))
            {
                gameData.getLine42().setStatus(Line.BLUE);
            }
            else if(line.equals("line43"))
            {
                gameData.getLine43().setStatus(Line.BLUE);
            }
            else if(line.equals("line44"))
            {
                gameData.getLine44().setStatus(Line.BLUE);
            }
            else if(line.equals("line45"))
            {
                gameData.getLine45().setStatus(Line.BLUE);
            }
            else if(line.equals("line46"))
            {
                gameData.getLine46().setStatus(Line.BLUE);
            }
            else if(line.equals("line47"))
            {
                gameData.getLine47().setStatus(Line.BLUE);
            }
            else if(line.equals("line48"))
            {
                gameData.getLine48().setStatus(Line.BLUE);
            }
            else if(line.equals("line49"))
            {
                gameData.getLine49().setStatus(Line.BLUE);
            }
            else if(line.equals("line50"))
            {
                gameData.getLine50().setStatus(Line.BLUE);
            }
            else if(line.equals("line51"))
            {
                gameData.getLine51().setStatus(Line.BLUE);
            }
            else if(line.equals("line52"))
            {
                gameData.getLine52().setStatus(Line.BLUE);
            }
            else if(line.equals("line53"))
            {
                gameData.getLine53().setStatus(Line.BLUE);
            }
            else if(line.equals("line54"))
            {
                gameData.getLine54().setStatus(Line.BLUE);
            }
            else if(line.equals("line55"))
            {
                gameData.getLine55().setStatus(Line.BLUE);
            }
            else if(line.equals("line56"))
            {
                gameData.getLine56().setStatus(Line.BLUE);
            }
            else if(line.equals("line57"))
            {
                gameData.getLine57().setStatus(Line.BLUE);
            }
            else if(line.equals("line58"))
            {
                gameData.getLine58().setStatus(Line.BLUE);
            }
            else if(line.equals("line59"))
            {
                gameData.getLine59().setStatus(Line.BLUE);
            }
            else if(line.equals("line60"))
            {
                gameData.getLine60().setStatus(Line.BLUE);
            }
        }
        gameData.setBoxes(line, player);
        printBoard();
        repaint();
    }

    public void printBoard()
    {
        for(int i = 0; i<gameData.getBoxes().length;i++)
        {
            for(int j = 0; j<gameData.getBoxes()[0].length; j++)
            {
                if(gameData.getBoxes()[i][j] == ' ')
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(gameData.getBoxes()[i][j]);
                }
            }
            System.out.println();
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        String whichLine = "Invalid";

        //horizontal lines
        if(y>=90 && y<=110)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line1";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line2";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line3";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line4";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line5";
            }
        }
        else if(y>=240 && y<=260)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line12";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line13";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line14";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line15";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line16";
            }
        }
        else if(y>=390 && y<=410)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line23";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line24";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line25";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line26";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line27";
            }
        }
        else if(y>=540 && y<=560)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line34";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line35";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line36";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line37";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line38";
            }
        }
        else if(y>=690 && y<=710)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line45";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line46";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line47";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line48";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line49";
            }
        }
        else if(y>=840 && y<=860)
        {
            if(x>=120 && x<=230)
            {
                whichLine = "line56";
            }
            else if(x>=270 && x<=380)
            {
                whichLine = "line57";
            }
            else if(x>=420 && x<=530)
            {
                whichLine = "line58";
            }
            else if(x>=570 && x<=680)
            {
                whichLine = "line59";
            }
            else if(x>=720 && x<=830)
            {
                whichLine = "line60";
            }
        }

        //vertical lines
        if(y>=120 && y<=230)
        {
            if(x>=90 && x<=110)
            {
                whichLine = "line6";
            }
            else if(x>=240 && x<=260)
            {
                whichLine = "line7";
            }
            else if(x>=390 && x<=410)
            {
                whichLine = "line8";
            }
            else if(x>=540 && x<=560)
            {
                whichLine = "line9";
            }
            else if(x>=690 && x<=710)
            {
                whichLine = "line10";
            }
            else if(x>=840 && x<=860)
            {
                whichLine = "line11";
            }
        }
        else if(y>=270 && y<=380)
        {
            if(x>=90 && x<=110)
            {
                whichLine = "line17";
            }
            else if(x>=240 && x<=260)
            {
                whichLine = "line18";
            }
            else if(x>=390 && x<=410)
            {
                whichLine = "line19";
            }
            else if(x>=540 && x<=560)
            {
                whichLine = "line20";
            }
            else if(x>=690 && x<=710)
            {
                whichLine = "line21";
            }
            else if(x>=840 && x<=860)
            {
                whichLine = "line22";
            }
        }
        else if(y>=420 && y<=530)
        {
            if(x>=90 && x<=110)
            {
                whichLine = "line28";
            }
            else if(x>=240 && x<=260)
            {
                whichLine = "line29";
            }
            else if(x>=390 && x<=410)
            {
                whichLine = "line30";
            }
            else if(x>=540 && x<=560)
            {
                whichLine = "line31";
            }
            else if(x>=690 && x<=710)
            {
                whichLine = "line32";
            }
            else if(x>=840 && x<=860)
            {
                whichLine = "line33";
            }
        }
        else if(y>=570 && y<=680)
        {
            if(x>=90 && x<=110)
            {
                whichLine = "line39";
            }
            else if(x>=240 && x<=260)
            {
                whichLine = "line40";
            }
            else if(x>=390 && x<=410)
            {
                whichLine = "line41";
            }
            else if(x>=540 && x<=560)
            {
                whichLine = "line42";
            }
            else if(x>=690 && x<=710)
            {
                whichLine = "line43";
            }
            else if(x>=840 && x<=860)
            {
                whichLine = "line44";
            }
        }
        else if(y>=720 && y<=830)
        {
            if(x>=90 && x<=110)
            {
                whichLine = "line50";
            }
            else if(x>=240 && x<=260)
            {
                whichLine = "line51";
            }
            else if(x>=390 && x<=410)
            {
                whichLine = "line52";
            }
            else if(x>=540 && x<=560)
            {
                whichLine = "line53";
            }
            else if(x>=690 && x<=710)
            {
                whichLine = "line54";
            }
            else if(x>=840 && x<=860)
            {
                whichLine = "line55";
            }
        }
        try
        {
            os.writeObject(new CommandFromClient(CommandFromClient.MOVE,whichLine+"&"+player));
        } catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
//        if(e.getKeyChar() == 'r')
//        {
//            System.out.println("r pressed");
//            try {
//                os.writeObject(new CommandFromClient(CommandFromClient.RESTART, null));
//                gameData.reset();
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//            setText("R's turn");
//            repaint();
//        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
