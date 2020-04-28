package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherType {
    public static void main(String[] args){
        List <DailyWeather> weathers=new ArrayList<>();

        weathers.add(new DailyWeather("sunny"));
        weathers.add(new DailyWeather("cloudy"));
        weathers.add(new DailyWeather("windy"));

        WeatherReport weatherReport=new WeatherReport();

        for(DailyWeather weather:weathers){
            weatherReport.addObserver(weather);
        }
        System.out.println("The weather is nice");

        weatherReport.WeatherUpdate("12:00" );
    }
}
