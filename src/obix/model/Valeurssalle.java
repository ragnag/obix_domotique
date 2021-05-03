package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeurssalle database table.
 * 
 */
@Entity
@NamedQuery(name="Valeurssalle.findAll", query="SELECT v FROM Valeurssalle v")
public class Valeurssalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursSalle;

	@Column(name="co2_salle")
	private double co2Salle;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	private double humiditeSalle;

	private double temperatureSalle;

	//bi-directional many-to-one association to Salle
	@ManyToOne
	@JoinColumn(name="idSalle")
	private Salle salle;

	public Valeurssalle() {
	}

	public int getIdValeursSalle() {
		return this.idValeursSalle;
	}

	public void setIdValeursSalle(int idValeursSalle) {
		this.idValeursSalle = idValeursSalle;
	}

	public double getCo2Salle() {
		return this.co2Salle;
	}

	public void setCo2Salle(double co2Salle) {
		this.co2Salle = co2Salle;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getHumiditeSalle() {
		return this.humiditeSalle;
	}

	public void setHumiditeSalle(double humiditeSalle) {
		this.humiditeSalle = humiditeSalle;
	}

	public double getTemperatureSalle() {
		return this.temperatureSalle;
	}

	public void setTemperatureSalle(double temperatureSalle) {
		this.temperatureSalle = temperatureSalle;
	}

	public Salle getSalle() {
		return this.salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

}