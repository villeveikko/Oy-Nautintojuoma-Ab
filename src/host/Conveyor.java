
package host;

public class Conveyor extends Thread{
  private boolean varattu;
  private int siirtonopeus; // kg/s
  private String k�ytt�j�;
  
  public Conveyor() {
    varattu = false;
    siirtonopeus = 200;
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
