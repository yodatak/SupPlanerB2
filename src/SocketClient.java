import java.net.*;
import java.io.*;
/**
 * Created by yodatak on 13/05/14.
 */
public class SocketClient {
    Socket socket;
    public String request(String req) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream());

        out.println(req);
        return in.readLine();
    }

    public SocketClient() throws IOException {
        socket = new Socket(InetAddress.getLocalHost(), 3333);
    }
}
