package curso.aula6;

public class ControleRemoto implements Controlador {
  private int volume;
  private Boolean ligado;
  private Boolean tocando;

  public ControleRemoto () {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
  }

  private int getVolume() {

    return this.volume;
  }
  private Boolean getLigado() {

    return this.ligado;
  }
  private Boolean getTocando() {

    return this.tocando;
  }
  private void setVolume(int v) {

    this.volume = v;
  }
  private void setLigado(Boolean l) {

    this.ligado = l;
  }
  private void setTocando(Boolean t) {

    this.tocando = t;
  }

  @Override
  public void ligar() {
    this.setLigado(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    if(this.getLigado()) {
      System.out.println("--------------");
      System.out.println("Abrindo o menu");
      System.out.println("--------------");
      System.out.println("----MENU----");
      System.out.println("Está ligado? " + this.getLigado());
      System.out.println("Está tocando? " + this.getTocando());
      System.out.println("Volume: " + this.getVolume());
      for(int i = 0; i <= this.getVolume(); i+=10 ) {
        System.out.println("|");
      }
    } else {
      System.out.println("Não foi possível abrir o menu!");
    }
  }

  @Override
  public void fecharMenu() {
    System.out.println("Fechando o menu...");
  }

  @Override
  public void maisVolume() {
    if(this.getLigado()) {
      this.setVolume(this.getVolume() + 1);
    } else {
      System.out.println("Impossível aumentar o volume!");
    }
  }

  @Override
  public void menosVolume() {
    if(this.getLigado()) {
      this.setVolume(this.getVolume() - 1);
    } else {
      System.out.println("Impossível diminuir o volume!");
    }
  }

  @Override
  public void ligarMudo() {
    if(this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }

  @Override
  public void desligarMudo() {
    if(this.getLigado() && this.getVolume() == 0) {
      this.setVolume(50);
    }
  }

  @Override
  public void play() {
    if(this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
    } else {
      System.out.println("Problemas ao reproduzir!");
    }
  }

  @Override
  public void pause() {
    if(this.getLigado() && this.getTocando()) {
      this.setTocando(false);
    } else {
      System.out.println("Problemas ao pausar!");
    }
  }
}
