package host;

public class Processor extends Thread{
  public boolean varattu;
  public int vesi; // litraa, max. 10000 l
  public int kiinteä; // kiloa, max 2000 kg
  public int keittoaika; // sekuntia
  public String käyttäjä;
  
  public Processor() {
    varattu = false;
    vesi = 0;
    kiinteä = 0;
    keittoaika = 20;
  }
  
   public boolean getVarattu() {
    return varattu;
  }
  public void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  public int getVesi() {
    return vesi;
  }
  public boolean setVesi(int vesi) {
    if (this.vesi + vesi <= 10000) {
      this.vesi = vesi;
      return true;
    }
    else {
      return false;
    }
  }
  
  public int getKiinteä() {
    return kiinteä;
  }
  public boolean setKiinteä(int kiinteä) {
    if (this.kiinteä + kiinteä <= 10000) {
      this.kiinteä = kiinteä;
      return true;
    }
    else {
      return false;
    }
  }
  
  public int getKeittoaika() {
    return keittoaika;
  }
  public int getKeittoaikaMs() { // palauttaa keittoajan millisekunteina!
    return keittoaika * 1000; 
  }
  
  public String getKäyttäjä() {
    return käyttäjä;
  }
  public void setKäyttäjä(String käyttäjä) {
    this.käyttäjä = käyttäjä;
  }
}
