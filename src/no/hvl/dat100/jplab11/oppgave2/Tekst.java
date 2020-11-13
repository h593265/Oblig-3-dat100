package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	String Tekstavtekst;
	int likesavtekst;


	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super  (id,bruker,dato);
		Tekstavtekst = tekst;	
}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker, dato, likes);
		Tekstavtekst = tekst;
		likesavtekst = likes;
		
	}
		public String getTekst() {
		
      return Tekstavtekst;
	}

	public void setTekst(String tekst) {
		Tekstavtekst = tekst;
 
	}

	@Override
	public String toString() {
		String TekstString = null;
		TekstString = super.toString();
		TekstString = "TEKST" + "\n" + TekstString + Tekstavtekst;
		
return TekstString;
	}
	
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
