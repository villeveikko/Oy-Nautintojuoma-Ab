package host;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * Etäolion toteutus
 */
public class ProcessImplementation extends UnicastRemoteObject implements Process {

	/**
	 * Versionumero
	 */
	private static final long serialVersionUID = 1L;

	protected ProcessImplementation() throws RemoteException {
		super();
	}

}
