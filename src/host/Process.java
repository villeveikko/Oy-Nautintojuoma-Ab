package host;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Etäolion rajapinta
 */
public interface Process extends Remote{

 public void reserve(Object o, String s, String name) throws RemoteException;
 public void start(Object o, String s, String name) throws RemoteException;
 public void sendState(ProcessState state) throws RemoteException;
 public void ping() throws RemoteException;
}
