package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the commandebureau database table.
 * 
 */
@Entity
@NamedQuery(name="Commandebureau.findAll", query="SELECT c FROM Commandebureau c")
public class Commandebureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCommandeBureau;

	private String typeCommandeBureau;

	//bi-directional many-to-one association to Bureau
	@ManyToOne
	@JoinColumn(name="idBureau")
	private Bureau bureau;

	//bi-directional many-to-one association to Valeurscommandebureau
	@OneToMany(mappedBy="commandebureau")
	private List<Valeurscommandebureau> valeurscommandebureaus;

	public Commandebureau() {
	}

	public int getIdCommandeBureau() {
		return this.idCommandeBureau;
	}

	public void setIdCommandeBureau(int idCommandeBureau) {
		this.idCommandeBureau = idCommandeBureau;
	}

	public String getTypeCommandeBureau() {
		return this.typeCommandeBureau;
	}

	public void setTypeCommandeBureau(String typeCommandeBureau) {
		this.typeCommandeBureau = typeCommandeBureau;
	}

	public Bureau getBureau() {
		return this.bureau;
	}

	public void setBureau(Bureau bureau) {
		this.bureau = bureau;
	}

	public List<Valeurscommandebureau> getValeurscommandebureaus() {
		return this.valeurscommandebureaus;
	}

	public void setValeurscommandebureaus(List<Valeurscommandebureau> valeurscommandebureaus) {
		this.valeurscommandebureaus = valeurscommandebureaus;
	}

	public Valeurscommandebureau addValeurscommandebureaus(Valeurscommandebureau valeurscommandebureaus) {
		getValeurscommandebureaus().add(valeurscommandebureaus);
		valeurscommandebureaus.setCommandebureau(this);

		return valeurscommandebureaus;
	}

	public Valeurscommandebureau removeValeurscommandebureaus(Valeurscommandebureau valeurscommandebureaus) {
		getValeurscommandebureaus().remove(valeurscommandebureaus);
		valeurscommandebureaus.setCommandebureau(null);

		return valeurscommandebureaus;
	}

}