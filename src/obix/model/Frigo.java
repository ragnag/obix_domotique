package obix.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the frigo database table.
 * 
 */
@Entity
@NamedQuery(name="Frigo.findAll", query="SELECT f FROM Frigo f")
public class Frigo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idFrigo;

	private String nomFrigo;

	private double puissanceFrigo;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	public Frigo() {
	}

	public int getIdFrigo() {
		return this.idFrigo;
	}

	public void setIdFrigo(int idFrigo) {
		this.idFrigo = idFrigo;
	}

	public String getNomFrigo() {
		return this.nomFrigo;
	}

	public void setNomFrigo(String nomFrigo) {
		this.nomFrigo = nomFrigo;
	}

	public double getPuissanceFrigo() {
		return this.puissanceFrigo;
	}

	public void setPuissanceFrigo(double puissanceFrigo) {
		this.puissanceFrigo = puissanceFrigo;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

}