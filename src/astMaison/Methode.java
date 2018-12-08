package astMaison;

import java.util.ArrayList;

public class Methode extends Element {
	
	private ArrayList<Attribut> refAtt = new ArrayList<Attribut>();
	
	public Methode(String id) { this.id = id; }
	
	public ArrayList<Attribut> getVariables() { return refAtt;}

}
