package org.acme.piemme;

/**
 * Ruolo: invoker
 * richiede al comando di eseguire l'operazione
 *  non sa niente della logica dell'operazione e di chi la deve eseguire
 *
 */
public class MenuItem {
	
	public void onClickOpenDocument(Command command){
		command.execute();
	}
	public void onClickPasteIntoDocument(Command command){
		command.execute();
	}

	
}
