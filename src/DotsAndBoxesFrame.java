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
public class DotsAndBoxesFrame extends JFrame implements MouseListener
{
    private String text = "";
    // the letter you are playing as
    private char player;
    // stores all the game data
    private GameData gameData = null;
    // output stream to the server
    ObjectOutputStream os;
    public DotsAndBoxesFrame(GameData gameData, ObjectOutputStream os, char player)
    {
        super("Connect 4");
        this.gameData = gameData;
        this.os = os;
        this.player = player;

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
                    g.setColor(Color.RED);
                }
                else if(gameData.getBoxes()[i][j] == 'B')
                {
                    g.setColor(Color.BLUE);
                }
                else
                {
                    g.setColor(Color.PINK);
                }
                g.drawRect(j*100+50, i*100+50, 100, 100);
                g.fillRect(j*100+50, i*100+50, 100, 100);
            }
        }

        //draw lines

        ArrayList<Line> lines = gameData.getLines();
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
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
            g2.drawLine(lines.get(i).getX1()*100+50, lines.get(i).getY1()*100+50, lines.get(i).getX2()*100+50, lines.get(i).getY2()*100+50);
        }

        //dots
        g.setColor(Color.BLACK);
        for(int i = 0 ; i<6; i++)
        {
            for(int j = 0; j<6;j++)
            {
                g.drawOval(j*100+40, i*100+40, 20, 20);
                g.fillOval(j*100+40, i*100+40, 20, 20);
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

    public void makeMove()
    {

    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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
}
