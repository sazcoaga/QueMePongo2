package domain.atuendo;

import static java.util.Objects.requireNonNull;

public class Prenda {

  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;

  Prenda(TipoPrenda tipo, Material material, Color colorPrincipal){
    this.tipo = requireNonNull(tipo, "tipo de prenda obligatorio");
    this.material = requireNonNull(material, "material obligatorio");
    this.colorPrincipal = requireNonNull(colorPrincipal, "color  obligatorio");

  }

  Prenda(TipoPrenda tipo, Material material, Color colorPrincipal, Color colorSecundario){
    this(tipo, material, colorPrincipal);
    this.colorSecundario = requireNonNull(colorSecundario, "color secundario obligatorio");
  }





  Categoria categoria(){
    return tipo.getCategoria();
  }






}




