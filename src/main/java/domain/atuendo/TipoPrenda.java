package domain.atuendo;

public class TipoPrenda {

  Categoria categoria;

  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }


  Categoria getCategoria() {
    return categoria;
  }
}
