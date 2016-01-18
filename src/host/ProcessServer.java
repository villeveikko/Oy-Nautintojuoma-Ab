
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
  this.state = new ProcessState();
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
 }
 
 
 public ProcessState getState(){
  return state;
 }
 
 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) varaamismetodi. 
  */
 public void reserve(Object laite, String laitteenNimi, String asiakas) throws Exception {
       if (laitteenNimi.equals("silo1")) {
         if (!silo1.getVarattu()) {
           state.setSilo1(true);
           silo1.setVarattu(true);
           silo1.setKäyttäjä(asiakas);
         }
         else {
           // itkuparkumetodi(); ? ((tilanteessa jossa laite onkin jo varattu!))
         }
       }
       if (laitteenNimi.equals("silo2")) {
         if (!silo2.getVarattu()) {
           state.setSilo1(true);
           silo2.setVarattu(true);
           silo2.setKäyttäjä(asiakas);
         }
         else {
           // itkuparkumetodi(); ?
         }
       }
       if (laitteenNimi.equals("silo3")) {
         if (!silo3.getVarattu()) {
           state.setSilo1(true);
           silo3.setVarattu(true);
           silo3.setKäyttäjä(asiakas);
         }
         else {
           // itkuparkumetodi(); ?
         }
       }
       if (laitteenNimi.equals("silo4")) {
         if (!silo4.getVarattu()) {
           state.setSilo1(true);
           silo4.setVarattu(true);
           silo4.setKäyttäjä(asiakas);
         }
         else {
           // itkuparkumetodi(); ?
         }
       }
       if (laitteenNimi.equals("siloLoader")) {
         if (!siloLoader.getVarattu()) {
           state.setSiloLoader(true);
           siloLoader.setVarattu(true);
           siloLoader.setKäyttäjä(asiakas);
         }
         else {
           // itkuparkumetodi(); ?
         }
       }
         if (laitteenNimi.equals("procLoader1")) {
           if (!procLoader1.getVarattu()) {
             state.setProcLoader1(true);
             procLoader1.setVarattu(true);
             procLoader1.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("procLoader2")) {
           if (!procLoader2.getVarattu()) {
             state.setProcLoader2(true);
             procLoader2.setVarattu(true);
             procLoader2.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("proc1")) {
           if (!proc1.getVarattu()) {
             state.setProc1(true);
             proc1.setVarattu(true);
             proc1.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("proc2")) {
           if (!proc2.getVarattu()) {
             state.setProc2(true);
             proc2.setVarattu(true);
             proc2.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("pump1")) {
           if (!pump1.getVarattu()) {
             state.setPump1(true);
             pump1.setVarattu(true);
             pump1.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("pump2")) {
           if (!pump2.getVarattu()) {
             state.setPump2(true);
             pump2.setVarattu(true);
             pump2.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("bottlePump1")) {
           if (!bottlePump1.getVarattu()) {
             state.setBottlePump1(true);
             bottlePump1.setVarattu(true);
             bottlePump1.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
         if (laitteenNimi.equals("bottlePump2")) {
           if (!bottlePump2.getVarattu()) {
             state.setBottlePump2(true);
             bottlePump2.setVarattu(true);
             bottlePump2.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
         }
       if (laitteenNimi.equals("tank1")) {
         if (!tank1.getVarattu()) {
             state.setTank1(true);
             tank1.setVarattu(true);
             tank1.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank2")) {
         if (!tank2.getVarattu()) {
             state.setTank2(true);
             tank2.setVarattu(true);
             tank2.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank3")) {
         if (!tank3.getVarattu()) {
             state.setTank3(true);
             tank3.setVarattu(true);
             tank3.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank4")) {
         if (!tank4.getVarattu()) {
             state.setTank4(true);
             tank4.setVarattu(true);
             tank4.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank5")) {
         if (!tank5.getVarattu()) {
             state.setTank5(true);
             tank5.setVarattu(true);
             tank5.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank6")) {
         if (!tank6.getVarattu()) {
             state.setTank6(true);
             tank6.setVarattu(true);
             tank6.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank7")) {
         if (!tank7.getVarattu()) {
             state.setTank7(true);
             tank7.setVarattu(true);
             tank7.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank8")) {
         if (!tank8.getVarattu()) {
             state.setTank8(true);
             tank8.setVarattu(true);
             tank8.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank9")) {
         if (!tank9.getVarattu()) {
             state.setTank9(true);
             tank9.setVarattu(true);
             tank9.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       }
       if (laitteenNimi.equals("tank10")) {
         if (!tank10.getVarattu()) {
             state.setTank10(true);
             tank10.setVarattu(true);
             tank10.setKäyttäjä(asiakas);
           }
           else {
             // itkuparkumetodi(); ?
           }
       } 
 }

 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) vapauttamismetodit. ((KESKEN))
  */

 
 /*
  * Tehtaan komponenttien (Silo, Conveyor, Processor, Pump, Tank) käynnistysmetodit. 
  */
 public void start(Object laite, String laitteenNimi, String asiakas) throws Exception {
   if (laitteenNimi.equals("silo1")) {
     if ((silo1.getKäyttäjä()).equals(asiakas)) {
       silo1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("silo2")) {
     if ((silo2.getKäyttäjä()).equals(asiakas)) {
       silo2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("silo3")) {
     if ((silo3.getKäyttäjä()).equals(asiakas)) {
       silo3.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("silo4")) {
     if ((silo4.getKäyttäjä()).equals(asiakas)) {
       silo4.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("siloLoader")) {
     if ((siloLoader.getKäyttäjä()).equals(asiakas)) {
       siloLoader.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("procLoader1")) {
     if ((procLoader1.getKäyttäjä()).equals(asiakas)) {
       procLoader1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("procLoader2")) {
     if ((procLoader2.getKäyttäjä()).equals(asiakas)) {
       procLoader2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("proc1")) {
     if ((proc1.getKäyttäjä()).equals(asiakas)) {
       proc1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("proc2")) {
     if ((proc2.getKäyttäjä()).equals(asiakas)) {
       proc2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("pump1")) {
     if ((pump1.getKäyttäjä()).equals(asiakas)) {
       pump1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("pump2")) {
     if ((pump2.getKäyttäjä()).equals(asiakas)) {
       pump2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("bottlePump1")) {
     if ((bottlePump1.getKäyttäjä()).equals(asiakas)) {
       bottlePump1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("bottlePump2")) {
     if ((bottlePump2.getKäyttäjä()).equals(asiakas)) {
       bottlePump2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank1")) {
     if ((tank1.getKäyttäjä()).equals(asiakas)) {
       tank1.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank2")) {
     if ((tank2.getKäyttäjä()).equals(asiakas)) {
       tank2.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank3")) {
     if ((tank3.getKäyttäjä()).equals(asiakas)) {
       tank3.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank4")) {
     if ((tank4.getKäyttäjä()).equals(asiakas)) {
       tank4.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank5")) {
     if ((tank5.getKäyttäjä()).equals(asiakas)) {
       tank5.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank6")) {
     if ((tank6.getKäyttäjä()).equals(asiakas)) {
       tank6.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank7")) {
     if ((tank7.getKäyttäjä()).equals(asiakas)) {
       tank7.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank8")) {
     if ((tank8.getKäyttäjä()).equals(asiakas)) {
       tank8.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank9")) {
     if ((tank9.getKäyttäjä()).equals(asiakas)) {
       tank9.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
   if (laitteenNimi.equals("tank10")) {
     if ((tank10.getKäyttäjä()).equals(asiakas)) {
       tank10.run();
     }
     else {
       System.out.println("Väärä käyttäjä!");
     }  
   }
 }

 
}
>>>>>>> 6cbd896800b11118b22617a4d353f8b2f562c7ea
