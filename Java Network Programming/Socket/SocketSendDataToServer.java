package Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketSendDataToServer {
     public static void main(String[] args) {
        String serverAddress = "example.com"; // Replace with the server's hostname or IP address
        int serverPort = 12345; // Replace with the server's port number
        String messageToSend = "Hello, Server!"; // Message to send to the server

        try {
            // Create a socket and connect to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Get output stream to write data to the server
            OutputStream outputStream = socket.getOutputStream();

            // Create a PrintWriter to write text data
            PrintWriter writer = new PrintWriter(outputStream, true);

            // Send the message to the server
            writer.println(messageToSend);

            // Close the socket and streams
            socket.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


