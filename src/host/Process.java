
package host;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Etäolion rajapinta
 */
public interface Process extends Remote{
	
	
 public void reserve(Object laite, String laitteenNimi, String asiakas) throws RemoteException;  
 public void start(Object laite, String laitteenNimi, String asiakas) throws RemoteException;
 public void start(Object laite, String laitteenNimi, String asiakas, int amount) throws RemoteException;
 public ProcessState getState() throws RemoteException;
 public void ping() throws RemoteException;
}
