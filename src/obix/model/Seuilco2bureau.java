package obix.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the seuilco2bureau database table.
 * 
 */
@Entity
@NamedQuery(name="Seuilco2bureau.findAll", query="SELECT s FROM Seuilco2bureau s")
public class Seuilco2bureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCo2Bureau;

	private String typeSeuilCO2;

	private double valeurSeuilCO2;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	public Seuilco2bureau() {
	}

	public int getIdCo2Bureau() {
		return this.idCo2Bureau;
	}

	public void setIdCo2Bureau(int idCo2Bureau) {
		this.idCo2Bureau = idCo2Bureau;
	}

	public String getTypeSeuilCO2() {
		return this.typeSeuilCO2;
	}

	public void setTypeSeuilCO2(String typeSeuilCO2) {
		this.typeSeuilCO2 = typeSeuilCO2;
	}

	public double getValeurSeuilCO2() {
		return this.valeurSeuilCO2;
	}

	public void setValeurSeuilCO2(double valeurSeuilCO2) {
		this.valeurSeuilCO2 = valeurSeuilCO2;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

}