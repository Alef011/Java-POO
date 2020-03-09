package curso.aula2;

public class Caneta {
  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;
  void status () { // estado do objeto
    System.out.println("Modelo: " +  this.modelo);
    System.out.println("Uma caneta " +  this.cor);
    System.out.println("Está tampada? " +  this.tampada);
    System.out.println("Ponta: " +  this.ponta);
    System.out.println("Carga: " +  this.carga);
  }
  void rabiscar () {
    if (this.tampada == true) {
      System.out.println("Não vai poder rabiscar agora! ");
    } else {
      System.out.println("Pode rabiscar a vontade! ");
    }
  }
  void tampar () {
    this.tampada = true;
  }
  void destampar () {
    this.tampada = false;
  }
}
