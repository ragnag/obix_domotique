package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the typeeclairagebureau database table.
 * 
 */
@Entity
@NamedQuery(name="Typeeclairagebureau.findAll", query="SELECT t FROM Typeeclairagebureau t")
public class Typeeclairagebureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEtatEclairageBureau;

	private String typeEtatEclairage;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	//bi-directional many-to-one association to Valeursetateclairage
	@OneToMany(mappedBy="typeeclairagebureau")
	private List<Valeursetateclairage> valeursetateclairages;

	public Typeeclairagebureau() {
	}

	public int getIdEtatEclairageBureau() {
		return this.idEtatEclairageBureau;
	}

	public void setIdEtatEclairageBureau(int idEtatEclairageBureau) {
		this.idEtatEclairageBureau = idEtatEclairageBureau;
	}

	public String getTypeEtatEclairage() {
		return this.typeEtatEclairage;
	}

	public void setTypeEtatEclairage(String typeEtatEclairage) {
		this.typeEtatEclairage = typeEtatEclairage;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

	public List<Valeursetateclairage> getValeursetateclairages() {
		return this.valeursetateclairages;
	}

	public void setValeursetateclairages(List<Valeursetateclairage> valeursetateclairages) {
		this.valeursetateclairages = valeursetateclairages;
	}

	public Valeursetateclairage addValeursetateclairage(Valeursetateclairage valeursetateclairage) {
		getValeursetateclairages().add(valeursetateclairage);
		valeursetateclairage.setTypeeclairagebureau(this);

		return valeursetateclairage;
	}

	public Valeursetateclairage removeValeursetateclairage(Valeursetateclairage valeursetateclairage) {
		getValeursetateclairages().remove(valeursetateclairage);
		valeursetateclairage.setTypeeclairagebureau(null);

		return valeursetateclairage;
	}

}