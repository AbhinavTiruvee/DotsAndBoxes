import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{
    public static void main(String[] args)
    {
        try
        {
            // creates a socket that allows connections on port 8001
            ServerSocket serverSocket = new ServerSocket(8003);

            // allow X to connect and build streams to / from X
            Socket rCon = serverSocket.accept();
            ObjectOutputStream ros = new ObjectOutputStream(rCon.getOutputStream());
            ObjectInputStream ris = new ObjectInputStream(rCon.getInputStream());

            // Lets the client know they are the X player
            ros.writeObject(new CommandFromServer(CommandFromServer.CONNECTED_AS_R,null));
            System.out.println("R has Connected.");

            // Creates a Thread to listen to the X client
            ServersListener sl = new ServersListener(ris,ros,'R');
            Thread t = new Thread(sl);
            t.start();

            // allow O to connect and build streams to / from O
            Socket yCon = serverSocket.accept();
            ObjectOutputStream yos = new ObjectOutputStream(yCon.getOutputStream());
            ObjectInputStream yis = new ObjectInputStream(yCon.getInputStream());

            // Lets the client know they are the X player
            yos.writeObject(new CommandFromServer(CommandFromServer.CONNECTED_AS_B,null));
            System.out.println("B has Connected.");

            // Creates a Thread to listen to the X client
            sl = new ServersListener(yis,yos,'B');
            t = new Thread(sl);
            t.start();


            ros.writeObject(new CommandFromServer(CommandFromServer.R_TURN,null));
            yos.writeObject(new CommandFromServer(CommandFromServer.R_TURN,null));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
