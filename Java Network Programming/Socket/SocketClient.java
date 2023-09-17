package Socket;

import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String[] args) {
        String serverAddress = "example.com"; // Replace with the server's hostname or IP address
        int serverPort = 12345; // Replace with the server's port number

        try {
            // Create a socket and connect to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Get input stream to read data from the server
            InputStream inputStream = socket.getInputStream();

            // Create a BufferedReader to read text data
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // Read data from the server line by line
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Server says: " + line);
            }

            // Close the socket and streams
            socket.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
