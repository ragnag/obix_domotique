package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeurssalon database table.
 * 
 */
@Entity
@NamedQuery(name="Valeurssalon.findAll", query="SELECT v FROM Valeurssalon v")
public class Valeurssalon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursSalon;

	private String cmdPCSalon;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private byte etatPCSalon;

	//bi-directional many-to-one association to Salon
	@ManyToOne
	@JoinColumn(name="idSalon")
	private Salon salon;

	public Valeurssalon() {
	}

	public int getIdValeursSalon() {
		return this.idValeursSalon;
	}

	public void setIdValeursSalon(int idValeursSalon) {
		this.idValeursSalon = idValeursSalon;
	}

	public String getCmdPCSalon() {
		return this.cmdPCSalon;
	}

	public void setCmdPCSalon(String cmdPCSalon) {
		this.cmdPCSalon = cmdPCSalon;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public byte getEtatPCSalon() {
		return this.etatPCSalon;
	}

	public void setEtatPCSalon(byte etatPCSalon) {
		this.etatPCSalon = etatPCSalon;
	}

	public Salon getSalon() {
		return this.salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

}