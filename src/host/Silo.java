
package host;

import java.io.Serializable;

public class Silo extends Thread implements Serializable{
  /*
   * Luokan Silo parametrit:
   * varattu: Ilmaisee, onko kyseess� oleva laite varattu. (true = varattu, false = vapaa)
   * t�ytt�aste: Ilmaisee, kuinka paljon raaka-ainetta laitteessa on kilogrammoissa. (max. 10000 kg)
   * k�ytt�j�: Ilmaisee laitteen senhetkisen k�ytt�j�n.
   */
  private boolean varattu;
  private int t�ytt�aste; 
  private String k�ytt�j�;
  
  /*
   * Luokan Silo konstruktori:
   * M��ritt�� laitteen aloitusarvot (oletuksena tyhj�).
   */
  public Silo() {
    t�ytt�aste = 0;
    varattu = false;
    k�ytt�j� = "";
  }
  
  /*
   * Luokan Pump getterit ja setterit:
   * HUOM! t�ytt�asteen set-metodi ollaan korvattu lis��- ja v�henn�-metodilla.
   */
  protected boolean getVarattu() {
    return varattu;
  }
  protected void setVarattu(boolean varattu) {
    this.varattu = varattu;
  }
  
  protected int getT�ytt�aste() {
    return t�ytt�aste;
  }
  protected boolean lis��T�ytt�aste(int t�ytt�aste) {
    if (this.t�ytt�aste + t�ytt�aste <= 10000) {
      this.t�ytt�aste += t�ytt�aste;
      return true;
    }
    else {
      return false;
    }
  }
  protected boolean v�henn�T�ytt�aste(int t�ytt�aste) {
    if (this.t�ytt�aste - t�ytt�aste >= 0) {
      this.t�ytt�aste -= t�ytt�aste;
      return true;
    }
    else {
      return false;
    }
  }
  
  protected String getK�ytt�j�() {
    return k�ytt�j�;
  }
  protected void setK�ytt�j�(String k�ytt�j�) {
    this.k�ytt�j� = k�ytt�j�;
    System.out.println("Silo reserved for " + k�ytt�j�);
  }
  
 /* 
  * Silo-tyyppiset laitteet eiv�t tarvitse run-metodia.
  public void run() {
    try{
      Thread.sleep(5000);
    }
    catch(InterruptedException e) {
      e.printStackTrace();
    }
  }
  */
}
