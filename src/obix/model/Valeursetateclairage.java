package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursetateclairage database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursetateclairage.findAll", query="SELECT v FROM Valeursetateclairage v")
public class Valeursetateclairage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursEtatEclairage;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double valeurs;

	//bi-directional many-to-one association to Typeeclairagebureau
	@ManyToOne
	@JoinColumn(name="idTypeEclairage")
	private Typeeclairagebureau typeeclairagebureau;

	public Valeursetateclairage() {
	}

	public int getIdValeursEtatEclairage() {
		return this.idValeursEtatEclairage;
	}

	public void setIdValeursEtatEclairage(int idValeursEtatEclairage) {
		this.idValeursEtatEclairage = idValeursEtatEclairage;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getValeurs() {
		return this.valeurs;
	}

	public void setValeurs(double valeurs) {
		this.valeurs = valeurs;
	}

	public Typeeclairagebureau getTypeeclairagebureau() {
		return this.typeeclairagebureau;
	}

	public void setTypeeclairagebureau(Typeeclairagebureau typeeclairagebureau) {
		this.typeeclairagebureau = typeeclairagebureau;
	}

}