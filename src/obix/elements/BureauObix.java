package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BureauObix {
	
	private String nom_bureau;
	
	private Map<String, Double> luminosite;
	private Map<String, Double> temperature;
	private Map<String, Double> co2;
	private Map<String, Double> humidite;
	private Map<String, Double> humidite_seuils;
	private Map<String, Double> co2_seuils;
	private Map<String, Boolean> etat_variation_eclairage;
	private Map<String, String> cmd_montee_descente_volet;
	private Map<String, String> cmd_stop_volets;
	private Map<String, String> cmd_pc_bureau;
	private Map<String, Boolean> etat_pc_bureau;
	private Map<String, Boolean> etat_volet;
	
	
	
	public BureauObix(String nom_bureau) {
		super();
		this.nom_bureau = nom_bureau;
		luminosite = new HashMap<String, Double>();
		temperature = new HashMap<String, Double>();
		co2 = new HashMap<String, Double>();
		humidite = new HashMap<String, Double>();
		humidite_seuils = new HashMap<String, Double>();
		etat_variation_eclairage = new HashMap<String, Boolean>();
		cmd_montee_descente_volet = new HashMap<String, String>();
		cmd_stop_volets = new HashMap<String, String>();
		cmd_pc_bureau = new HashMap<String, String>();
		etat_pc_bureau = new HashMap<String, Boolean>();
		etat_volet = new HashMap<String, Boolean>();
		co2_seuils = new HashMap<String, Double>();
		
	}

	public BureauObix(String nom_bureau, Map<String, Double> eclairage, Map<String, Double> temperature,
			Map<String, Double> co2, Map<String, Double> humidite, Map<String, Double> humidite_seuils,
			Map<String, Double> co2_seuils, Map<String, Boolean> etat_variation_eclairage,
			Map<String, String> cmd_montee_descente_volet, Map<String, String> cmd_stop_volets,
			Map<String, String> cmd_pc_bureau, Map<String, Boolean> etat_pc_bureau, Map<String, Boolean> etat_volet) {
		super();
		this.nom_bureau = nom_bureau;
		this.luminosite = eclairage;
		this.temperature = temperature;
		this.co2 = co2;
		this.humidite = humidite;
		this.humidite_seuils = humidite_seuils;
		this.co2_seuils = co2_seuils;
		this.etat_variation_eclairage = etat_variation_eclairage;
		this.cmd_montee_descente_volet = cmd_montee_descente_volet;
		this.cmd_stop_volets = cmd_stop_volets;
		this.cmd_pc_bureau = cmd_pc_bureau;
		this.etat_pc_bureau = etat_pc_bureau;
		this.etat_volet = etat_volet;
	}
	
	

	@Override
	public String toString() {
		return "Bureau [nom_bureau=" + nom_bureau + ", luminosite=" + luminosite + ", temperature=" + temperature
				+ ", co2=" + co2 + ", humidite=" + humidite + ", humidite_seuils=" + humidite_seuils + ", co2_seuils="
				+ co2_seuils + ", etat_variation_eclairage=" + etat_variation_eclairage + ", cmd_montee_descente_volet="
				+ cmd_montee_descente_volet + ", cmd_stop_volets=" + cmd_stop_volets + ", cmd_pc_bureau="
				+ cmd_pc_bureau + ", etat_pc_bureau=" + etat_pc_bureau + ", etat_volet=" + etat_volet + "]";
	}

	public String getNom_bureau() {
		return nom_bureau;
	}

	public void setNom_bureau(String nom_bureau) {
		this.nom_bureau = nom_bureau;
	}

	

	public Map<String, Double> getLuminosite() {
		return luminosite;
	}

	public void setLuminosite(Map<String, Double> luminosite) {
		this.luminosite = luminosite;
	}

	public Map<String, Double> getTemperature() {
		return temperature;
	}

	public void setTemperature(Map<String, Double> temperature) {
		this.temperature = temperature;
	}

	public Map<String, Double> getCo2() {
		return co2;
	}

	public void setCo2(Map<String, Double> co2) {
		this.co2 = co2;
	}

	public Map<String, Double> getHumidite() {
		return humidite;
	}

	public void setHumidite(Map<String, Double> humidite) {
		this.humidite = humidite;
	}

	public Map<String, Double> getHumidite_seuils() {
		return humidite_seuils;
	}

	public void setHumidite_seuils(Map<String, Double> humidite_seuils) {
		this.humidite_seuils = humidite_seuils;
	}

	public Map<String, Double> getCo2_seuils() {
		return co2_seuils;
	}

	public void setCo2_seuils(Map<String, Double> co2_seuils) {
		this.co2_seuils = co2_seuils;
	}

	public Map<String, Boolean> getEtat_variation_eclairage() {
		return etat_variation_eclairage;
	}

	public void setEtat_variation_eclairage(Map<String, Boolean> etat_variation_eclairage) {
		this.etat_variation_eclairage = etat_variation_eclairage;
	}

	public Map<String, String> getCmd_montee_descente_volet() {
		return cmd_montee_descente_volet;
	}

	public void setCmd_montee_descente_volet(Map<String, String> cmd_montee_descente_volet) {
		this.cmd_montee_descente_volet = cmd_montee_descente_volet;
	}

	public Map<String, String> getCmd_stop_volets() {
		return cmd_stop_volets;
	}

	public void setCmd_stop_volets(Map<String, String> cmd_stop_volets) {
		this.cmd_stop_volets = cmd_stop_volets;
	}

	public Map<String, String> getCmd_pc_bureau() {
		return cmd_pc_bureau;
	}

	public void setCmd_pc_bureau(Map<String, String> cmd_pc_bureau) {
		this.cmd_pc_bureau = cmd_pc_bureau;
	}

	public Map<String, Boolean> getEtat_pc_bureau() {
		return etat_pc_bureau;
	}

	public void setEtat_pc_bureau(Map<String, Boolean> etat_pc_bureau) {
		this.etat_pc_bureau = etat_pc_bureau;
	}

	public Map<String, Boolean> getEtat_volet() {
		return etat_volet;
	}

	public void setEtat_volet(Map<String, Boolean> etat_volet) {
		this.etat_volet = etat_volet;
	}

}
