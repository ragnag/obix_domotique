package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the exterieur database table.
 * 
 */
@Entity
@NamedQuery(name="Exterieur.findAll", query="SELECT e FROM Exterieur e")
public class Exterieur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idExterieure;

	private String nomExterieure;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Exterieurdirection
	@OneToMany(mappedBy="exterieur")
	private List<Exterieurdirection> exterieurdirections;

	//bi-directional many-to-one association to Valeursexterieur
	@OneToMany(mappedBy="exterieur")
	private List<Valeursexterieur> valeursexterieurs;

	public Exterieur() {
	}

	public int getIdExterieure() {
		return this.idExterieure;
	}

	public void setIdExterieure(int idExterieure) {
		this.idExterieure = idExterieure;
	}

	public String getNomExterieure() {
		return this.nomExterieure;
	}

	public void setNomExterieure(String nomExterieure) {
		this.nomExterieure = nomExterieure;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Exterieurdirection> getExterieurdirections() {
		return this.exterieurdirections;
	}

	public void setExterieurdirections(List<Exterieurdirection> exterieurdirections) {
		this.exterieurdirections = exterieurdirections;
	}

	public Exterieurdirection addExterieurdirection(Exterieurdirection exterieurdirection) {
		getExterieurdirections().add(exterieurdirection);
		exterieurdirection.setExterieur(this);

		return exterieurdirection;
	}

	public Exterieurdirection removeExterieurdirection(Exterieurdirection exterieurdirection) {
		getExterieurdirections().remove(exterieurdirection);
		exterieurdirection.setExterieur(null);

		return exterieurdirection;
	}

	public List<Valeursexterieur> getValeursexterieurs() {
		return this.valeursexterieurs;
	}

	public void setValeursexterieurs(List<Valeursexterieur> valeursexterieurs) {
		this.valeursexterieurs = valeursexterieurs;
	}

	public Valeursexterieur addValeursexterieur(Valeursexterieur valeursexterieur) {
		getValeursexterieurs().add(valeursexterieur);
		valeursexterieur.setExterieur(this);

		return valeursexterieur;
	}

	public Valeursexterieur removeValeursexterieur(Valeursexterieur valeursexterieur) {
		getValeursexterieurs().remove(valeursexterieur);
		valeursexterieur.setExterieur(null);

		return valeursexterieur;
	}

}