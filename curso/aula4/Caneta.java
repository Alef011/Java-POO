package curso.aula4;

public class Caneta {
 public String modelo;
 private float ponta;
 private String cor;
 private boolean tampada;

public Caneta (String m, String c, Float p) { // metodo constructor
  this.cor = c;
  this.modelo = m;
  this.ponta = p;
  this.tampar();
}
 public String getModelo () { // utilizando metodo Getter, retorna valor

  return this.modelo;
  }
  public void setModelo(String m) { // utilizando metodo Setter

    this.modelo = m;
  }
  public Float getPonta () {

    return this.ponta;
  }
  public void setPonta(Float p) {

    this.ponta = p;
  }
  //  public void setCor(String c) {

  //    this.cor = c;
  //  }
  public void status () {
    System.out.println("SOBRE A CANETA:");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Tampa: " + this.getPonta());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tampada: " + this.tampada);
  }
//  protected void rabiscar () {
//     if (this.tampada == true) {
//       System.out.println("Não vai poder rabiscar agora! ");
//     } else {
//       System.out.println("Pode rabiscar a vontade! ");
//     }
//   }
  public void tampar () {
     this.tampada = true;
   }
  public void destampar () {
     this.tampada = false;
   }
}
