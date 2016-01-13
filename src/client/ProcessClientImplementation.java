package client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ProcessClientImplementation extends UnicastRemoteObject implements ProcessClient {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ProcessClientImplementation() throws RemoteException {
		super();
	}

	//Testi 
	public void inform(){
		System.out.println("T‰ll‰ tavalla hoidetaan MainWindown ActionEvent t‰lle luokalle,"
				+ " joka l‰hett‰‰ sen eteenp‰in palvelimelle"
				+ "\n t‰t‰ voi testata klikkaamalla login-nappulaa");
	}
	
}
