
package host;

/*
 * Prosessin ydin
 */
public class ProcessServer {

 private ProcessState state;
 private Conveyor siloLoader;
 private Silo silo1;
 private Silo silo2;
 private Silo silo3;
 private Silo silo4;
 private Conveyor procLoader1;
 private Conveyor procLoader2;
 private Processor proc1;
 private Processor proc2;
 private Processor proc3;
 private Pump pump1;
 private Pump pump2;
 private Tank tank1;
 private Tank tank2;
 private Tank tank3;
 private Tank tank4;
 private Tank tank5;
 private Tank tank6;
 private Tank tank7;
 private Tank tank8;
 private Tank tank9;
 private Tank tank10;
 private Pump bottlePump1;
 private Pump bottlePump2;
 
 public ProcessServer() {
  super();
  this.siloLoader = new Conveyor();
  this.silo1 = new Silo();
  this.silo2 = new Silo();
  this.silo3 = new Silo();
  this.silo4 = new Silo();
  this.procLoader1 = new Conveyor();
  this.procLoader2 = new Conveyor();
  this.proc1 = new Processor();
  this.proc2 = new Processor();
  this.proc3 = new Processor();
  this.pump1 = new Pump();
  this.pump2 = new Pump();
  this.tank1 = new Tank();
  this.tank2 = new Tank();
  this.tank3 = new Tank();
  this.tank4 = new Tank();
  this.tank5 = new Tank();
  this.tank6 = new Tank();
  this.tank7 = new Tank();
  this.tank8 = new Tank();
  this.tank9 = new Tank();
  this.tank10 = new Tank();
  this.bottlePump1 = new Pump();
  this.bottlePump2 = new Pump();
  this.state = new ProcessState(siloLoader, silo1, silo2, silo3, silo4, procLoader1, procLoader2, proc1, proc2,
        proc3, pump1, pump2, tank1, tank2, tank3, tank4, tank5, tank6, tank7, tank8, tank9,
        tank10, bottlePump1, bottlePump2);

  System.out.println("Server started");
 }
 
 
 public ProcessState getState(){
  return state;
 }
 
 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) varaamismetodi. 
  */
 public void reserve(Object laite, String laitteenNimi, String asiakas) {
   if (laitteenNimi.equals("silo1")) {
     if (!silo1.getVarattu()) {
       silo1.setVarattu(true);
       silo1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ? ((tilanteessa jossa laite onkin jo varattu!))
     }
   }
   else if (laitteenNimi.equals("silo2")) {
     if (!silo2.getVarattu()) {
       silo2.setVarattu(true);
       silo2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("silo3")) {
     if (!silo3.getVarattu()) {
       silo3.setVarattu(true);
       silo3.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("silo4")) {
     if (!silo4.getVarattu()) {
       silo4.setVarattu(true);
       silo4.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("siloLoader")) {
     if (!siloLoader.getVarattu()) {
       siloLoader.setVarattu(true);
       siloLoader.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("procLoader1")) {
     if (!procLoader1.getVarattu()) {
       procLoader1.setVarattu(true);
       procLoader1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("procLoader2")) {
     if (!procLoader2.getVarattu()) {
       procLoader2.setVarattu(true);
       procLoader2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("proc1")) {
     if (!proc1.getVarattu()) {
       proc1.setVarattu(true);
       proc1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("proc2")) {
     if (!proc2.getVarattu()) {
       proc2.setVarattu(true);
       proc2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("proc3")) {
     if (!proc3.getVarattu()) {
       proc3.setVarattu(true);
       proc3.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("pump1")) {
     if (!pump1.getVarattu()) {
       pump1.setVarattu(true);
       pump1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("pump2")) {
     if (!pump2.getVarattu()) {
       pump2.setVarattu(true);
       pump2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     if (!bottlePump1.getVarattu()) {
       bottlePump1.setVarattu(true);
       bottlePump1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     if (!bottlePump2.getVarattu()) {
       bottlePump2.setVarattu(true);
       bottlePump2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank1")) {
     if (!tank1.getVarattu()) {
       tank1.setVarattu(true);
       tank1.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank2")) {
     if (!tank2.getVarattu()) {
       tank2.setVarattu(true);
       tank2.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank3")) {
     if (!tank3.getVarattu()) {
       tank3.setVarattu(true);
       tank3.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank4")) {
     if (!tank4.getVarattu()) {
       tank4.setVarattu(true);
       tank4.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank5")) {
     if (!tank5.getVarattu()) {
       tank5.setVarattu(true);
       tank5.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank6")) {
     if (!tank6.getVarattu()) {
       tank6.setVarattu(true);
       tank6.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank7")) {
     if (!tank7.getVarattu()) {
       tank7.setVarattu(true);
       tank7.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank8")) {
     if (!tank8.getVarattu()) {
       tank8.setVarattu(true);
       tank8.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank9")) {
     if (!tank9.getVarattu()) {
       tank9.setVarattu(true);
       tank9.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   }
   else if (laitteenNimi.equals("tank10")) {
     if (!tank10.getVarattu()) {
       tank10.setVarattu(true);
       tank10.setK‰ytt‰j‰(asiakas);
     }
     else {
       // itkuparkumetodi(); ?
     }
   } 
 }
 
 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) vapauttamismetodit. ((KESKEN))
  */
 public void freeUp(String laitteenNimi) {
   if (laitteenNimi.equals("silo1")) {
     silo1.setVarattu(false);
     silo1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("silo2")) {
     silo2.setVarattu(false);
     silo2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("silo3")) {
     silo3.setVarattu(false);
     silo3.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("silo4")) {
     silo4.setVarattu(false);
     silo4.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("siloLoader")) {
     siloLoader.setVarattu(false);
     siloLoader.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("procLoader1")) {
     procLoader1.setVarattu(false);
     procLoader1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("procLoader2")) {
     procLoader2.setVarattu(false);
     procLoader2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("proc1")) {
     proc1.setVarattu(false);
     proc1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("proc2")) {
     proc2.setVarattu(false);
     proc2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("proc3")) {
     proc3.setVarattu(false);
     proc3.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("pump1")) {
     pump1.setVarattu(false);
     pump1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("pump2")) {
     pump2.setVarattu(false);
     pump2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("bottlePump1")) {
     bottlePump1.setVarattu(false);
     bottlePump1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("bottlePump2")) {
     bottlePump2.setVarattu(false);
     bottlePump2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank1")) {
     tank1.setVarattu(false);
     tank1.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank2")) {
     tank2.setVarattu(false);
     tank2.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank3")) {
     tank3.setVarattu(false);
     tank3.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank4")) {
     tank4.setVarattu(false);
     tank4.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank5")) {
     tank5.setVarattu(false);
     tank5.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank6")) {
     tank6.setVarattu(false);
     tank6.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank7")) {
     tank7.setVarattu(false);
     tank7.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank8")) {
     tank8.setVarattu(false);
     tank8.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank9")) {
     tank9.setVarattu(false);
     tank9.setK‰ytt‰j‰(null);
   }
   else if (laitteenNimi.equals("tank10")) {
     tank10.setVarattu(false);
     tank10.setK‰ytt‰j‰(null);
   } 
 }
 
 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) k‰ynnistysmetodit. 
  */
 public void start(String laitteenNimi, String asiakas, int m‰‰r‰) {
   
   switch(laitteenNimi){
     
     case "siloLoader":
       
     if ((siloLoader.getVarattu())) {
       if ((siloLoader.getK‰ytt‰j‰()).equals(asiakas)) {
         if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo1.lis‰‰T‰yttˆaste(m‰‰r‰);
         }
         else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo2.lis‰‰T‰yttˆaste(m‰‰r‰);
         } 
         else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo3.lis‰‰T‰yttˆaste(m‰‰r‰);
         }
         else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
           siloLoader.run(m‰‰r‰);
           silo4.lis‰‰T‰yttˆaste(m‰‰r‰);
         }     
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "procLoader1":
       
     if ((procLoader1.getVarattu())) {
       if ((procLoader1.getK‰ytt‰j‰()).equals(asiakas)) {
         
         procLoader1.run(m‰‰r‰);
         
         if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
       
     case "procLoader2":
       
     if ((procLoader2.getVarattu())) {
       if ((procLoader2.getK‰ytt‰j‰()).equals(asiakas)) {
         
         procLoader2.run(m‰‰r‰);
         
         if ((silo1.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo2.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo3.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
         else if ((silo4.getK‰ytt‰j‰()).equals(asiakas)) {
           silo1.v‰henn‰T‰yttˆaste(m‰‰r‰);
           if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
             proc1.setKiinte‰(m‰‰r‰);
             proc1.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
             proc2.setKiinte‰(m‰‰r‰);
             proc2.setVesi(m‰‰r‰ * 5);
           }
           else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
             proc3.setKiinte‰(m‰‰r‰);
             proc3.setVesi(m‰‰r‰ * 5);
           }
         }
         
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     /*
      * HUOM!
      * Pump-laitteet pumppaavat automaattisesti kaiken keittimest‰ kypsytyss‰iliˆˆn, 
      * joten m‰‰r‰-parametria ei tarvita!
      */
     
     case "pump1":
       
     if ((pump1.getVarattu())) {
       if ((pump1.getK‰ytt‰j‰()).equals(asiakas)) {         
         if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc1.getJuoma();
           pump1.run(temp);
           proc1.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
         else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc2.getJuoma();
           pump1.run(temp);
           proc2.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
         else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc3.getJuoma();
           pump1.run(temp);
           proc3.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "pump2":
       
     if ((pump2.getVarattu())) {
       if ((pump2.getK‰ytt‰j‰()).equals(asiakas)) {         
         if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc1.getJuoma();
           pump2.run(temp);
           proc1.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
         else if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc2.getJuoma();
           pump2.run(temp);
           proc2.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
         else if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
           int temp = proc3.getJuoma();
           pump2.run(temp);
           proc3.setJuoma(0);
           if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
             tank1.lis‰‰(temp);
           }
           else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
             tank2.lis‰‰(temp);
           }
           else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
             tank3.lis‰‰(temp);
           }
           else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
             tank4.lis‰‰(temp);
           }
           else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
             tank5.lis‰‰(temp);
           }
           else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
             tank6.lis‰‰(temp);
           }
           else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
             tank7.lis‰‰(temp);
           }
           else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
             tank8.lis‰‰(temp);
           }
           else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
             tank9.lis‰‰(temp);
           }
           else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
             tank10.lis‰‰(temp);
           }
         }
         
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "bottlePump1":
       
     if ((bottlePump1.getVarattu())) {
       if ((bottlePump1.getK‰ytt‰j‰()).equals(asiakas)) {
         if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank1.v‰henn‰(m‰‰r‰);
         }
         else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank2.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank3.v‰henn‰(m‰‰r‰);
         }
         else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank4.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank5.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank6.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank7.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank8.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank9.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump1.run(m‰‰r‰);
           tank10.v‰henn‰(m‰‰r‰);
         } 
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "bottlePump2":
       
     if ((bottlePump2.getVarattu())) {
       if ((bottlePump2.getK‰ytt‰j‰()).equals(asiakas)) {
         if ((tank1.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank1.v‰henn‰(m‰‰r‰);
         }
         else if ((tank2.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank2.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank3.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank3.v‰henn‰(m‰‰r‰);
         }
         else if ((tank4.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank4.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank5.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank5.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank6.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank6.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank7.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank7.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank8.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank8.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank9.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank9.v‰henn‰(m‰‰r‰);
         } 
         else if ((tank10.getK‰ytt‰j‰()).equals(asiakas)) {
           bottlePump2.run(m‰‰r‰);
           tank10.v‰henn‰(m‰‰r‰);
         } 
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
       else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "processor1":
       
     if ((proc1.getVarattu())) {
       if ((proc1.getK‰ytt‰j‰()).equals(asiakas)) {
         proc1.run();
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "processor2":
       
     if ((proc2.getVarattu())) {
       if ((proc2.getK‰ytt‰j‰()).equals(asiakas)) {
         proc2.run();
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     case "processor3":
       
     if ((proc3.getVarattu())) {
       if ((proc3.getK‰ytt‰j‰()).equals(asiakas)) {
         proc3.run();
       }
       else {
         System.out.println("V‰‰r‰ k‰ytt‰j‰!");
       }
     }
     else {
       System.out.println("Laitetta ei varattu!");
     }
     break;
     
     
     // Tank -tyyppisi‰ laitteita ei tarvitse "k‰ynnist‰‰"?
     case "tank1":
     break;
     
     case "tank2":
     break;
     
     case "tank3":
     break;
     
     case "tank4":
     break;
     
     case "tank5":
     break;
     
     case "tank6":
     break;
     
     case "tank7":
     break;
     
     case "tank8":
     break;
     
     case "tank9":
     break;
     
     case "tank10":
     break;
   }
   
     // Silo -tyyppisi‰ laitteita ei tarvitse "k‰ynnist‰‰"?
    
 }
 
}
