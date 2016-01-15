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
 
 public void reserve(Silo s) {
   if (!s.getVarattu()) {
     s.setVarattu(true);
     state.setSilo1(true); // ongelma: miten m‰‰ritt‰‰ oikea silo metodiin? tarvitaanko ProcessState -luokkaa edes, jos samat tiedot saa Silosta?
   }
 }
 public void reserve(Conveyor c) {
   if (!c.getVarattu()) {
     c.setVarattu(true);
     state.setSiloLoader(true); // ongelma: katso reserve(Silo s)
   }
 }
 public void reserve(Processor p) {
   if (!p.getVarattu()) {
     p.setVarattu(true);
     state.setProc1(true); // ongelma: katso reserve(Silo s)
   }
 }
 public void reserve(Pump p) {
   if (!p.getVarattu()) {
     p.setVarattu(true);
     state.setPump1(true); // ongelma: katso reserve(Silo s)
   }
 }
 public void reserve(Tank t) {
   if (!t.getVarattu()) {
     t.setVarattu(true);
     state.setTank1(true); // ongelma: katso reserve(Silo s)
   }
 }


}
