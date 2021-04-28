package domain.atuendo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Atuendo {

  List<Prenda> prendas = new LinkedList<>();

  void cargarPrenda(Prenda ... unasPrendas){
    Collections.addAll(prendas, unasPrendas);
  }
}
