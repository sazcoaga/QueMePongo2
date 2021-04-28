package domain.atuendo;

public class Material {

  Trama trama;

  Material(Trama trama){
    this.trama = trama;
  }

  Material(){
    this.trama = Trama.LISA;
  }


}
