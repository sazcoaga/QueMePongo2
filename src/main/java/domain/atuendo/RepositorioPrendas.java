package domain.atuendo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioPrendas {

  static RepositorioPrendas repositorioPrendas = new RepositorioPrendas();
  List<Prenda> prendasGuardadas = new ArrayList<>();

  static RepositorioPrendas getInstance(){
    return repositorioPrendas;
  }


  List<Prenda> getPartesSuperiores(){
  return prendasGuardadas.stream().filter(prenda -> prenda.categoria().equals(Categoria.PARTESUPERIOR)).collect(Collectors.toList());
  }

  List<Prenda> getPartesInferiores(){
    return prendasGuardadas.stream().filter(prenda -> prenda.categoria().equals(Categoria.PARTEINFERIOR)).collect(Collectors.toList());
  }

  List<Prenda> getCalzados(){
    return prendasGuardadas.stream().filter(prenda -> prenda.categoria().equals(Categoria.CALZADO)).collect(Collectors.toList());
  }

  List<Prenda> getAccesorios(){
    return prendasGuardadas.stream().filter(prenda -> prenda.categoria().equals(Categoria.ACCESORIO)).collect(Collectors.toList());
  }

  List<Prenda> inferioresAptosTemperatura(double temperatura){
    return prendasAptasTemperatura(this.getPartesInferiores(), temperatura);
  }

  List<Prenda> superioresAptosTemperatura(double temperatura){
    return prendasAptasTemperatura(this.getPartesSuperiores(), temperatura);
  }

  List<Prenda> calzadosAptosTemperatura(double temperatura){
    return prendasAptasTemperatura(this.getCalzados(), temperatura);
  }

  List<Prenda> prendasAptasTemperatura(List<Prenda> prendas, double temperatura){
    return prendas.stream().filter(prenda -> prenda.esAptaTemperatura(temperatura)).collect(Collectors.toList());
  }




}
