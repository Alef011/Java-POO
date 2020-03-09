package curso.aula2;

public class Aula2 {
  public static void main(final String[] args) {
    Caneta c1 = new Caneta();
    c1.cor = "Azul";
    c1.ponta = 0.5f; // float
    c1.tampar();
    c1.modelo = "Rollerball";
    c1.carga = 50;
    c1.status(); // Referência a Metodo
    c1.rabiscar();

    Caneta c2 = new Caneta();
    c2.cor = "Preta";
    c2.ponta = 0.5f;
    c2.destampar();
    c2.modelo = "Gel";
    c2.carga = 80;
    c2.status();
    c2.rabiscar();
  }
}
