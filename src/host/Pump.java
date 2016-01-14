package host;

public class Pump extends Thread{
  private boolean varattu;
  private int siirtonopeus; // l/s
  
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
  
  public void run() {
    try{
      Thread.sleep(5000);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
