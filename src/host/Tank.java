
package host;

import java.io.Serializable;

public class Tank extends Thread implements Serializable{
  private boolean varattu;
  private String juomanNimi;
  private int tilavuus; // litraa, max. 10000 l
  private String k‰ytt‰j‰;
  
  public Tank() {
    varattu = false;
    tilavuus = 0;
  }
  
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected String getNimi() {
    return juomanNimi;
  }
  protected void setNimi(String juomanNimi) {
    this.juomanNimi = juomanNimi;
  }
  
  protected int getTilavuus() {
    return tilavuus;
  }
  
  protected boolean lis‰‰(int juoma) {
    if (juoma <= 10000) {
      this.tilavuus = juoma;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean v‰henn‰(int juoma) {
    if (this.tilavuus - juoma >= 0) {
      this.tilavuus -= juoma;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getK‰ytt‰j‰() {
    return k‰ytt‰j‰;
  }
  protected void setK‰ytt‰j‰(String k‰ytt‰j‰) {
    this.k‰ytt‰j‰ = k‰ytt‰j‰;
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
