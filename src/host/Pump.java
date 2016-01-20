
package host;

import java.io.Serializable;

public class Pump extends Thread implements Serializable{
  private boolean varattu;
  private int siirtonopeus; // l/s
  private String käyttäjä;
  
  public Pump() {
    varattu = false;
    siirtonopeus = 500;
  }
  
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getSiirtonopeus() {
    return siirtonopeus;
  }
  
  protected String getKäyttäjä() {
    return käyttäjä;
  }
  protected void setKäyttäjä(String käyttäjä) {
    this.käyttäjä = käyttäjä;
  }
  
  public void run() {
    try{
      Thread.sleep(5000);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
