package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bureau database table.
 * 
 */
@Entity
@NamedQuery(name="Bureau.findAll", query="SELECT b FROM Bureau b")
public class Bureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idBureau;

	private String nomBureau;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Commandebureau
	@OneToMany(mappedBy="bureau")
	private List<Commandebureau> commandebureaus;

	//bi-directional many-to-one association to Seuilco2bureau
	@OneToMany(mappedBy="bureau")
	private List<Seuilco2bureau> seuilco2bureaus;

	//bi-directional many-to-one association to Seuilhumiditebureau
	@OneToMany(mappedBy="bureau")
	private List<Seuilhumiditebureau> seuilhumiditebureaus;

	//bi-directional many-to-one association to Typeeclairagebureau
	@OneToMany(mappedBy="bureau")
	private List<Typeeclairagebureau> typeeclairagebureaus;

	//bi-directional many-to-one association to Valeursbureau
	@OneToMany(mappedBy="bureau")
	private List<Valeursbureau> valeursbureaus;

	//bi-directional many-to-one association to Voletbureau
	@OneToMany(mappedBy="bureau")
	private List<Voletbureau> voletbureaus;

	public Bureau() {
	}

	public int getIdBureau() {
		return this.idBureau;
	}

	public void setIdBureau(int idBureau) {
		this.idBureau = idBureau;
	}

	public String getNomBureau() {
		return this.nomBureau;
	}

	public void setNomBureau(String nomBureau) {
		this.nomBureau = nomBureau;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Commandebureau> getCommandebureaus() {
		return this.commandebureaus;
	}

	public void setCommandebureaus(List<Commandebureau> commandebureaus) {
		this.commandebureaus = commandebureaus;
	}

	public Commandebureau addCommandebureaus(Commandebureau commandebureaus) {
		getCommandebureaus().add(commandebureaus);
		commandebureaus.setBureau(this);

		return commandebureaus;
	}

	public Commandebureau removeCommandebureaus(Commandebureau commandebureaus) {
		getCommandebureaus().remove(commandebureaus);
		commandebureaus.setBureau(null);

		return commandebureaus;
	}

	public List<Seuilco2bureau> getSeuilco2bureaus() {
		return this.seuilco2bureaus;
	}

	public void setSeuilco2bureaus(List<Seuilco2bureau> seuilco2bureaus) {
		this.seuilco2bureaus = seuilco2bureaus;
	}

	public Seuilco2bureau addSeuilco2bureaus(Seuilco2bureau seuilco2bureaus) {
		getSeuilco2bureaus().add(seuilco2bureaus);
		seuilco2bureaus.setBureau(this);

		return seuilco2bureaus;
	}

	public Seuilco2bureau removeSeuilco2bureaus(Seuilco2bureau seuilco2bureaus) {
		getSeuilco2bureaus().remove(seuilco2bureaus);
		seuilco2bureaus.setBureau(null);

		return seuilco2bureaus;
	}

	public List<Seuilhumiditebureau> getSeuilhumiditebureaus() {
		return this.seuilhumiditebureaus;
	}

	public void setSeuilhumiditebureaus(List<Seuilhumiditebureau> seuilhumiditebureaus) {
		this.seuilhumiditebureaus = seuilhumiditebureaus;
	}

	public Seuilhumiditebureau addSeuilhumiditebureaus(Seuilhumiditebureau seuilhumiditebureaus) {
		getSeuilhumiditebureaus().add(seuilhumiditebureaus);
		seuilhumiditebureaus.setBureau(this);

		return seuilhumiditebureaus;
	}

	public Seuilhumiditebureau removeSeuilhumiditebureaus(Seuilhumiditebureau seuilhumiditebureaus) {
		getSeuilhumiditebureaus().remove(seuilhumiditebureaus);
		seuilhumiditebureaus.setBureau(null);

		return seuilhumiditebureaus;
	}

	public List<Typeeclairagebureau> getTypeeclairagebureaus() {
		return this.typeeclairagebureaus;
	}

	public void setTypeeclairagebureaus(List<Typeeclairagebureau> typeeclairagebureaus) {
		this.typeeclairagebureaus = typeeclairagebureaus;
	}

	public Typeeclairagebureau addTypeeclairagebureaus(Typeeclairagebureau typeeclairagebureaus) {
		getTypeeclairagebureaus().add(typeeclairagebureaus);
		typeeclairagebureaus.setBureau(this);

		return typeeclairagebureaus;
	}

	public Typeeclairagebureau removeTypeeclairagebureaus(Typeeclairagebureau typeeclairagebureaus) {
		getTypeeclairagebureaus().remove(typeeclairagebureaus);
		typeeclairagebureaus.setBureau(null);

		return typeeclairagebureaus;
	}

	public List<Valeursbureau> getValeursbureaus() {
		return this.valeursbureaus;
	}

	public void setValeursbureaus(List<Valeursbureau> valeursbureaus) {
		this.valeursbureaus = valeursbureaus;
	}

	public Valeursbureau addValeursbureaus(Valeursbureau valeursbureaus) {
		getValeursbureaus().add(valeursbureaus);
		valeursbureaus.setBureau(this);

		return valeursbureaus;
	}

	public Valeursbureau removeValeursbureaus(Valeursbureau valeursbureaus) {
		getValeursbureaus().remove(valeursbureaus);
		valeursbureaus.setBureau(null);

		return valeursbureaus;
	}

	public List<Voletbureau> getVoletbureaus() {
		return this.voletbureaus;
	}

	public void setVoletbureaus(List<Voletbureau> voletbureaus) {
		this.voletbureaus = voletbureaus;
	}

	public Voletbureau addVoletbureaus(Voletbureau voletbureaus) {
		getVoletbureaus().add(voletbureaus);
		voletbureaus.setBureau(this);

		return voletbureaus;
	}

	public Voletbureau removeVoletbureaus(Voletbureau voletbureaus) {
		getVoletbureaus().remove(voletbureaus);
		voletbureaus.setBureau(null);

		return voletbureaus;
	}

	@Override
	public String toString() {
		return "Bureau [idBureau=" + idBureau + ", nomBureau=" + nomBureau + "]";
	}
	
	

}