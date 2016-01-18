
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
      System.out.println("Conveyor Started");
      Thread.sleep(5000);
      System.out.println("Conveyor finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
