package host;

public class Silo extends Thread{
  public boolean varattu;
  public String tyyppi;
  public int täyttöaste; // kiloa, max. 10000 kg
  
  public Silo() {
    täyttöaste = 0;
    varattu = false;
  }
  
  public boolean getVarattu() {
    return varattu;
  }
  public void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  public String getTyyppi() {
    return tyyppi;
  }
  public void setTyyppi(String tyyppi) {
    this.tyyppi = tyyppi;
  }
  
  public int getTäyttöaste() {
    return täyttöaste;
  }
  public boolean setTäyttöaste(int täyttöaste) {
    if (this.täyttöaste + täyttöaste <= 10000) {
      this.täyttöaste = täyttöaste;
      return true;
    }
    else {
      return false;
    }
  }
}
