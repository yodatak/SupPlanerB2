import java.net.*;
import java.io.*;
/**
 * Created by yodatak on 13/05/14.
 */
public class SocketClient {

    public SocketClient() {
        Socket socket;
        DataInputStream userInput;
        PrintStream theOutputStream;

        try {
            InetAddress serveur = InetAddress.getLocalHost();
            socket = new Socket(serveur, 3333);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream out = new PrintStream(socket.getOutputStream());

            out.println("yop");
            System.out.println(in.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
