package domain.atuendo;

public class Material {

  TipoMaterial material;
  Trama trama;

  Material(Trama trama){
    this.trama = trama;
  }

  Material(){
    this.trama = Trama.LISA;
  }


}
