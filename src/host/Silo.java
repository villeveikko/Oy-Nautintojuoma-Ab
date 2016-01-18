
package host;

public class Silo extends Thread{
  private boolean varattu;
  private String tyyppi;
  private int t�ytt�aste; // kiloa, max. 10000 kg
  private String k�ytt�j�;
  
  public Silo() {
    t�ytt�aste = 0;
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
  
  protected int getT�ytt�aste() {
    return t�ytt�aste;
  }
  protected boolean setT�ytt�aste(int t�ytt�aste) {
    if (this.t�ytt�aste + t�ytt�aste <= 10000) {
      this.t�ytt�aste = t�ytt�aste;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getK�ytt�j�() {
    return k�ytt�j�;
  }
  protected void setK�ytt�j�(String k�ytt�j�) {
    this.k�ytt�j� = k�ytt�j�;
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
