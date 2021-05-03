package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeurscuisine database table.
 * 
 */
@Entity
@NamedQuery(name="Valeurscuisine.findAll", query="SELECT v FROM Valeurscuisine v")
public class Valeurscuisine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursCuisine;

	private double co2Cuisine;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double humiditeCuisine;

	//bi-directional many-to-one association to Cuisine
	@ManyToOne
	@JoinColumn(name="idCuisine")
	private Cuisine cuisine;

	public Valeurscuisine() {
	}

	public int getIdValeursCuisine() {
		return this.idValeursCuisine;
	}

	public void setIdValeursCuisine(int idValeursCuisine) {
		this.idValeursCuisine = idValeursCuisine;
	}

	public double getCo2Cuisine() {
		return this.co2Cuisine;
	}

	public void setCo2Cuisine(double co2Cuisine) {
		this.co2Cuisine = co2Cuisine;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getHumiditeCuisine() {
		return this.humiditeCuisine;
	}

	public void setHumiditeCuisine(double humiditeCuisine) {
		this.humiditeCuisine = humiditeCuisine;
	}

	public Cuisine getCuisine() {
		return this.cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}

}