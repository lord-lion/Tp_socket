package ifi.tp.twoWayCommunication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");
//        Lecture du message envoyer par le client
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        Affichage du message reçu du client
        /*String message = in.readLine();
        System.out.println(message);*/
        System.out.println("Message recu : " + in.readLine());
        /*System.out.println(in.readLine());*/

//        Envois d'une réponse au client
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("YES !");
    }
}