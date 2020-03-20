package curso.aula5;

public class ContaBanco {
  public static void main(final String[] args) {
    Banco p1 = new Banco(0f, false); // passando parametros do metodo construtor
    p1.setNumConta(111);
    p1.setDono("Alef");
    p1.setTipo("cc");
    p1.abrirConta("cc");
    p1.sacar(50f);
    p1.fecharConta();
    p1.estadoAtual();

    Banco p2 = new Banco(0f, false);
    p2.setNumConta(222);
    p2.setDono("Raiuan");
    p2.setTipo("cp");
    p2.abrirConta("cp");
    p2.depositar(500f);
    p2.sacar(100f);
    p2.estadoAtual();
  }
}
