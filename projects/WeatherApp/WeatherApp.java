import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApp {
    public static void main(String[] args) {
        try {
            // API URL
            String apiUrl = "https://meteostat.p.rapidapi.com/point/monthly?lat=52.5244&lon=13.4105&alt=43&start=2020-01-01&end=2020-12-31";

            // Create URL object
            URL url = new URL(apiUrl);

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Set headers
            connection.setRequestProperty("x-rapidapi-host", "meteostat.p.rapidapi.com");
            connection.setRequestProperty("x-rapidapi-key", "5911d98351mshf781a99db634519p152594jsn86477a72cc74");

            // Check response code
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) { // Success
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Print response (JSON data)
                System.out.println("Weather Data: " + response.toString());

                // Parse and display weather data (optional)
                // You can use a library like Gson or Jackson for JSON parsing.
            } else {
                System.out.println("Error: " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
