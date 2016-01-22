package host;

import java.io.Serializable;

public class Processor extends Thread implements Serializable{
  private boolean varattu;
  private int vesi; // litraa, max. 10000 l
  private int kiinte�; // kiloa, max 2000 kg
  private int juoma; // litraa, max. 10000 l, KORVAA VEDEN VALMISTUSPROSESSIN YHTEYDESS�
  private int keittoaika; // sekuntia
  private String k�ytt�j�;
  
  public Processor() {
    varattu = false;
    vesi = 0;
    kiinte� = 0;
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
  
  protected int getKiinte�() {
    return kiinte�;
  }
  protected boolean setKiinte�(int kiinte�) {
    if (kiinte� <= 2000) {
      this.kiinte� = kiinte�;
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
    if ((this.juoma + juoma <= 10000) && (this.vesi == 0) && (this.kiinte� == 0)) {
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
  
  protected String getK�ytt�j�() {
    return k�ytt�j�;
  }
  protected void setK�ytt�j�(String k�ytt�j�) {
    this.k�ytt�j� = k�ytt�j�;
  }
  
  public void run() {
    try{
      Thread.sleep(this.getKeittoaikaMs());
      int temp = this.getVesi();
      this.setVesi(0);
      this.setKiinte�(0);
      this.setJuoma(temp);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
