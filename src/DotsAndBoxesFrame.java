import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
                    g.setColor(Color.GRAY);
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
                g.drawRect(j*50+50, i*50+50, 100, 100);
                g.fillRect(j*50+50, i*50+50, 100, 100);
            }
        }

        //dots
        g.setColor(Color.BLACK);
        for(int i = 0 ; i<6; i++)
        {
            for(int j = 0; j<6;j++)
            {
                g.drawOval(j*50+50, i*50+50, 20, 20);
                g.fillOval(j*50+50, i*50+50, 20, 20);
            }
        }

        //draw lines

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
