package domain.atuendo;

public class BorradorPrenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;


  public void setTipo(TipoPrenda tipo){
    this.tipo = tipo;
  }

  public void setMaterial(Material material) {
    if (tipo != null) {
      this.material = material;
    }
    else {
      throw new RuntimeException("Falta ingresar el tipo de la prenda");
    }
  }

  public void setColorPrincipal(Color colorPrincipal) {
    if (tipo != null) {
      this.colorPrincipal = colorPrincipal;
    } else {
      throw new RuntimeException("Falta ingresar el tipo de la prenda");
    }
  }

  public void setColorSecundario(Color colorSecundario){
      if (tipo != null) {
        this.colorSecundario = colorSecundario;
      } else {
        throw new RuntimeException("Falta ingresar el tipo de la prenda");
      }
    }

  Prenda cargarPrenda(){
    if(colorSecundario == null){
      return new Prenda(tipo, material, colorPrincipal);
    }
    else{
      return new Prenda(tipo, material, colorPrincipal, colorSecundario);
    }
  }
}
