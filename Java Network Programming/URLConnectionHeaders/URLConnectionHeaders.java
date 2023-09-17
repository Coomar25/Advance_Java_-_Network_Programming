import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class URLConnectionHeaders {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://example.com"); // Replace with your desired URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        Map<String, java.util.List<String>> headers = connection.getHeaderFields();
        
        for (Map.Entry<String, java.util.List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().get(0);
            System.out.println(key + ": " + value);
        }

        connection.disconnect();
    }
}
