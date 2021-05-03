package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vehiculeelectrique database table.
 * 
 */
@Entity
@NamedQuery(name="Vehiculeelectrique.findAll", query="SELECT v FROM Vehiculeelectrique v")
public class Vehiculeelectrique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idVehiculeElectrique;

	private String nomVehculeElectrique;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeursvehiculeelectrique
	@OneToMany(mappedBy="vehiculeelectrique")
	private List<Valeursvehiculeelectrique> valeursvehiculeelectriques;

	public Vehiculeelectrique() {
	}

	public int getIdVehiculeElectrique() {
		return this.idVehiculeElectrique;
	}

	public void setIdVehiculeElectrique(int idVehiculeElectrique) {
		this.idVehiculeElectrique = idVehiculeElectrique;
	}

	public String getNomVehculeElectrique() {
		return this.nomVehculeElectrique;
	}

	public void setNomVehculeElectrique(String nomVehculeElectrique) {
		this.nomVehculeElectrique = nomVehculeElectrique;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeursvehiculeelectrique> getValeursvehiculeelectriques() {
		return this.valeursvehiculeelectriques;
	}

	public void setValeursvehiculeelectriques(List<Valeursvehiculeelectrique> valeursvehiculeelectriques) {
		this.valeursvehiculeelectriques = valeursvehiculeelectriques;
	}

	public Valeursvehiculeelectrique addValeursvehiculeelectrique(Valeursvehiculeelectrique valeursvehiculeelectrique) {
		getValeursvehiculeelectriques().add(valeursvehiculeelectrique);
		valeursvehiculeelectrique.setVehiculeelectrique(this);

		return valeursvehiculeelectrique;
	}

	public Valeursvehiculeelectrique removeValeursvehiculeelectrique(Valeursvehiculeelectrique valeursvehiculeelectrique) {
		getValeursvehiculeelectriques().remove(valeursvehiculeelectrique);
		valeursvehiculeelectrique.setVehiculeelectrique(null);

		return valeursvehiculeelectrique;
	}

}