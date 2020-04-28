package observer;
import java.util.Observable;

public class WeatherReport extends Observable {
    public void WeatherUpdate(String prognoseTime){
        DailyWeatherMessage msg=new DailyWeatherMessage();
        msg.prognoseTime=prognoseTime;
        setChanged();
        notifyObservers(msg);
    }
}
