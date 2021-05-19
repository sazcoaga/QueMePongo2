import domain.clima.Clima;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;

public class TestClima {


  @Test
  public void elValorDeLaTemperaturaDa57(){
    Clima clima = new Clima();
    Assertions.assertEquals(clima.getTemperaturaBuenosAires(), 57);
  }

  @Test
  public void pasarDeFaCelsius(){
    Clima clima = new Clima();
    Assertions.assertEquals(clima.convertidorACelsius(68), 20);
  }




}
