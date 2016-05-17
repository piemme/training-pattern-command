package org.acme.piemme;

/**
 * Ruolo: Concrete command
 * implementa l'operazione specifica
 * usa il receiver
 * chiama l'operazione opportuna su receiver
 *
 */
public class OpenCommand implements Command {
	Application application; // e' il Receiver

	public OpenCommand(Application application) {
		this.application = application;
	}

	@Override
	public void execute() {
		Document document = new Document();
		application.add(document);
		document.open();
	}

}
