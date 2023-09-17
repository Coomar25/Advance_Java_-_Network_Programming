package MimeHeaderRetriever;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MimeHeaderRetriever {
    public static void main(String[] args) {
        try {
            // Create a URL object with the desired URL
            URL url = new URL("https://example.com"); // Replace with your desired URL

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method (GET by default)
            connection.setRequestMethod("GET");

            // Get the Content-Type header field
            String contentType = connection.getHeaderField("Content-Type");

            // Check if the Content-Type header is present
            if (contentType != null) {
                System.out.println("Content-Type: " + contentType);
            } else {
                System.out.println("Content-Type header not found.");
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

