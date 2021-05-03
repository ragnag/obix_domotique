package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursetatvolets database table.
 * 
 */
@Entity
@Table(name="valeursetatvolets")
@NamedQuery(name="Valeursetatvolet.findAll", query="SELECT v FROM Valeursetatvolet v")
public class Valeursetatvolet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursEtatVolets;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private byte etat;

	//bi-directional many-to-one association to Voletbureau
	@ManyToOne
	@JoinColumn(name="idVoletBureau")
	private Voletbureau voletbureau;

	public Valeursetatvolet() {
	}

	public int getIdValeursEtatVolets() {
		return this.idValeursEtatVolets;
	}

	public void setIdValeursEtatVolets(int idValeursEtatVolets) {
		this.idValeursEtatVolets = idValeursEtatVolets;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public byte getEtat() {
		return this.etat;
	}

	public void setEtat(byte etat) {
		this.etat = etat;
	}

	public Voletbureau getVoletbureau() {
		return this.voletbureau;
	}

	public void setVoletbureau(Voletbureau voletbureau) {
		this.voletbureau = voletbureau;
	}

}