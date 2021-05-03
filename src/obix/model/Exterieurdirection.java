package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the exterieurdirection database table.
 * 
 */
@Entity
@NamedQuery(name="Exterieurdirection.findAll", query="SELECT e FROM Exterieurdirection e")
public class Exterieurdirection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLuminositeExterieure;

	private String typeLuminosite;

	//bi-directional many-to-one association to Exterieur
	@ManyToOne
	@JoinColumn(name="idExterieure")
	private Exterieur exterieur;

	//bi-directional many-to-one association to Valeursluminosteexterieur
	@OneToMany(mappedBy="exterieurdirection")
	private List<Valeursluminosteexterieur> valeursluminosteexterieurs;

	public Exterieurdirection() {
	}

	public int getIdLuminositeExterieure() {
		return this.idLuminositeExterieure;
	}

	public void setIdLuminositeExterieure(int idLuminositeExterieure) {
		this.idLuminositeExterieure = idLuminositeExterieure;
	}

	public String getTypeLuminosite() {
		return this.typeLuminosite;
	}

	public void setTypeLuminosite(String typeLuminosite) {
		this.typeLuminosite = typeLuminosite;
	}

	public Exterieur getExterieur() {
		return this.exterieur;
	}

	public void setExterieur(Exterieur exterieur) {
		this.exterieur = exterieur;
	}

	public List<Valeursluminosteexterieur> getValeursluminosteexterieurs() {
		return this.valeursluminosteexterieurs;
	}

	public void setValeursluminosteexterieurs(List<Valeursluminosteexterieur> valeursluminosteexterieurs) {
		this.valeursluminosteexterieurs = valeursluminosteexterieurs;
	}

	public Valeursluminosteexterieur addValeursluminosteexterieur(Valeursluminosteexterieur valeursluminosteexterieur) {
		getValeursluminosteexterieurs().add(valeursluminosteexterieur);
		valeursluminosteexterieur.setExterieurdirection(this);

		return valeursluminosteexterieur;
	}

	public Valeursluminosteexterieur removeValeursluminosteexterieur(Valeursluminosteexterieur valeursluminosteexterieur) {
		getValeursluminosteexterieurs().remove(valeursluminosteexterieur);
		valeursluminosteexterieur.setExterieurdirection(null);

		return valeursluminosteexterieur;
	}

}