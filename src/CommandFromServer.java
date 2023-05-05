import java.io.Serializable;

public class CommandFromServer implements Serializable
{
    // The command being sent to the client
    private int command;
    // Text data for the command
    private String data ="";

    // Command list
    public static final int CONNECTED_AS_R=0;
    public static final int CONNECTED_AS_B=1;
    public static final int R_TURN=2;
    public static final int B_TURN=3;
    public static final int MOVE=4;
    public static final int R_WINS=5;
    public static final int B_WINS=6;
    public static final int TIE=7;
    public static final int RESTART = 8;
    public static final int CLOSED = 9;

    public CommandFromServer(int command, String data) {
        this.command = command;
        this.data = data;
    }

    public int getCommand() {
        return command;
    }

    public String getData() {
        return data;
    }
}
