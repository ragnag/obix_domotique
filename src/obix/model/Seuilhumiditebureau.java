package obix.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the seuilhumiditebureau database table.
 * 
 */
@Entity
@NamedQuery(name="Seuilhumiditebureau.findAll", query="SELECT s FROM Seuilhumiditebureau s")
public class Seuilhumiditebureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idHumiditeBureau;

	private String typeHumiditeBureau;

	private double valeurHumiditeBureau;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	public Seuilhumiditebureau() {
	}

	public int getIdHumiditeBureau() {
		return this.idHumiditeBureau;
	}

	public void setIdHumiditeBureau(int idHumiditeBureau) {
		this.idHumiditeBureau = idHumiditeBureau;
	}

	public String getTypeHumiditeBureau() {
		return this.typeHumiditeBureau;
	}

	public void setTypeHumiditeBureau(String typeHumiditeBureau) {
		this.typeHumiditeBureau = typeHumiditeBureau;
	}

	public double getValeurHumiditeBureau() {
		return this.valeurHumiditeBureau;
	}

	public void setValeurHumiditeBureau(double valeurHumiditeBureau) {
		this.valeurHumiditeBureau = valeurHumiditeBureau;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

}