
package host;

public class Silo extends Thread{
  private boolean varattu;
  private String tyyppi;
  private int täyttöaste; // kiloa, max. 10000 kg
  private String käyttäjä;
  
  public Silo() {
    täyttöaste = 0;
    varattu = false;
  }
  
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected String getTyyppi() {
    return tyyppi;
  }
  protected void setTyyppi(String tyyppi) {
    this.tyyppi = tyyppi;
  }
  
  protected int getTäyttöaste() {
    return täyttöaste;
  }
  protected boolean setTäyttöaste(int täyttöaste) {
    if (this.täyttöaste + täyttöaste <= 10000) {
      this.täyttöaste = täyttöaste;
      return true;
    }
    else {
      return false;
    }
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
