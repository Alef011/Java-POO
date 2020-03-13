package curso.aula5;

public class Banco {
 public Integer numConta;
 protected String tipo;
 private String dono;
 private Float saldo;
 private Boolean status;

public Banco (Float s, Boolean st) { // metodo constructor
  this.saldo = s;
  this.status = st;
}
 public Integer getnumConta () { // utilizando metodo Getter, retorna valor

  return this.numConta;
  }
  public void setnumConta(Integer n) { // utilizando metodo Setter

    this.numConta = n;
  }
  public String getTipo () {

    return this.tipo;
  }
  public void setTipo(String t) {

    this.tipo = t;
  }
  public String getDono() {

    return this.dono;
  }
  public void setDono(String d) {

    this.dono = d;
  }
  public Float getSaldo() {

    return this.saldo;
  }
  public void setSaldo(Float s) {

    this.saldo = s;
  }
  public Boolean getStatus() {

    return this.status;
  }
  public void setStatus(Boolean st) {

    this.status = st;
  }

  public void status () {

  }

  public void abrirConta (String t) {
    setTipo(t);
    setStatus(true);

    if(tipo == "cc") {
      saldo = 50f;
    } else if(tipo == "cp") {
      saldo = 150f;
    }
  }

  public void fecharConta () {
    if(saldo > 0) {
      System.out.println("Conta com dinheiro");
    } else if(saldo < 0) {
      System.out.println("Conta em débito");
    } else {
      setStatus(false);
    }
   }
   public void depositar(Float v) {
     if(status == true) {
       setSaldo(getSaldo() + v);
      //  saldo = saldo + v;
     } else {
       System.out.println("Impossível depositar");
     }
   }
   public void sacar(Float v) {

    if(getStatus() == true) {
      if(getSaldo() > v) {
        setSaldo(getSaldo() - v);
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Impossível sacar");
    }
   }
   public void pagarMensal() {
     Float v = 0f;
     if(tipo == "cc") {
       v = 12f;
     } else if(tipo == "cp") {
       v = 20f;
     }
     if(getStatus() == true) {
       if(getSaldo() > v) {
         setSaldo(getSaldo() - v);
       } else {
         System.err.println("Impossível pagar");
       }
     }
   }
}
