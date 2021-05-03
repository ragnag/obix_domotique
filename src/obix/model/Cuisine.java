package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cuisine database table.
 * 
 */
@Entity
@NamedQuery(name="Cuisine.findAll", query="SELECT c FROM Cuisine c")
public class Cuisine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCuisine;

	private String nomCuisine;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeurscuisine
	@OneToMany(mappedBy="cuisine")
	private List<Valeurscuisine> valeurscuisines;

	public Cuisine() {
	}

	public int getIdCuisine() {
		return this.idCuisine;
	}

	public void setIdCuisine(int idCuisine) {
		this.idCuisine = idCuisine;
	}

	public String getNomCuisine() {
		return this.nomCuisine;
	}

	public void setNomCuisine(String nomCuisine) {
		this.nomCuisine = nomCuisine;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeurscuisine> getValeurscuisines() {
		return this.valeurscuisines;
	}

	public void setValeurscuisines(List<Valeurscuisine> valeurscuisines) {
		this.valeurscuisines = valeurscuisines;
	}

	public Valeurscuisine addValeurscuisine(Valeurscuisine valeurscuisine) {
		getValeurscuisines().add(valeurscuisine);
		valeurscuisine.setCuisine(this);

		return valeurscuisine;
	}

	public Valeurscuisine removeValeurscuisine(Valeurscuisine valeurscuisine) {
		getValeurscuisines().remove(valeurscuisine);
		valeurscuisine.setCuisine(null);

		return valeurscuisine;
	}

}