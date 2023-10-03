package ifi.tp.twoWayCommunication;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

//       Envoie de message vers le serveur

        //BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("It's working ?");

//        Lecteure de la réponse envoyer par le serveur

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        Affichage du message reçu du client
        /*String message = in.readLine();
        System.out.println(message);*/
        System.out.println("Message recu : " + in.readLine());
    }
}