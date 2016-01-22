package host;

import java.io.Serializable;

public class Processor extends Thread implements Serializable{
  private boolean varattu;
  private int vesi; // litraa, max. 10000 l
  private int kiinteä; // kiloa, max 2000 kg
  private int juoma; // litraa, max. 10000 l, KORVAA VEDEN VALMISTUSPROSESSIN YHTEYDESSÄ
  private int keittoaika; // sekuntia
  private String käyttäjä;
  
  public Processor() {
    varattu = false;
    vesi = 0;
    kiinteä = 0;
    juoma = 0;
    keittoaika = 20;
  }
  
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getVesi() {
    return vesi;
  }
  protected boolean setVesi(int vesi) {
    if (this.vesi + vesi <= 10000) {
      this.vesi = vesi;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getKiinteä() {
    return kiinteä;
  }
  protected boolean setKiinteä(int kiinteä) {
    if (kiinteä <= 2000) {
      this.kiinteä = kiinteä;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getJuoma() {
    return juoma;
  }
  protected boolean setJuoma(int juoma) {
    if ((this.juoma + juoma <= 10000) && (this.vesi == 0) && (this.kiinteä == 0)) {
      this.juoma = juoma;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected int getKeittoaika() {
    return keittoaika;
  }
  protected int getKeittoaikaMs() { // palauttaa keittoajan millisekunteina!
    return keittoaika * 1000; 
  }
  
  protected String getKäyttäjä() {
    return käyttäjä;
  }
  protected void setKäyttäjä(String käyttäjä) {
    this.käyttäjä = käyttäjä;
  }
  
  public void run() {
    try{
      Thread.sleep(this.getKeittoaikaMs());
      int temp = this.getVesi();
      this.setVesi(0);
      this.setKiinteä(0);
      this.setJuoma(temp);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
