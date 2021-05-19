package domain.atuendo;


import java.util.List;
import java.util.Random;

public class Vestidor {

private Random selectorPrenda = new Random();

  Prenda calzadoApto(double temperatura){
    List<Prenda> opcionesCalzado = RepositorioPrendas.getInstance().calzadosAptosTemperatura(temperatura);
    return seleccionarPrenda(opcionesCalzado);
  }

  Prenda parteSuperiorApta(double temperatura){
    List<Prenda> opcionesParteSuperior = RepositorioPrendas.getInstance().superioresAptosTemperatura(temperatura);
    return seleccionarPrenda(opcionesParteSuperior);
  }

  Prenda parteInferiorApta(double temperatura){
    List<Prenda> opcionesParteInferior = RepositorioPrendas.getInstance().inferioresAptosTemperatura(temperatura);
    return seleccionarPrenda(opcionesParteInferior);
  }

  Atuendo seleccionarAtuendoApto(double temperatura){
    Atuendo atuendo = new Atuendo();
    atuendo.cargarPrenda(parteSuperiorApta(temperatura), parteInferiorApta(temperatura), calzadoApto(temperatura));
    return atuendo; 
  }

  Prenda seleccionarPrenda(List<Prenda> opciones){
    int numeroPrenda = selectorPrenda.nextInt(opciones.size());
    return opciones.get(numeroPrenda);
  }
}
