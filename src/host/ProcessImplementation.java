
package host;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * Et�olion toteutus
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
 
 //Poistin catch-lohkon. n�in poikkeus nousee asiakkaalle asti
 public void reserve(Object laite, String laitteenNimi, String asiakas) throws RemoteException { 

	 System.out.println("Trying to reserve " + laitteenNimi + " for " + asiakas);
     server.reserve(laite, laitteenNimi, asiakas);

 }
 
 //Poistin catch-lohkon. n�in poikkeus nousee asiakkaalle asti
 public void start(Object laite, String laitteenNimi, String asiakas) throws RemoteException {
 
	 System.out.println("Trying to start " + laitteenNimi + " for " + asiakas);
     server.start(laite, laitteenNimi, asiakas);
   
 }
 
 //Poistin catch-lohkon. n�in poikkeus nousee asiakkaalle asti
 public void start(Object laite, String laitteenNimi, String asiakas, int amount) throws RemoteException {

		 System.out.println("Trying to start " + laitteenNimi + " for " + asiakas + ", amount: " + amount);
	     server.start(laite, laitteenNimi, asiakas, amount);
	
 }
 
 public ProcessState getState() throws RemoteException {
	 return server.getState();
 }
 
 public void ping(){
  System.out.println("RMI toimii!");
 }

}
