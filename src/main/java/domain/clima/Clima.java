package domain.clima;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class Clima {

  AccuWeatherAPI apiClima = new AccuWeatherAPI();


  Map<String, Object> getClimaBuenosAires(){
    return apiClima.getWeather("Buenos Aires, Argentina").get(0);
  }

  public Integer getTemperaturaBuenosAires(){
    HashMap<String, Object> climaActual = (HashMap<String, Object>) apiClima.getWeather("Buenos Aires, Argentina").get(0);
    HashMap<String, Object> temperatura = (HashMap<String, Object>) climaActual.get("Temperature");
    int valorTemperatura = (int) temperatura.get("Value");

    return valorTemperatura;
  }


  public double convertidorACelsius(int temperatura){
    return (( temperatura - 32) * 5/9);
  }
}








