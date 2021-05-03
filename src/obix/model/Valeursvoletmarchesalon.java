package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursvoletmarchesalon database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursvoletmarchesalon.findAll", query="SELECT v FROM Valeursvoletmarchesalon v")
public class Valeursvoletmarchesalon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursVoletMarcheSalon;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private byte etat;

	//bi-directional many-to-one association to Voletmarchesalon
	@ManyToOne
	@JoinColumn(name="idMarcheSalon")
	private Voletmarchesalon voletmarchesalon;

	public Valeursvoletmarchesalon() {
	}

	public int getIdValeursVoletMarcheSalon() {
		return this.idValeursVoletMarcheSalon;
	}

	public void setIdValeursVoletMarcheSalon(int idValeursVoletMarcheSalon) {
		this.idValeursVoletMarcheSalon = idValeursVoletMarcheSalon;
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

	public Voletmarchesalon getVoletmarchesalon() {
		return this.voletmarchesalon;
	}

	public void setVoletmarchesalon(Voletmarchesalon voletmarchesalon) {
		this.voletmarchesalon = voletmarchesalon;
	}

}