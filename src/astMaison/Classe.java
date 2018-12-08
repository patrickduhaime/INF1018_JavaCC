package astMaison;

import java.util.ArrayList;

public class Classe extends Element {

	
	private ArrayList<Attribut> refAtt = new ArrayList<Attribut>();
	private ArrayList<Methode> methods = new ArrayList<Methode>();
	private ArrayList<String> heritage = new ArrayList<String>();
	
	public Classe(String id) { this.id = id; }
	
	public ArrayList<Attribut> getAttributes() { return refAtt;}
	public ArrayList<Methode> getMethodes() { return methods;}
	public ArrayList<String> getHeritage() { return heritage;}
	
	
}
