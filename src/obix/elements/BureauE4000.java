package obix.elements;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class BureauE4000 {

	private String nom_BureauE4000;
	private Map<String, Double> CO2BureauE4000;
	private Map<String, Double> COVBureauE4000;
	private Map<String, Double> TemperatureBureauE4000;
	private Map<String, Double> PM1BureauE4000;
	private Map<String, Double> PM10BureauE4000;
	private Map<String, Double> PM2_5BureauE4000;
	private Map<String, Double> HumiditeBureauE4000;
//	private Map<String, Double> CO2BureauE4000Haut;
//	private Map<String, Double> COVBureauE4000Haut;
//	private Map<String, Double> HumiditeBureauE4000Haut;
//	private Map<String, Double> TemperatureBureauE4000Haut;
//	private Map<String, Double> PM2_5BureauE4000Haut;
//	private Map<String, Double> PM10BureauE4000Haut;
//	private Map<String, Double> PM1BureauE4000Haut;
	
	
	public BureauE4000(String nom_BureauE4000) {
		super();
		this.nom_BureauE4000 = nom_BureauE4000;
		CO2BureauE4000 = new HashMap<String, Double>();
		COVBureauE4000 = new HashMap<String, Double>();
		TemperatureBureauE4000 = new HashMap<String, Double>();
		PM1BureauE4000 = new HashMap<String, Double>();
		PM10BureauE4000 = new HashMap<String, Double>();
		PM2_5BureauE4000 = new HashMap<String, Double>();
		HumiditeBureauE4000 = new HashMap<String, Double>();
//		CO2BureauE4000Haut = new HashMap<String, Double>();
//		COVBureauE4000Haut = new HashMap<String, Double>();
//		HumiditeBureauE4000Haut = new HashMap<String, Double>();
//		TemperatureBureauE4000Haut = new HashMap<String, Double>();
//		PM2_5BureauE4000Haut = new HashMap<String, Double>();
//		PM10BureauE4000Haut = new HashMap<String, Double>();
//		PM1BureauE4000Haut =new HashMap<String, Double>();
	}


	public BureauE4000(String nom_BureauE4000, Map<String, Double> cO2BureauE4000, Map<String, Double> cOVBureauE4000,
			Map<String, Double> temperatureBureauE4000, Map<String, Double> pM1BureauE4000,
			Map<String, Double> pM10BureauE4000, Map<String, Double> pM2_5BureauE4000,
			Map<String, Double> humiditeBureauE4000, Map<String, Double> cO2BureauE4000Haut,
			Map<String, Double> cOVBureauE4000Haut, Map<String, Double> humiditeBureauE4000Haut,
			Map<String, Double> temperatureBureauE4000Haut, Map<String, Double> pM2_5BureauE4000Haut,
			Map<String, Double> pM10BureauE4000Haut, Map<String, Double> pM1BureauE4000Haut) {
		super();
		this.nom_BureauE4000 = nom_BureauE4000;
		CO2BureauE4000 = cO2BureauE4000;
		COVBureauE4000 = cOVBureauE4000;
		TemperatureBureauE4000 = temperatureBureauE4000;
		PM1BureauE4000 = pM1BureauE4000;
		PM10BureauE4000 = pM10BureauE4000;
		PM2_5BureauE4000 = pM2_5BureauE4000;
		HumiditeBureauE4000 = humiditeBureauE4000;
//		CO2BureauE4000Haut = cO2BureauE4000Haut;
//		COVBureauE4000Haut = cOVBureauE4000Haut;
//		HumiditeBureauE4000Haut = humiditeBureauE4000Haut;
//		TemperatureBureauE4000Haut = temperatureBureauE4000Haut;
//		PM2_5BureauE4000Haut = pM2_5BureauE4000Haut;
//		PM10BureauE4000Haut = pM10BureauE4000Haut;
//		PM1BureauE4000Haut = pM1BureauE4000Haut;
	}


	@Override
	public String toString() {
		return "BureauE4000 [nom_BureauE4000=" + nom_BureauE4000 + ", CO2BureauE4000="
				+ ", COVBureauE4000=" + COVBureauE4000 + ", TemperatureBureauE4000=" + TemperatureBureauE4000
				+ ", PM1BureauE4000=" + PM1BureauE4000 + ", PM10BureauE4000=" + PM10BureauE4000 + ", PM2_5BureauE4000="
				+ PM2_5BureauE4000 + ", HumiditeBureauE4000=" + HumiditeBureauE4000 + ", CO2BureauE4000Haut="
			+ ", COVBureauE4000Haut=" + ", HumiditeBureauE4000Haut="
				+ ", TemperatureBureauE4000Haut="
				+ ", PM2_5BureauE4000Haut=" +", PM10BureauE4000Haut=" 
				+ ", PM1BureauE4000Haut=" + "]";
	}


	public String getNom_BureauE4000() {
		return nom_BureauE4000;
	}


	public void setNom_BureauE4000(String nom_BureauE4000) {
		this.nom_BureauE4000 = nom_BureauE4000;
	}


	public Map<String, Double> getCO2BureauE4000() {
		return CO2BureauE4000;
	}


	public void setCO2BureauE4000(Map<String, Double> cO2BureauE4000) {
		CO2BureauE4000 = cO2BureauE4000;
	}


	public Map<String, Double> getCOVBureauE4000() {
		return COVBureauE4000;
	}


	public void setCOVBureauE4000(Map<String, Double> cOVBureauE4000) {
		COVBureauE4000 = cOVBureauE4000;
	}


	public Map<String, Double> getTemperatureBureauE4000() {
		return TemperatureBureauE4000;
	}


	public void setTemperatureBureauE4000(Map<String, Double> temperatureBureauE4000) {
		TemperatureBureauE4000 = temperatureBureauE4000;
	}


	public Map<String, Double> getPM1BureauE4000() {
		return PM1BureauE4000;
	}


	public void setPM1BureauE4000(Map<String, Double> pM1BureauE4000) {
		PM1BureauE4000 = pM1BureauE4000;
	}


	public Map<String, Double> getPM10BureauE4000() {
		return PM10BureauE4000;
	}


	public void setPM10BureauE4000(Map<String, Double> pM10BureauE4000) {
		PM10BureauE4000 = pM10BureauE4000;
	}


	public Map<String, Double> getPM2_5BureauE4000() {
		return PM2_5BureauE4000;
	}


	public void setPM2_5BureauE4000(Map<String, Double> pM2_5BureauE4000) {
		PM2_5BureauE4000 = pM2_5BureauE4000;
	}


	public Map<String, Double> getHumiditeBureauE4000() {
		return HumiditeBureauE4000;
	}


	public void setHumiditeBureauE4000(Map<String, Double> humiditeBureauE4000) {
		HumiditeBureauE4000 = humiditeBureauE4000;
	}


//	public Map<String, Double> getCO2BureauE4000Haut() {
//		return CO2BureauE4000Haut;
//	}
//
//
//	public void setCO2BureauE4000Haut(Map<String, Double> cO2BureauE4000Haut) {
//		CO2BureauE4000Haut = cO2BureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getCOVBureauE4000Haut() {
//		return COVBureauE4000Haut;
//	}
//
//
//	public void setCOVBureauE4000Haut(Map<String, Double> cOVBureauE4000Haut) {
//		COVBureauE4000Haut = cOVBureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getHumiditeBureauE4000Haut() {
//		return HumiditeBureauE4000Haut;
//	}
//
//
//	public void setHumiditeBureauE4000Haut(Map<String, Double> humiditeBureauE4000Haut) {
//		HumiditeBureauE4000Haut = humiditeBureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getTemperatureBureauE4000Haut() {
//		return TemperatureBureauE4000Haut;
//	}
//
//
//	public void setTemperatureBureauE4000Haut(Map<String, Double> temperatureBureauE4000Haut) {
//		TemperatureBureauE4000Haut = temperatureBureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getPM2_5BureauE4000Haut() {
//		return PM2_5BureauE4000Haut;
//	}
//
//
//	public void setPM2_5BureauE4000Haut(Map<String, Double> pM2_5BureauE4000Haut) {
//		PM2_5BureauE4000Haut = pM2_5BureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getPM10BureauE4000Haut() {
//		return PM10BureauE4000Haut;
//	}
//
//
//	public void setPM10BureauE4000Haut(Map<String, Double> pM10BureauE4000Haut) {
//		PM10BureauE4000Haut = pM10BureauE4000Haut;
//	}
//
//
//	public Map<String, Double> getPM1BureauE4000Haut() {
//		return PM1BureauE4000Haut;
//	}
//
//
//	public void setPM1BureauE4000Haut(Map<String, Double> pM1BureauE4000Haut) {
//		PM1BureauE4000Haut = pM1BureauE4000Haut;
//	}
	
	
	
	
	
}
