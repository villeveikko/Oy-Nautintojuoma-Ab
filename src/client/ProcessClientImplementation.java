package client;

import host.ProcessState;
import host.Process;
import host.Pump;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * T‰m‰ luokka toimii RMI:n edustajaoliona
 */
public class ProcessClientImplementation extends UnicastRemoteObject implements ProcessClient {

	private static final long serialVersionUID = 1L;
	private Process process;
	private String name;

	/**
	 * Konstruktori, joka luo edustajaolion, SecurityManagerin ja hakee viittauksen et‰olioon RMIregistryst‰.
	 * @throws RemoteException
	 */
	protected ProcessClientImplementation() throws RemoteException {
		super();
		try {
			// if (System.getSecurityManager() == null) System.setSecurityManager(new RMISecurityManager());
            Registry registry = LocateRegistry.getRegistry(null); //t‰ss‰ null = localhost
			process = (Process) registry.lookup("Process");
			ping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Palauttaa edustajaolioon liittyv‰n asiakkaan nimen
	 * @return asiakkaan nimi
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asettaa asiakkaalle nimen kirjautumisen yhteydess‰
	 * @param name asiakkaan nimi
	 */
	public void setName(String name) {
		this.name = name;
    	System.out.println("Logged in as " + name);
	}
	
	/**
	 * L‰hett‰‰ et‰kutsun palvelimelle laitteen varaamiseksi
	 * @param o laitteen tyyppi
	 * @param s laitteen nimi
	 */
	public void reserve(Object o, String s){
		try {
			process.reserve(o, s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	/**
	 * L‰het‰‰ et‰kutsun palvelimelle laitteen k‰ynnist‰miseksi
	 * @param o laitteen tyyppi
	 * @param s laitteen nimi
	 */
	public void start(Object o, String s){
		try {
			process.start(o, s, name);
		} catch (Exception e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
	}
	
	/**
	 * L‰het‰‰ et‰kutsun palvelimelle ruuvikuljettimen k‰ynnist‰miseksi
	 * @param o laitteen tyyppi
	 * @param procLoaderNo laitten nimi
	 * @param amount siirrett‰v‰ m‰‰r‰
	 */
	public void start(Object o, String s, int amount){
		
		try {
		process.start(o, s, name, amount);
		} catch (Exception e){
			System.out.println("Error with RMI-call");
			e.printStackTrace();		
		}
	}
	
	/**
	 * L‰hett‰‰ palvelimelle kyselyn prosessin tilasta
	 * @return prosessin tila
	 * @throws RemoteException
	 */
	public ProcessState getState(){
		try {
			return process.getState();
		} catch (RemoteException e) {
			System.out.println("Error with RMI-call");
			e.printStackTrace();
		}
		return null;
	}
	
	public void ping(){
		try {
			process.ping();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
	
}
