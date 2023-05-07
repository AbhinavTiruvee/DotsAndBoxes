import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.TimeUnit;

public class ClientsListener implements Runnable
{
    private ObjectInputStream is = null;
    private ObjectOutputStream os = null;
    private DotsAndBoxesFrame frame = null;

    public ClientsListener(ObjectInputStream is,
                           ObjectOutputStream os,
                           DotsAndBoxesFrame frame) {
        this.is = is;
        this.os = os;
        this.frame = frame;

    }

    @Override
    public void run() {
        try
        {
            while(true)
            {
                CommandFromServer cfs = (CommandFromServer)is.readObject();
                // processes the received command
                if(cfs.getCommand() == CommandFromServer.R_TURN)
                    frame.setTurn('R');
                else if(cfs.getCommand() == CommandFromServer.B_TURN)
                    frame.setTurn('B');
                else if(cfs.getCommand() == cfs.MOVE)
                {
                    String data = cfs.getData();
                    // pulls data for the move from the data field

                    String line = data.substring(0,data.indexOf("&"));
                    char player = data.charAt(data.indexOf("&")+1);
                    // changes the board and redraw the screen
                    frame.makeMove(line, player);
                }
                // handles the various end game states
                else if(cfs.getCommand() == CommandFromServer.TIE)
                {
                    frame.setText("Tie game. r to restart");
                }
                else if(cfs.getCommand() == CommandFromServer.R_WINS)
                {
                    frame.setText("R wins!, r to restart");
                }
                else if(cfs.getCommand() == CommandFromServer.B_WINS)
                {
                    frame.setText("B wins!, r to restart");
                }
                else if(cfs.getCommand() == CommandFromServer.RESTART)
                {
                    frame.setText("Restart");
                    frame.setTurn('R');
                }
                else if(cfs.getCommand() == CommandFromServer.CLOSED)
                {
                    System.out.print("closed");
                    frame.setText("Closing in 5");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    frame.setText("Closing in 4");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    frame.setText("Closing in 3");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    frame.setText("Closing in 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    frame.setText("Closing in 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    frame.dispose();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}