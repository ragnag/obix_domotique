package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursvehiculeelectrique database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursvehiculeelectrique.findAll", query="SELECT v FROM Valeursvehiculeelectrique v")
public class Valeursvehiculeelectrique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeurVehiculeElectrique;

	private double consoInstantBorneVE;

	private double consoTotalBorneVE;

	private double courantBorneVE;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private byte etatFonctionnementBorneVE;

	private double frequenceBorne;

	private double tensionBorneVE;

	//bi-directional many-to-one association to Vehiculeelectrique
	@ManyToOne
	@JoinColumn(name="idVehiculeElectrique")
	private Vehiculeelectrique vehiculeelectrique;

	public Valeursvehiculeelectrique() {
	}

	public int getIdValeurVehiculeElectrique() {
		return this.idValeurVehiculeElectrique;
	}

	public void setIdValeurVehiculeElectrique(int idValeurVehiculeElectrique) {
		this.idValeurVehiculeElectrique = idValeurVehiculeElectrique;
	}

	public double getConsoInstantBorneVE() {
		return this.consoInstantBorneVE;
	}

	public void setConsoInstantBorneVE(double consoInstantBorneVE) {
		this.consoInstantBorneVE = consoInstantBorneVE;
	}

	public double getConsoTotalBorneVE() {
		return this.consoTotalBorneVE;
	}

	public void setConsoTotalBorneVE(double consoTotalBorneVE) {
		this.consoTotalBorneVE = consoTotalBorneVE;
	}

	public double getCourantBorneVE() {
		return this.courantBorneVE;
	}

	public void setCourantBorneVE(double courantBorneVE) {
		this.courantBorneVE = courantBorneVE;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public byte getEtatFonctionnementBorneVE() {
		return this.etatFonctionnementBorneVE;
	}

	public void setEtatFonctionnementBorneVE(byte etatFonctionnementBorneVE) {
		this.etatFonctionnementBorneVE = etatFonctionnementBorneVE;
	}

	public double getFrequenceBorne() {
		return this.frequenceBorne;
	}

	public void setFrequenceBorne(double frequenceBorne) {
		this.frequenceBorne = frequenceBorne;
	}

	public double getTensionBorneVE() {
		return this.tensionBorneVE;
	}

	public void setTensionBorneVE(double tensionBorneVE) {
		this.tensionBorneVE = tensionBorneVE;
	}

	public Vehiculeelectrique getVehiculeelectrique() {
		return this.vehiculeelectrique;
	}

	public void setVehiculeelectrique(Vehiculeelectrique vehiculeelectrique) {
		this.vehiculeelectrique = vehiculeelectrique;
	}

}