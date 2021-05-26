package domain.atuendo;


import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

  List<Prenda> prendasGuardadas = new ArrayList<>();
  List<String> usuariosAutorizados = new ArrayList<>();
  List<Sugerencia> sugerencias = new ArrayList<>();


  void agregarSugerencia(Sugerencia unaSugerencia){
    sugerencias.add(unaSugerencia);
  }

  public List<Sugerencia> getSugerencias() {
    return sugerencias;
  }

  void aceptarSugerencia(Sugerencia unaSugerencia){
    if(unaSugerencia.agregar){
      prendasGuardadas.add(unaSugerencia.prenda);
      unaSugerencia.serAceptada();
    }
    else{
      prendasGuardadas.remove(unaSugerencia.prenda);
    }
  }



  void deshacerSugerencia(Sugerencia unaSugerencia){
    unaSugerencia.serRechazada();
    if(unaSugerencia.agregar){
      prendasGuardadas.remove(unaSugerencia.prenda);
    }
    else{
      prendasGuardadas.add(unaSugerencia.prenda);
    }
  }
}
