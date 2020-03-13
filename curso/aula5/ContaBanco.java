package curso.aula5;

public class ContaBanco {
  public static void main(final String[] args) {
    Banco banco = new Banco(0f, false); // passando parametros do metodo construtor
    banco.status();
  }
}
