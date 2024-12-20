package edu.penzgtu;

import java.io.*;
import java.net.*;

public class App {
 public static void main(String[] args) {
        int port = 12345; // Port number
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for a client to connect
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");

            // Send a message to the client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from server!");

            // Close the socket
            socket.close();
        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
