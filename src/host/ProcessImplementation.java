
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

 public ProcessImplementation(ProcessServer server) {
	 super();
	 this.server = server;
 }
 
 public void reserve(Object laite, String laitteenNimi, String asiakas) throws RemoteException { 
   try {
	 System.out.println("Trying to reserve " + laitteenNimi + " for " + asiakas);
     server.reserve(laite, laitteenNimi, asiakas);
   } catch (Exception e) {
	 e.printStackTrace();
     System.out.println("Oho!");
   }
 }
 
 public void start(Object laite, String laitteenNimi, String asiakas) throws RemoteException {
  try {
	 System.out.println("Trying to start " + laitteenNimi + " for " + asiakas);
     server.start(laite, laitteenNimi, asiakas);
   } catch (Exception e) {
     e.printStackTrace();
	 System.out.println("Oho!");
   }
 }
 
 public ProcessState getState() throws RemoteException {
	 return server.getState();
 }
 
 public void ping(){
  System.out.println("RMI toimii!");
 }

}
