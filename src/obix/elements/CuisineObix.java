package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CuisineObix {

	private String nom_cuisine;
	private Map<String, Double> CO2Cuisine;
	private Map<String, Double> HumiditeCuisine;
	private Map<String, Double> TemperatureCuisine;
	
	
	public CuisineObix(String nom_cuisine) {
		super();
		this.nom_cuisine = nom_cuisine;
		CO2Cuisine = new HashMap<String, Double>();
		HumiditeCuisine = new HashMap<String, Double>();
		TemperatureCuisine = new HashMap<String, Double>();
	}

	public CuisineObix(String nom_cuisine, Map<String, Double> cO2Cuisine, Map<String, Double> humiditeCuisine,
			Map<String, Double> temperatureCuisine) {
		super();
		this.nom_cuisine = nom_cuisine;
		CO2Cuisine = cO2Cuisine;
		HumiditeCuisine = humiditeCuisine;
		TemperatureCuisine = temperatureCuisine;
	}
	
	@Override
	public String toString() {
		return "Cuisine [nom_cuisine=" + nom_cuisine + ", CO2Cuisine=" + CO2Cuisine + ", HumiditeCuisine="
				+ HumiditeCuisine + ", TemperatureCuisine=" + TemperatureCuisine + "]";
	}

	public String getNom_cuisine() {
		return nom_cuisine;
	}


	public void setNom_cuisine(String nom_cuisine) {
		this.nom_cuisine = nom_cuisine;
	}


	public Map<String, Double> getCO2Cuisine() {
		return CO2Cuisine;
	}


	public void setCO2Cuisine(Map<String, Double> cO2Cuisine) {
		CO2Cuisine = cO2Cuisine;
	}


	public Map<String, Double> getHumiditeCuisine() {
		return HumiditeCuisine;
	}


	public void setHumiditeCuisine(Map<String, Double> humiditeCuisine) {
		HumiditeCuisine = humiditeCuisine;
	}


	public Map<String, Double> getTemperatureCuisine() {
		return TemperatureCuisine;
	}


	public void setTemperatureCuisine(Map<String, Double> temperatureCuisine) {
		TemperatureCuisine = temperatureCuisine;
	}
	
	
	
	
	
}
