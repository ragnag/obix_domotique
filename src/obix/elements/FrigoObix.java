package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrigoObix {
	
	private String nom_frigo;
	private Map<String, Double> PuissanceFrigo;
	private Map<String, Double> ConsoFrigo;
	
	
	
	
	
	
	public FrigoObix(String nom_frigo) {
		super();
		this.nom_frigo = nom_frigo;
		PuissanceFrigo = new HashMap<String, Double>();
		ConsoFrigo = new HashMap<String, Double>();
	}






	public FrigoObix(String nom_frigo, Map<String, Double> puissanceFrigo, Map<String, Double> consoFrigo) {
		super();
		this.nom_frigo = nom_frigo;
		PuissanceFrigo = puissanceFrigo;
		ConsoFrigo = consoFrigo;
	}






	@Override
	public String toString() {
		return "Frigo [nom_frigo=" + nom_frigo + ", PuissanceFrigo=" + PuissanceFrigo + ", ConsoFrigo=" + ConsoFrigo
				+ "]";
	}






	public String getNom_frigo() {
		return nom_frigo;
	}






	public void setNom_frigo(String nom_frigo) {
		this.nom_frigo = nom_frigo;
	}






	public Map<String, Double> getPuissanceFrigo() {
		return PuissanceFrigo;
	}






	public void setPuissanceFrigo(Map<String, Double> puissanceFrigo) {
		PuissanceFrigo = puissanceFrigo;
	}






	public Map<String, Double> getConsoFrigo() {
		return ConsoFrigo;
	}






	public void setConsoFrigo(Map<String, Double> consoFrigo) {
		ConsoFrigo = consoFrigo;
	}



}
