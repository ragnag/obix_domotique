package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the salle database table.
 * 
 */
@Entity
@NamedQuery(name="Salle.findAll", query="SELECT s FROM Salle s")
public class Salle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSalle;

	private String nomSalle;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeurssalle
	@OneToMany(mappedBy="salle")
	private List<Valeurssalle> valeurssalles;

	public Salle() {
	}

	public int getIdSalle() {
		return this.idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public String getNomSalle() {
		return this.nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeurssalle> getValeurssalles() {
		return this.valeurssalles;
	}

	public void setValeurssalles(List<Valeurssalle> valeurssalles) {
		this.valeurssalles = valeurssalles;
	}

	public Valeurssalle addValeurssalle(Valeurssalle valeurssalle) {
		getValeurssalles().add(valeurssalle);
		valeurssalle.setSalle(this);

		return valeurssalle;
	}

	public Valeurssalle removeValeurssalle(Valeurssalle valeurssalle) {
		getValeurssalles().remove(valeurssalle);
		valeurssalle.setSalle(null);

		return valeurssalle;
	}

}