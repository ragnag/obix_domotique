package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the plancher database table.
 * 
 */
@Entity
@NamedQuery(name="Plancher.findAll", query="SELECT p FROM Plancher p")
public class Plancher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPlancher;

	private String nomPlancher;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeursplancher
	@OneToMany(mappedBy="plancher")
	private List<Valeursplancher> valeursplanchers;

	public Plancher() {
	}

	public int getIdPlancher() {
		return this.idPlancher;
	}

	public void setIdPlancher(int idPlancher) {
		this.idPlancher = idPlancher;
	}

	public String getNomPlancher() {
		return this.nomPlancher;
	}

	public void setNomPlancher(String nomPlancher) {
		this.nomPlancher = nomPlancher;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeursplancher> getValeursplanchers() {
		return this.valeursplanchers;
	}

	public void setValeursplanchers(List<Valeursplancher> valeursplanchers) {
		this.valeursplanchers = valeursplanchers;
	}

	public Valeursplancher addValeursplancher(Valeursplancher valeursplancher) {
		getValeursplanchers().add(valeursplancher);
		valeursplancher.setPlancher(this);

		return valeursplancher;
	}

	public Valeursplancher removeValeursplancher(Valeursplancher valeursplancher) {
		getValeursplanchers().remove(valeursplancher);
		valeursplancher.setPlancher(null);

		return valeursplancher;
	}

}