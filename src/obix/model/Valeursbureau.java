package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursbureau database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursbureau.findAll", query="SELECT v FROM Valeursbureau v")
public class Valeursbureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursBureau;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double etatPCBureau;

	private double luminositeBureau;

	private double temperatureBureau;

	private double wagoTemperatureBureau;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	public Valeursbureau() {
	}

	public int getIdValeursBureau() {
		return this.idValeursBureau;
	}

	public void setIdValeursBureau(int idValeursBureau) {
		this.idValeursBureau = idValeursBureau;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getEtatPCBureau() {
		return this.etatPCBureau;
	}

	public void setEtatPCBureau(double etatPCBureau) {
		this.etatPCBureau = etatPCBureau;
	}

	public double getLuminositeBureau() {
		return this.luminositeBureau;
	}

	public void setLuminositeBureau(double luminositeBureau) {
		this.luminositeBureau = luminositeBureau;
	}

	public double getTemperatureBureau() {
		return this.temperatureBureau;
	}

	public void setTemperatureBureau(double temperatureBureau) {
		this.temperatureBureau = temperatureBureau;
	}

	public double getWagoTemperatureBureau() {
		return this.wagoTemperatureBureau;
	}

	public void setWagoTemperatureBureau(double wagoTemperatureBureau) {
		this.wagoTemperatureBureau = wagoTemperatureBureau;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

}