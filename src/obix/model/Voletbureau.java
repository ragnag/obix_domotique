package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the voletbureau database table.
 * 
 */
@Entity
@NamedQuery(name="Voletbureau.findAll", query="SELECT v FROM Voletbureau v")
public class Voletbureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEtatVoletBureau;

	private String typeEtatVoletBureau;

	//bi-directional many-to-one association to Valeursetatvolet
	@OneToMany(mappedBy="voletbureau")
	private List<Valeursetatvolet> valeursetatvolets;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	public Voletbureau() {
	}

	public int getIdEtatVoletBureau() {
		return this.idEtatVoletBureau;
	}

	public void setIdEtatVoletBureau(int idEtatVoletBureau) {
		this.idEtatVoletBureau = idEtatVoletBureau;
	}

	public String getTypeEtatVoletBureau() {
		return this.typeEtatVoletBureau;
	}

	public void setTypeEtatVoletBureau(String typeEtatVoletBureau) {
		this.typeEtatVoletBureau = typeEtatVoletBureau;
	}

	public List<Valeursetatvolet> getValeursetatvolets() {
		return this.valeursetatvolets;
	}

	public void setValeursetatvolets(List<Valeursetatvolet> valeursetatvolets) {
		this.valeursetatvolets = valeursetatvolets;
	}

	public Valeursetatvolet addValeursetatvolet(Valeursetatvolet valeursetatvolet) {
		getValeursetatvolets().add(valeursetatvolet);
		valeursetatvolet.setVoletbureau(this);

		return valeursetatvolet;
	}

	public Valeursetatvolet removeValeursetatvolet(Valeursetatvolet valeursetatvolet) {
		getValeursetatvolets().remove(valeursetatvolet);
		valeursetatvolet.setVoletbureau(null);

		return valeursetatvolet;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

}