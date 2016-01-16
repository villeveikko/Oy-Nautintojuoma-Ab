package client;

import host.ProcessState;
import host.Process;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ProcessClientImplementation extends UnicastRemoteObject implements ProcessClient {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Process process;
	private String name;

	
	protected ProcessClientImplementation() throws RemoteException {
		super();
		try {
			// if (System.getSecurityManager() == null) System.setSecurityManager(new RMISecurityManager());
            Registry registry = LocateRegistry.getRegistry(null); //tässä null = localhost
			process = (Process) registry.lookup("Process");
			ping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
    	System.out.println("Logged in as " + name);
	}
	
	public void reserve(Object o, String s){
		try {
			process.reserve(o, s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	public void start(Object o, String s){
		try {
			process.start(o, s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	public ProcessState getState(){
		
	}
	
	public void ping(){
		try {
			process.ping();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
