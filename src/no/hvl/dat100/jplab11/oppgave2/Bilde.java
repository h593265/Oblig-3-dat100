package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	String Url;
	
	
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
    	super  (id,bruker,dato,tekst);
    	Url=url;
    	
}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id,bruker, dato, likes, tekst);
		Url=url;
	}
	public String getUrl() {
		return Url;
		
	}

	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		String TekstavString = null;
		TekstavString = super.toString();
		TekstavString = "BILDE" + "\n" + TekstavString + Url;
return TekstavString;
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
