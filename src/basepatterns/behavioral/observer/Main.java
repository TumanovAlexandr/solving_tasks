package basepatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Display display = new Display();

        weatherData.registerObserver(display);
        weatherData.setMeasurements(80, 65, 30.4f); // Output: Temperature: 80.0F degrees, Humidity: 65.0%, Pressure: 30.4inHg
        weatherData.setMeasurements(82, 70, 29.2f); // Output: Temperature: 82.0F degrees, Humidity: 70.0%, Pressure: 29.2inHg
        weatherData.removeObserver(display);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
