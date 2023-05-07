import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.SocketException;
import java.util.ArrayList;

public class ServersListener implements Runnable
{
    private ObjectInputStream is;
    private ObjectOutputStream os;

    // Stores the which player this listener is for
    private char player;

    // static data that is shared between both listeners
    private static char turn = 'R';
    private static GameData gameData = new GameData();
    private static ArrayList<ObjectOutputStream> outs = new ArrayList<>();


    public ServersListener(ObjectInputStream is, ObjectOutputStream os, char player) {
        this.is = is;
        this.os = os;
        this.player = player;
        outs.add(os);
    }

    @Override
    public void run() {
        try
        {
            while(true)
            {
                CommandFromClient cfc = null;
                try
                {
                    cfc = (CommandFromClient) is.readObject();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                if(cfc == null)
                {
                    sendCommand(new CommandFromServer(CommandFromServer.CLOSED,null));
                    break;
                }
                // handle the received command
                else if(cfc.getCommand()==CommandFromClient.MOVE &&
                        turn==player && !gameData.isWinner('R')
                        && !gameData.isWinner('B'))
                {
                    // pulls data for the move from the data field
                    String data=cfc.getData();
                    System.out.println(data);
                    String line = data.substring(0,data.indexOf("&"));
                    char player = data.charAt(data.indexOf("&")+1);
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

                    // sends the move out to both players
                    sendCommand(new CommandFromServer(CommandFromServer.MOVE,data));

                    // changes the turn and checks to see if the game is over
                    changeTurn();
                    checkGameOver();
                }
                else if(cfc.getCommand() == CommandFromClient.RESTART)
                {
                    gameData.boxes = new char[5][5];
                    for(int r=0;r<gameData.boxes.length; r++)
                        for(int c=0; c<gameData.boxes[0].length; c++)
                            gameData.boxes[r][c]=' ';
                    for(int i = 0; i<gameData.getLines().size();i++)
                    {
                        gameData.getLines().get(i).setStatus(Line.GRAY);
                    }
                    setTurn('R');
                }
                else if(cfc.getCommand() == CommandFromClient.CLOSED)
                {
                    sendCommand(new CommandFromServer(CommandFromServer.CLOSED, null));
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void changeTurn()
    {
        // changes the turn
        if(turn=='R')
            turn = 'B';
        else
            turn ='R';
        // informs both client of the new player turn
        if (turn == 'R')
            sendCommand(new CommandFromServer(CommandFromServer.R_TURN, null));
        else
            sendCommand(new CommandFromServer(CommandFromServer.B_TURN, null));
    }

    public void setTurn(char turnToSet)
    {
        turn = turnToSet;
    }

    public void checkGameOver()
    {
        int command = -1;
        if(gameData.isWinner('R'))
            command = CommandFromServer.R_WINS;
        else if(gameData.isWinner('B'))
            command = CommandFromServer.B_WINS;

        // if the game ended, informs both clients of the game's end state
        if(command!=-1)
            sendCommand(new CommandFromServer(command, null));
    }
    public void sendCommand(CommandFromServer cfs)
    {
        // Sends command to both players
        for (ObjectOutputStream o : outs) {
            try {
                o.writeObject(cfs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
