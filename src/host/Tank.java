package host;

public class Tank extends Thread{
  public boolean varattu;
  public String juomanNimi;
  public int tilavuus; // litraa, max. 10000 l
  
  public boolean getVarattu() {
    return varattu;
  }
  public void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  public String getNimi() {
    return nimi;
  }
  public void setNimi(String nimi) {
    this.nimi = nimi;
  }
  
  public int getTilavuus() {
    return tilavuus;
  }
  public boolean setTilavuus(int tilavuus) {
    if (this.tilavuus + tilavuus <= 10000) {
      this.tilavuus = tilavuus;
      return true;
    }
    else {
      return false;
    }
  }
}
