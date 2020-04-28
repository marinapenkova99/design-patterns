package observer;
import java.util.Observable;
import java.util.Observer;

public class DailyWeather implements Observer {
    private String weather;

    @Override
    public void update(Observable theObservable, Object message) {
        if(message != null && message instanceof DailyWeatherMessage){
            DailyWeatherMessage weatherMessage=(DailyWeatherMessage) message;
            System.out.println("The weather at "+ weatherMessage.prognoseTime + " will be " + getWeather() );

        }
    }

    public String getWeather() {
        return weather;
    }

    public DailyWeather(String weather){
        super();
        this.weather=weather;
    }
    @Override
    public String toString() {
        return "DailyWeather[weather=" + weather +"]";
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
