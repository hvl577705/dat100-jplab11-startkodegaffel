package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		PrintWriter skr = null;
		try {
			skr = new PrintWriter(filnavn);
			skr.println(samling.toString());
		} catch (FileNotFoundException ex){
			System.out.println("Fant ikke fil " + filnavn + ex);
			return false;
		} finally {
			skr.close();
		}
		return true;
	}
}
