package org.acme.piemme;
/**
 * Ruolo: Concrete command
 * implementa l'operazione specifica
 * usa il receiver
 * chiama l'operazione opportuna su receiver
 *
 */
public class PasteCommand implements Command {
	Document document; // e' il Receiver

	public PasteCommand(Document document) {
		super();
		this.document = document;
	}

	@Override
	public void execute() {
		document.paste();
	}

}
