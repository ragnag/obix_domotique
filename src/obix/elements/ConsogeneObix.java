package obix.elements;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ConsogeneObix {
	
	private String nom_Consogene;
	private Map<String, Double> ConsoGeneral;
	private Map<String, Double> ConsoEchangeur;
	private Map<String, Double> consoECL;
	private Map<String, Double> ConsoPC;
	private Map<String, Double> ConsoPAC;
	private Map<String, Double> WagoPositionVanne3Voies;
//	private Map<String, Double> ConsoAmovible;
//	private Map<String, Double> PuissanceAmovible;
	
	
	
	public ConsogeneObix(String nom_Consogene) {
		super();
		this.nom_Consogene = nom_Consogene;
		ConsoGeneral = new HashMap<String, Double>();
		ConsoEchangeur = new HashMap<String, Double>();
		this.consoECL = new HashMap<String, Double>();
		ConsoPC = new HashMap<String, Double>();
		ConsoPAC = new HashMap<String, Double>();
		WagoPositionVanne3Voies = new HashMap<String, Double>();
//		ConsoAmovible = new HashMap<String, Double>();
		//		PuissanceAmovible = new HashMap<String, Double>();
	}



	public ConsogeneObix(String nom_Consogene, Map<String, Double> consoGeneral, Map<String, Double> consoEchangeur,
			Map<String, Double> consoECL, Map<String, Double> consoPC, Map<String, Double> consoPAC,
			Map<String, Double> wagoPositionVanne3Voies, Map<String, Double> consoAmovible,
			Map<String, Double> puissanceAmovible) {
		super();
		this.nom_Consogene = nom_Consogene;
		ConsoGeneral = consoGeneral;
		ConsoEchangeur = consoEchangeur;
		this.consoECL = consoECL;
		ConsoPC = consoPC;
		ConsoPAC = consoPAC;
		WagoPositionVanne3Voies = wagoPositionVanne3Voies;
//		ConsoAmovible = consoAmovible;
		//		PuissanceAmovible = puissanceAmovible;
	}



	@Override
	public String toString() {
		return "Consogene [nom_Consogene=" + nom_Consogene + ", ConsoGeneral=" + ConsoGeneral + ", ConsoEchangeur="
				+ ConsoEchangeur + ", consoECL=" + consoECL + ", ConsoPC=" + ConsoPC + ", ConsoPAC=" + ConsoPAC
				+ ", WagoPositionVanne3Voies=" + WagoPositionVanne3Voies + ", ConsoAmovible="
				+ ", PuissanceAmovible="  + "]";
	}



	public String getNom_Consogene() {
		return nom_Consogene;
	}



	public void setNom_Consogene(String nom_Consogene) {
		this.nom_Consogene = nom_Consogene;
	}



	public Map<String, Double> getConsoGeneral() {
		return ConsoGeneral;
	}



	public void setConsoGeneral(Map<String, Double> consoGeneral) {
		ConsoGeneral = consoGeneral;
	}



	public Map<String, Double> getConsoEchangeur() {
		return ConsoEchangeur;
	}



	public void setConsoEchangeur(Map<String, Double> consoEchangeur) {
		ConsoEchangeur = consoEchangeur;
	}



	public Map<String, Double> getconsoECL() {
		return consoECL;
	}



	public void setConsoECL(Map<String, Double> consoECL) {
		this.consoECL = consoECL;
	}



	public Map<String, Double> getConsoPC() {
		return ConsoPC;
	}



	public void setConsoPC(Map<String, Double> consoPC) {
		ConsoPC = consoPC;
	}



	public Map<String, Double> getConsoPAC() {
		return ConsoPAC;
	}



	public void setConsoPAC(Map<String, Double> consoPAC) {
		ConsoPAC = consoPAC;
	}



	public Map<String, Double> getWagoPositionVanne3Voies() {
		return WagoPositionVanne3Voies;
	}



	public void setWagoPositionVanne3Voies(Map<String, Double> wagoPositionVanne3Voies) {
		WagoPositionVanne3Voies = wagoPositionVanne3Voies;
	}


//
//	public Map<String, Double> getConsoAmovible() {
//		return ConsoAmovible;
//	}
//
//
//
//	public void setConsoAmovible(Map<String, Double> consoAmovible) {
//		ConsoAmovible = consoAmovible;
//	}



//	public Map<String, Double> getPuissanceAmovible() {
//		return PuissanceAmovible;
//	}
//
//
//
//	public void setPuissanceAmovible(Map<String, Double> puissanceAmovible) {
//		PuissanceAmovible = puissanceAmovible;
//	}
	

	
}
