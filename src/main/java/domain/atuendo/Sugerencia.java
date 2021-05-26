package domain.atuendo;

public class Sugerencia {

  Prenda prenda;
  boolean agregar; //si es true es agregar si es false es quitar
  boolean sugerenciaAceptada = false;

  public Sugerencia(Prenda prenda, boolean agregar){
    this.prenda = prenda;
    this.agregar = agregar;
  }

  public void serAceptada() {

    this.sugerenciaAceptada = true;
  }

  public void serRechazada(){
    this.sugerenciaAceptada = false;
  }
}
