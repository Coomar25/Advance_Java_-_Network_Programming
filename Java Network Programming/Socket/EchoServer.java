package Socket;

import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        int serverPort = 4000; // Port on which the server will listen
        try {
            // Create a ServerSocket and bind it to the specified port
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server listening on port " + serverPort);

            while (true) {
                // Accept incoming client connections
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create a new thread to handle the client's communication
                Thread clientThread = new Thread(() -> {
                    try {
                        // Set up input and output streams for communication with the client
                        InputStream inputStream = clientSocket.getInputStream();
                        OutputStream outputStream = clientSocket.getOutputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                        PrintWriter writer = new PrintWriter(outputStream, true);

                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println("Received from client: " + line);

                            // Echo the received data back to the client
                            writer.println("Server: " + line);
                        }

                        // Close the client socket when the client disconnects
                        clientSocket.close();
                        System.out.println("Client disconnected: " + clientSocket.getInetAddress());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                serverSocket.close();
                // Start the client communication thread
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

