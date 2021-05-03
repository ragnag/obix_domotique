package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chambre database table.
 * 
 */
@Entity
@NamedQuery(name="Chambre.findAll", query="SELECT c FROM Chambre c")
public class Chambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idChambre;

	private String nomChambre;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeurschambre
	@OneToMany(mappedBy="chambre")
	private List<Valeurschambre> valeurschambres;

	public Chambre() {
	}

	public int getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	public String getNomChambre() {
		return this.nomChambre;
	}

	public void setNomChambre(String nomChambre) {
		this.nomChambre = nomChambre;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeurschambre> getValeurschambres() {
		return this.valeurschambres;
	}

	public void setValeurschambres(List<Valeurschambre> valeurschambres) {
		this.valeurschambres = valeurschambres;
	}

	public Valeurschambre addValeurschambre(Valeurschambre valeurschambre) {
		getValeurschambres().add(valeurschambre);
		valeurschambre.setChambre(this);

		return valeurschambre;
	}

	public Valeurschambre removeValeurschambre(Valeurschambre valeurschambre) {
		getValeurschambres().remove(valeurschambre);
		valeurschambre.setChambre(null);

		return valeurschambre;
	}

}