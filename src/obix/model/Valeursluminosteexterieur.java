package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursluminosteexterieur database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursluminosteexterieur.findAll", query="SELECT v FROM Valeursluminosteexterieur v")
public class Valeursluminosteexterieur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursLuminosteExterieur;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double valeur;

	//bi-directional many-to-one association to Exterieurdirection
	@ManyToOne
	@JoinColumn(name="idExterieurDirection")
	private Exterieurdirection exterieurdirection;

	public Valeursluminosteexterieur() {
	}

	public int getIdValeursLuminosteExterieur() {
		return this.idValeursLuminosteExterieur;
	}

	public void setIdValeursLuminosteExterieur(int idValeursLuminosteExterieur) {
		this.idValeursLuminosteExterieur = idValeursLuminosteExterieur;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getValeur() {
		return this.valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Exterieurdirection getExterieurdirection() {
		return this.exterieurdirection;
	}

	public void setExterieurdirection(Exterieurdirection exterieurdirection) {
		this.exterieurdirection = exterieurdirection;
	}

}