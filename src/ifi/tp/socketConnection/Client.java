package ifi.tp.socketConnection;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        //BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            /*PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello world!");*/
    }
}