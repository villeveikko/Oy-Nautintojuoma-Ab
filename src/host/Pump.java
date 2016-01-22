
package host;

import java.io.Serializable;

public class Pump extends Thread implements Serializable{
  private boolean varattu;
  private int siirtonopeus; // l/s
  private String k‰ytt‰j‰;
  
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
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
  }
  
  public void run(int m‰‰r‰) {
    try{
      System.out.println("Pump Started");
      Thread.sleep((m‰‰r‰/this.siirtonopeus) * 1000);
      varattu = false;
      System.out.println("Pump finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
