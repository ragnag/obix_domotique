package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursexterieur database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursexterieur.findAll", query="SELECT v FROM Valeursexterieur v")
public class Valeursexterieur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursExterieur;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double direction;

	private double temperature;

	private double vitesse;

	//bi-directional many-to-one association to Exterieur
	@ManyToOne
	@JoinColumn(name="idExterieur")
	private Exterieur exterieur;

	public Valeursexterieur() {
	}

	public int getIdValeursExterieur() {
		return this.idValeursExterieur;
	}

	public void setIdValeursExterieur(int idValeursExterieur) {
		this.idValeursExterieur = idValeursExterieur;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getDirection() {
		return this.direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getVitesse() {
		return this.vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public Exterieur getExterieur() {
		return this.exterieur;
	}

	public void setExterieur(Exterieur exterieur) {
		this.exterieur = exterieur;
	}

}