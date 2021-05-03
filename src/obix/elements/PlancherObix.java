package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PlancherObix {
   
	private String nom_plancher;
	private Map<String, Double> WagoTempPlancherChauffantAller;
	private Map<String, Double> WagoTempPlancherChauffantRetour;
	
	
	public PlancherObix(String nom_plancher, Map<String, Double> wagoTempPlancherChauffantAller,
			Map<String, Double> wagoTempPlancherChauffantRetour) {
		super();
		this.nom_plancher = nom_plancher;
		WagoTempPlancherChauffantAller = wagoTempPlancherChauffantAller;
		WagoTempPlancherChauffantRetour = wagoTempPlancherChauffantRetour;
	}


	public PlancherObix(String nom_plancher) {
		super();
		this.nom_plancher = nom_plancher;
		WagoTempPlancherChauffantAller = new HashMap<String, Double>();
		WagoTempPlancherChauffantRetour = new HashMap<String, Double>();
	}


	@Override
	public String toString() {
		return "Plancher [nom_plancher=" + nom_plancher + ", WagoTempPlancherChauffantAller="
				+ WagoTempPlancherChauffantAller + ", WagoTempPlancherChauffantRetour="
				+ WagoTempPlancherChauffantRetour + "]";
	}


	public String getNom_plancher() {
		return nom_plancher;
	}


	public void setNom_plancher(String nom_plancher) {
		this.nom_plancher = nom_plancher;
	}


	public Map<String, Double> getWagoTempPlancherChauffantAller() {
		return WagoTempPlancherChauffantAller;
	}


	public void setWagoTempPlancherChauffantAller(Map<String, Double> wagoTempPlancherChauffantAller) {
		WagoTempPlancherChauffantAller = wagoTempPlancherChauffantAller;
	}


	public Map<String, Double> getWagoTempPlancherChauffantRetour() {
		return WagoTempPlancherChauffantRetour;
	}


	public void setWagoTempPlancherChauffantRetour(Map<String, Double> wagoTempPlancherChauffantRetour) {
		WagoTempPlancherChauffantRetour = wagoTempPlancherChauffantRetour;
	}
	
	
	
}
