package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ExterieursObix {

	private String nom_exterieurs;
	private Map<String, Double> LuminositeExterieureNord;
	private Map<String, Double> LuminositeExterieureNordEst;
	private Map<String, Double> LuminositeExterieureEst;
	private Map<String, Double> LuminositeExterieureSudEst;
	private Map<String, Double> LuminositeExterieureSud;
	private Map<String, Double> LuminositeExterieureSudOuest;
	private Map<String, Double> LuminositeExterieureOuest;
	private Map<String, Double> LuminositeExterieureNordOuest;
	private Map<String, Double> TemperatureExterieure;
	private Map<String, Double> DirectionVent;
	private Map<String, Double> VitesseVent;
	
	
	
	
	
	
	public ExterieursObix(String nom_exterieurs) {
		super();
		this.nom_exterieurs = nom_exterieurs;
		LuminositeExterieureNord = new HashMap<String, Double>();
		LuminositeExterieureNordEst = new HashMap<String, Double>();
		LuminositeExterieureEst = new HashMap<String, Double>();
		LuminositeExterieureSudEst = new HashMap<String, Double>();
		LuminositeExterieureSud = new HashMap<String, Double>();
		LuminositeExterieureSudOuest = new HashMap<String, Double>();
		LuminositeExterieureOuest = new HashMap<String, Double>();
		LuminositeExterieureNordOuest = new HashMap<String, Double>();
		TemperatureExterieure = new HashMap<String, Double>();
		DirectionVent = new HashMap<String, Double>();
		VitesseVent = new HashMap<String, Double>();
	}


	public ExterieursObix(String nom_exterieurs, Map<String, Double> luminositeExterieureNord,
			Map<String, Double> luminositeExterieureNordEst, Map<String, Double> luminositeExterieureEst,
			Map<String, Double> luminositeExterieureSudEst, Map<String, Double> luminositeExterieureSud,
			Map<String, Double> luminositeExterieureSudOuest, Map<String, Double> luminositeExterieureOuest,
			Map<String, Double> luminositeExterieureNordOuest, Map<String, Double> temperatureExterieure,
			Map<String, Double> directionVent, Map<String, Double> vitesseVent) {
		super();
		this.nom_exterieurs = nom_exterieurs;
		LuminositeExterieureNord = luminositeExterieureNord;
		LuminositeExterieureNordEst = luminositeExterieureNordEst;
		LuminositeExterieureEst = luminositeExterieureEst;
		LuminositeExterieureSudEst = luminositeExterieureSudEst;
		LuminositeExterieureSud = luminositeExterieureSud;
		LuminositeExterieureSudOuest = luminositeExterieureSudOuest;
		LuminositeExterieureOuest = luminositeExterieureOuest;
		LuminositeExterieureNordOuest = luminositeExterieureNordOuest;
		TemperatureExterieure = temperatureExterieure;
		DirectionVent = directionVent;
		VitesseVent = vitesseVent;
	}
	
	
	


	@Override
	public String toString() {
		return "Exterieurs [nom_exterieurs=" + nom_exterieurs + ", LuminositeExterieureNord=" + LuminositeExterieureNord
				+ ", LuminositeExterieureNordEst=" + LuminositeExterieureNordEst + ", LuminositeExterieureEst="
				+ LuminositeExterieureEst + ", LuminositeExterieureSudEst=" + LuminositeExterieureSudEst
				+ ", LuminositeExterieureSud=" + LuminositeExterieureSud + ", LuminositeExterieureSudOuest="
				+ LuminositeExterieureSudOuest + ", LuminositeExterieureOuest=" + LuminositeExterieureOuest
				+ ", LuminositeExterieureNordOuest=" + LuminositeExterieureNordOuest + ", TemperatureExterieure="
				+ TemperatureExterieure + ", DirectionVent=" + DirectionVent + ", VitesseVent=" + VitesseVent + "]";
	}


	public String getNom_exterieurs() {
		return nom_exterieurs;
	}


	public void setNom_exterieurs(String nom_exterieurs) {
		this.nom_exterieurs = nom_exterieurs;
	}


	public Map<String, Double> getLuminositeExterieureNord() {
		return LuminositeExterieureNord;
	}


	public void setLuminositeExterieureNord(Map<String, Double> luminositeExterieureNord) {
		LuminositeExterieureNord = luminositeExterieureNord;
	}


	public Map<String, Double> getLuminositeExterieureNordEst() {
		return LuminositeExterieureNordEst;
	}


	public void setLuminositeExterieureNordEst(Map<String, Double> luminositeExterieureNordEst) {
		LuminositeExterieureNordEst = luminositeExterieureNordEst;
	}


	public Map<String, Double> getLuminositeExterieureEst() {
		return LuminositeExterieureEst;
	}


	public void setLuminositeExterieureEst(Map<String, Double> luminositeExterieureEst) {
		LuminositeExterieureEst = luminositeExterieureEst;
	}


	public Map<String, Double> getLuminositeExterieureSudEst() {
		return LuminositeExterieureSudEst;
	}


	public void setLuminositeExterieureSudEst(Map<String, Double> luminositeExterieureSudEst) {
		LuminositeExterieureSudEst = luminositeExterieureSudEst;
	}


	public Map<String, Double> getLuminositeExterieureSud() {
		return LuminositeExterieureSud;
	}


	public void setLuminositeExterieureSud(Map<String, Double> luminositeExterieureSud) {
		LuminositeExterieureSud = luminositeExterieureSud;
	}


	public Map<String, Double> getLuminositeExterieureSudOuest() {
		return LuminositeExterieureSudOuest;
	}


	public void setLuminositeExterieureSudOuest(Map<String, Double> luminositeExterieureSudOuest) {
		LuminositeExterieureSudOuest = luminositeExterieureSudOuest;
	}


	public Map<String, Double> getLuminositeExterieureOuest() {
		return LuminositeExterieureOuest;
	}


	public void setLuminositeExterieureOuest(Map<String, Double> luminositeExterieureOuest) {
		LuminositeExterieureOuest = luminositeExterieureOuest;
	}


	public Map<String, Double> getLuminositeExterieureNordOuest() {
		return LuminositeExterieureNordOuest;
	}


	public void setLuminositeExterieureNordOuest(Map<String, Double> luminositeExterieureNordOuest) {
		LuminositeExterieureNordOuest = luminositeExterieureNordOuest;
	}


	public Map<String, Double> getTemperatureExterieure() {
		return TemperatureExterieure;
	}


	public void setTemperatureExterieure(Map<String, Double> temperatureExterieure) {
		TemperatureExterieure = temperatureExterieure;
	}


	public Map<String, Double> getDirectionVent() {
		return DirectionVent;
	}


	public void setDirectionVent(Map<String, Double> directionVent) {
		DirectionVent = directionVent;
	}


	public Map<String, Double> getVitesseVent() {
		return VitesseVent;
	}


	public void setVitesseVent(Map<String, Double> vitesseVent) {
		VitesseVent = vitesseVent;
	}
	
	
	
	
}
