package alessandro.milli;

import java.net.Socket;

public class Client {
    private Socket socket;
    public Client(int port) {
        try {
            socket = new Socket("127.0.0.1", port);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(socket.getRemoteSocketAddress());
    }

    public boolean close() {
        try {
            socket.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
