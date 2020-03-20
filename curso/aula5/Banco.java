package curso.aula5;

import java.text.NumberFormat;

public class Banco {
 public int numConta;
 protected String tipo;
 private String dono;
 private Float saldo;
 private Boolean status;
 private NumberFormat format;

 public void estadoAtual() {
   System.out.println("Conta: " + this.getNumConta());
   System.out.println("Tipo: " + this.getTipo());
   System.out.println("Dono: " + this.getDono());
   System.out.println("Saldo: " + this.getSaldo());
   System.out.println("Status: " + this.getStatus());
 }

public Banco (Float s, Boolean st) { // metodo constructor
  this.saldo = s;
  this.status = st;
  this.format = NumberFormat.getCurrencyInstance();
}
 public int getNumConta () { // utilizando metodo Getter, retorna valor

  return this.numConta;
  }
  public void setNumConta(int n) { // utilizando metodo Setter

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
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println("Conta aberta com sucesso!");
      System.out.println("-------------------------------------------------------------------------------------");
    } else if(tipo == "cp") {
      saldo = 150f;
      System.out.println("-------------------------------------------------------------------------------------");
      System.out.println("Conta aberta com sucesso!");
    }
  }

  public void fecharConta () {
    if(saldo > 0) {
      System.out.println("Conta com dinheiro");
    } else if(saldo < 0) {
      System.out.println("Conta em débito");
    } else {
      System.out.println("Conta fechada com sucesso!");
      setStatus(false);
    }
   }
   public void depositar(Float v) {
     if(status == true) {
       setSaldo(getSaldo() + v);
       System.out.println("Depósito de " + format.format(v) + " realizado com sucesso na conta de: " +
       this.getDono());
       System.out.println("-------------------------------------------------------------------------------------");
      //  saldo = saldo + v;
     } else {
       System.out.println("Impossível depositar");
     }
   }
   public void sacar(Float v) {

    if(getStatus() == true) {
      if(getSaldo() >= v) {
        setSaldo(getSaldo() - v);
        System.out.println("Saque de: " + format.format(v) + " realizado com sucesso na conta de "
        + this.getDono());
      } else {
        System.out.println("Saldo insuficiente para saque");
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
         System.out.println("Mensalidade pagar com sucesso por" +
         this.getDono());
       } else {
         System.err.println("Impossível pagar");
       }
     } else {
       System.out.println("Impossível pagar uma conta fechada!");
     }
   }
}
