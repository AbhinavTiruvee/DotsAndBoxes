//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//
//public class ClientMain
//{
//    public static void main(String[] args)
//    {
//        try {
//            // create an object for the TTT game
//            GameData gameData = new GameData();
//
//            // create a connection to server
//            Socket socket = new Socket("127.0.0.1",8003);
//            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
//            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
//
//            // determine if playing as R or Y
//            CommandFromServer cfs = (CommandFromServer) is.readObject();
//            DotsAndBoxesFrame frame;
//
//            // Create the Frame based on which player the server says this client is
//            if(cfs.getCommand() == CommandFromServer.CONNECTED_AS_X)
//                frame = new DotsAndBoxesFrame(gameData,os,'X');
//            else
//                frame = new DotsAndBoxesFrame(gameData,os, 'O');
//
//            // Starts a thread that listens for commands from the server
//            ClientsListener cl = new ClientsListener(is,os,frame);
//            Thread t = new Thread(cl);
//            t.start();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}
