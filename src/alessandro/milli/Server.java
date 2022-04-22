package alessandro.milli;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean start() {
        try {
            Socket socket = serverSocket.accept();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean close() {
        try {
            serverSocket.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }


    }
}