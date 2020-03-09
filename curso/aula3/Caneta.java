package curso.aula3;

public class Caneta {
 public String modelo;
 public String cor;
 private float ponta;
 protected int carga;
 private boolean tampada;
 public void status () { // estado do objeto
    System.out.println("Modelo: " +  this.modelo);
    System.out.println("Uma caneta " +  this.cor);
    System.out.println("Está tampada? " +  this.tampada);
    System.out.println("Ponta: " +  this.ponta);
    System.out.println("Carga: " +  this.carga);
  }
 protected void rabiscar () {
    if (this.tampada == true) {
      System.out.println("Não vai poder rabiscar agora! ");
    } else {
      System.out.println("Pode rabiscar a vontade! ");
    }
  }
 public void tampar () {
    this.tampada = true;
  }
 public void destampar () {
    this.tampada = false;
  }
}
