package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int i = 0;
		while(i<nesteledig) {
			if(innleggtabell[i].erLik(innlegg)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		int i = 0;
		while(i<nesteledig) {
			if(innleggtabell[i].erLik(innlegg)) {
				return true;
			}
			i++;
		}
		return false;
	}

	public boolean ledigPlass() {
		if(nesteledig>=innleggtabell.length) {
			return false;
		}
		return true;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String tabStr = "" + nesteledig + "\n";
		for(int i = 0; i<nesteledig; i++) {
			tabStr += innleggtabell[i].toString();
		}
		return tabStr;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}