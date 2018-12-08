package astMaison;

public class Attribut extends Element {

	private String type = "", nomType = "", visibilite = ""; 
	
	public Attribut() {}
	
	//public void setId(String id) { this.id = id; }
	public void setType(String type) { this.type = type; }
	public void setNomType(String nomType) { this.nomType = nomType; }
	public void setVisibilite(String visi) { visibilite = visi; }
	
	//public String getId() { return id; }
	public String getType() { return type; }
	public String getNomType() { return nomType; }
	public String getVisibilite() { return visibilite; }
	
	
}
