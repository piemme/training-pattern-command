package org.acme.piemme;

/**
 * Ruolo: Client
 * 
 * istanzia ConcreteCommand, passandogli il Receiver
 *
 */
public class Main {

	public static void main(String[] args) {
		MenuItem menuItem = new MenuItem();
		menuItem.onClickOpenDocument(new OpenCommand(new Application()));
		menuItem.onClickPasteIntoDocument(new PasteCommand(new Document()));
	}

}
