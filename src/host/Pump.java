package host;

public class Pump extends Thread{
  public boolean varattu;
  public int siirtonopeus; // l/s
  
  public Pump() {
    varattu = false;
    siirtonopeus = 500;
  }
  
  public boolean getVarattu() {
    return varattu;
  }
  public void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  public int getSiirtonopeus() {
    return siirtonopeus;
  }
}
