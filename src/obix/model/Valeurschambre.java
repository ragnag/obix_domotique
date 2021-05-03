package obix.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valeurschambre database table.
 * 
 */
@Entity
@NamedQuery(name="Valeurschambre.findAll", query="SELECT v FROM Valeurschambre v")
public class Valeurschambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursChambre;

	private double co2Chambre;

	private double dateEnregistrement;

	private double humiditeChambre;

	private double temperatureChambre;

	//bi-directional many-to-one association to Chambre
	@ManyToOne
	@JoinColumn(name="idChambre")
	private Chambre chambre;

	public Valeurschambre() {
	}

	public int getIdValeursChambre() {
		return this.idValeursChambre;
	}

	public void setIdValeursChambre(int idValeursChambre) {
		this.idValeursChambre = idValeursChambre;
	}

	public double getCo2Chambre() {
		return this.co2Chambre;
	}

	public void setCo2Chambre(double co2Chambre) {
		this.co2Chambre = co2Chambre;
	}

	public double getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(double dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getHumiditeChambre() {
		return this.humiditeChambre;
	}

	public void setHumiditeChambre(double humiditeChambre) {
		this.humiditeChambre = humiditeChambre;
	}

	public double getTemperatureChambre() {
		return this.temperatureChambre;
	}

	public void setTemperatureChambre(double temperatureChambre) {
		this.temperatureChambre = temperatureChambre;
	}

	public Chambre getChambre() {
		return this.chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

}