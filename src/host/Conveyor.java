package host;

public class Conveyor extends Thread{
  private boolean varattu;
  private int siirtonopeus; // kg/s
  
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
  
  public void run() {
    try{
      Thread.sleep(5000);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
