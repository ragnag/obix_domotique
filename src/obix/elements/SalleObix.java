package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SalleObix {
   
	private String nom_salle;
	private Map<String, Double> CO2Salle920;
	private Map<String, Double> HumiditeSalle920;
	private Map<String, Double> TemperatureSalle920;
	
	public SalleObix(String nom_salle, Map<String, Double> cO2Salle920, Map<String, Double> humiditeSalle920,
			Map<String, Double> temperatureSalle920) {
		super();
		this.nom_salle = nom_salle;
		CO2Salle920 = cO2Salle920;
		HumiditeSalle920 = humiditeSalle920;
		TemperatureSalle920 = temperatureSalle920;
	}

	public SalleObix(String nom_salle) {
		super();
		this.nom_salle = nom_salle;
		CO2Salle920 = new HashMap<String, Double>();
		HumiditeSalle920 = new HashMap<String, Double>();
		TemperatureSalle920 = new HashMap<String, Double>();
	}

	
	@Override
	public String toString() {
		return "Salle [nom_salle=" + nom_salle + ", CO2Salle920=" + CO2Salle920 + ", HumiditeSalle920="
				+ HumiditeSalle920 + ", TemperatureSalle920=" + TemperatureSalle920 + "]";
	}
	
	

	public String getNom_salle() {
		return nom_salle;
	}

	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}

	public Map<String, Double> getCO2Salle920() {
		return CO2Salle920;
	}

	public void setCO2Salle920(Map<String, Double> cO2Salle920) {
		CO2Salle920 = cO2Salle920;
	}

	public Map<String, Double> getHumiditeSalle920() {
		return HumiditeSalle920;
	}

	public void setHumiditeSalle920(Map<String, Double> humiditeSalle920) {
		HumiditeSalle920 = humiditeSalle920;
	}

	public Map<String, Double> getTemperatureSalle920() {
		return TemperatureSalle920;
	}

	public void setTemperatureSalle920(Map<String, Double> temperatureSalle920) {
		TemperatureSalle920 = temperatureSalle920;
	}
	
	
	
}
