package it.polito.tdp.model;
import java.util.*;

public class Dizionario {
	Map<String,LinkedList> mappaTraduzione=new HashMap<String,LinkedList>();
	
	public LinkedList<String> traduciParola(String daTradurre) {
		
		return mappaTraduzione.get(daTradurre);
		
	}
	public boolean inserisciParola(String parolaAliena,String parolaItaliana) {
		LinkedList<String> giaInserite = this.mappaTraduzione.get(parolaAliena);
		if (giaInserite!=null) {
			for (String s:giaInserite) {
				if (s.equals(parolaItaliana)) {
					return false;
				}
			}
			giaInserite.add(parolaItaliana);
			return true;
		}
		LinkedList<String> nuovaParola=new LinkedList<String>();
		nuovaParola.add(parolaItaliana);
		this.mappaTraduzione.put(parolaAliena, nuovaParola);
		return true;
			
		
		
	

	}
}
