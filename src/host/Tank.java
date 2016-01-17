package host;

public class Tank extends Thread{
  private boolean varattu;
  private String juomanNimi;
  private int tilavuus; // litraa, max. 10000 l
  private String käyttäjä;
  
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
  protected boolean setTilavuus(int tilavuus) {
    if (this.tilavuus + tilavuus <= 10000) {
      this.tilavuus = tilavuus;
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
