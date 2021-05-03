package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class VehiculeElectriqueObix {
	
	private String nom_VehiculeElectrique;
	private Map<String, Double> CourantBorneVE;
	private Map<String, Double> TensionBorne;
	private Map<String, Double> ConsoInstantaneeBorneVE;
	private Map<String, Double> ConsoTotaleBorneVE;
	private Map<String, Double> EtatFonctionnementBorneVE;
	private Map<String, Double> FrequenceBorneVE;
	
	
	public VehiculeElectriqueObix(String nom_VehiculeElectrique) {
		super();
		this.nom_VehiculeElectrique = nom_VehiculeElectrique;
		CourantBorneVE = new HashMap<String, Double>();
		TensionBorne = new HashMap<String, Double>();
		ConsoInstantaneeBorneVE = new HashMap<String, Double>();
		ConsoTotaleBorneVE = new HashMap<String, Double>();
		EtatFonctionnementBorneVE = new HashMap<String, Double>();
		FrequenceBorneVE = new HashMap<String, Double>();
	}


	public VehiculeElectriqueObix(String nom_VehiculeElectrique, Map<String, Double> courantBorneVE, Map<String, Double> tensionBorne,
			Map<String, Double> consoInstantaneeBorneVE, Map<String, Double> consoTotaleBorneVE,
			Map<String, Double> etatFonctionnementBorneVE, Map<String, Double> frequenceBorneVE) {
		super();
		this.nom_VehiculeElectrique = nom_VehiculeElectrique;
		CourantBorneVE = courantBorneVE;
		TensionBorne = tensionBorne;
		ConsoInstantaneeBorneVE = consoInstantaneeBorneVE;
		ConsoTotaleBorneVE = consoTotaleBorneVE;
		EtatFonctionnementBorneVE = etatFonctionnementBorneVE;
		FrequenceBorneVE = frequenceBorneVE;
	}


	@Override
	public String toString() {
		return "VehiculeElectrique [nom_VehiculeElectrique=" + nom_VehiculeElectrique + ", CourantBorneVE="
				+ CourantBorneVE + ", TensionBorne=" + TensionBorne + ", ConsoInstantaneeBorneVE="
				+ ConsoInstantaneeBorneVE + ", ConsoTotaleBorneVE=" + ConsoTotaleBorneVE
				+ ", EtatFonctionnementBorneVE=" + EtatFonctionnementBorneVE + ", FrequenceBorneVE=" + FrequenceBorneVE
				+ "]";
	}


	public String getNom_VehiculeElectrique() {
		return nom_VehiculeElectrique;
	}


	public void setNom_VehiculeElectrique(String nom_VehiculeElectrique) {
		this.nom_VehiculeElectrique = nom_VehiculeElectrique;
	}


	public Map<String, Double> getCourantBorneVE() {
		return CourantBorneVE;
	}


	public void setCourantBorneVE(Map<String, Double> courantBorneVE) {
		CourantBorneVE = courantBorneVE;
	}


	public Map<String, Double> getTensionBorne() {
		return TensionBorne;
	}


	public void setTensionBorne(Map<String, Double> tensionBorne) {
		TensionBorne = tensionBorne;
	}


	public Map<String, Double> getConsoInstantaneeBorneVE() {
		return ConsoInstantaneeBorneVE;
	}


	public void setConsoInstantaneeBorneVE(Map<String, Double> consoInstantaneeBorneVE) {
		ConsoInstantaneeBorneVE = consoInstantaneeBorneVE;
	}


	public Map<String, Double> getConsoTotaleBorneVE() {
		return ConsoTotaleBorneVE;
	}


	public void setConsoTotaleBorneVE(Map<String, Double> consoTotaleBorneVE) {
		ConsoTotaleBorneVE = consoTotaleBorneVE;
	}


	public Map<String, Double> getEtatFonctionnementBorneVE() {
		return EtatFonctionnementBorneVE;
	}


	public void setEtatFonctionnementBorneVE(Map<String, Double> etatFonctionnementBorneVE) {
		EtatFonctionnementBorneVE = etatFonctionnementBorneVE;
	}


	public Map<String, Double> getFrequenceBorneVE() {
		return FrequenceBorneVE;
	}


	public void setFrequenceBorneVE(Map<String, Double> frequenceBorneVE) {
		FrequenceBorneVE = frequenceBorneVE;
	}


	

}
