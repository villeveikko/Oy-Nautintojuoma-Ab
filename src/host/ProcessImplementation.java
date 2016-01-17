package host;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * Etäolion toteutus
 */
public class ProcessImplementation implements Process {

 /**
  * Versionumero
  */
 private static final long serialVersionUID = 1L;
 private ProcessServer server;

 protected ProcessImplementation() throws RemoteException {
  super();
  ProcessServer server = new ProcessServer();
 }
 
 public void reserve(Object laite, String laitteenNimi, String asiakas){ 
   try {
     server.reserve(laite, laitteenNimi, asiakas);
   } catch (Exception e) {
     System.out.println("Oho!");
   }
 }
 
 public void start(Object laite, String laitteenNimi, String asiakas){
  try {
     server.start(laite, laitteenNimi, asiakas);
   } catch (Exception e) {
     System.out.println("Oho!");
   }
 }
 
 public void sendState(ProcessState state){
  
 }
 
 public void ping(){
  System.out.println("RMI toimii!");
 }

}
