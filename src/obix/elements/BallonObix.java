package obix.elements;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class BallonObix {

	private String nom_salle;
	private Map<String, Double> WagoTemperatureBallon;
	
	public BallonObix(String nom_salle, Map<String, Double> wagoTemperatureBallon) {
		super();
		this.nom_salle = nom_salle;
		WagoTemperatureBallon = wagoTemperatureBallon;
	}

	public BallonObix(String nom_salle) {
		super();
		this.nom_salle = nom_salle;
		WagoTemperatureBallon = new HashMap<String, Double>();
	}

	@Override
	public String toString() {
		return "Ballon [nom_salle=" + nom_salle + ", WagoTemperatureBallon=" + WagoTemperatureBallon + "]";
	}

	public String getNom_salle() {
		return nom_salle;
	}

	public void setNom_salle(String nom_salle) {
		this.nom_salle = nom_salle;
	}

	public Map<String, Double> getWagoTemperatureBallon() {
		return WagoTemperatureBallon;
	}

	public void setWagoTemperatureBallon(Map<String, Double> wagoTemperatureBallon) {
		WagoTemperatureBallon = wagoTemperatureBallon;
	}
	
	
	
	
	
}
