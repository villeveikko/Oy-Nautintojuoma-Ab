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

 protected ProcessImplementation() throws RemoteException {
  super();
  ProcessServer server = new ProcessServer();
 }
 
 public void reserve(Object o){
   
 }
 
 public void start(Object o){
  
 }
 
 public void sendState(ProcessState state){
  
 }
 
 public void ping(){
  System.out.println("RMI toimii!");
 }

}
