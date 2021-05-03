package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SalonObix {
	
	private String nom_salon;
	private Map<String, String> CmdPCCSalon;
	private Map<String, Boolean> EtatPCCSalon;
	private Map<String, Boolean> marcheArret_salon1;
	private Map<String, Boolean> marcheArret_salon2;
	
	public SalonObix(String nom_salon, Map<String, String> cmdPCCSalon, Map<String, Boolean> etatPCCSalon,
			Map<String, Boolean> marcheArret_salon1, Map<String, Boolean> marcheArret_salon2) {
		super();
		this.nom_salon = nom_salon;
		CmdPCCSalon = cmdPCCSalon;
		EtatPCCSalon = etatPCCSalon;
		this.marcheArret_salon1 = marcheArret_salon1;
		this.marcheArret_salon2 = marcheArret_salon2;
	}

	public SalonObix(String nom_salon) {
		super();
		this.nom_salon = nom_salon;
		CmdPCCSalon = new HashMap<String, String>();
		EtatPCCSalon = new HashMap<String, Boolean>();
		this.marcheArret_salon1 = new HashMap<String, Boolean>();
		this.marcheArret_salon2 = new HashMap<String, Boolean>();
	}

	@Override
	public String toString() {
		return "Salon [nom_salon=" + nom_salon + ", CmdPCCSalon=" + CmdPCCSalon + ", EtatPCCSalon=" + EtatPCCSalon
				+ ", marcheArret_salon1=" + marcheArret_salon1 + ", marcheArret_salon2=" + marcheArret_salon2 + "]";
	}

	public String getNom_salon() {
		return nom_salon;
	}

	public void setNom_salon(String nom_salon) {
		this.nom_salon = nom_salon;
	}

	public Map<String, String> getCmdPCCSalon() {
		return CmdPCCSalon;
	}

	public void setCmdPCCSalon(Map<String, String> cmdPCCSalon) {
		CmdPCCSalon = cmdPCCSalon;
	}

	public Map<String, Boolean> getEtatPCCSalon() {
		return EtatPCCSalon;
	}

	public void setEtatPCCSalon(Map<String, Boolean> etatPCCSalon) {
		EtatPCCSalon = etatPCCSalon;
	}

	public Map<String, Boolean> getMarcheArret_salon1() {
		return marcheArret_salon1;
	}

	public void setMarcheArret_salon1(Map<String, Boolean> marcheArret_salon1) {
		this.marcheArret_salon1 = marcheArret_salon1;
	}

	public Map<String, Boolean> getMarcheArret_salon2() {
		return marcheArret_salon2;
	}

	public void setMarcheArret_salon2(Map<String, Boolean> marcheArret_salon2) {
		this.marcheArret_salon2 = marcheArret_salon2;
	}
	
	
	
	
	
	
	

}
