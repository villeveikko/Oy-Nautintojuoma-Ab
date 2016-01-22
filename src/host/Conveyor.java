
package host;

import java.io.Serializable;

public class Conveyor extends Thread implements Serializable{
  private boolean varattu;
  private int siirtonopeus; // kg/s
  private String k‰ytt‰j‰;
  
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
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
  }
  
  public void run(int m‰‰r‰) {
    try{
      System.out.println("Conveyor Started");
      Thread.sleep((m‰‰r‰/this.siirtonopeus) * 1000);
      varattu = false;
      System.out.println("Conveyor finished");
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
}
