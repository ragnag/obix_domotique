package obix.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valeurscommandebureau database table.
 * 
 */
@Entity
@NamedQuery(name="Valeurscommandebureau.findAll", query="SELECT v FROM Valeurscommandebureau v")
public class Valeurscommandebureau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursCommandeBureau;

	private String dateEnregistrement;

	private double valeur;

	//bi-directional many-to-one association to Commandebureau
	@ManyToOne
	@JoinColumn(name="idCommandeBureau")
	private Commandebureau commandebureau;

	public Valeurscommandebureau() {
	}

	public int getIdValeursCommandeBureau() {
		return this.idValeursCommandeBureau;
	}

	public void setIdValeursCommandeBureau(int idValeursCommandeBureau) {
		this.idValeursCommandeBureau = idValeursCommandeBureau;
	}

	public String getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(String dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getValeur() {
		return this.valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public Commandebureau getCommandebureau() {
		return this.commandebureau;
	}

	public void setCommandebureau(Commandebureau commandebureau) {
		this.commandebureau = commandebureau;
	}

}