package curso.aula3;

public class Aula2 {
  public static void main(final String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "Personalizada";
    c1.cor = "Roxo";
    // c1.ponta = 0.5f;
    c1.carga = 80;
    // c1.tampada = false;
    c1.destampar();
    c1.status();
    c1.rabiscar();
  }
}
