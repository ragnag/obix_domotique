package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the valeursplancher database table.
 * 
 */
@Entity
@NamedQuery(name="Valeursplancher.findAll", query="SELECT v FROM Valeursplancher v")
public class Valeursplancher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idValeursPlancher;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEnregistrement;

	@Column(name="wago_temp_chauf_aller")
	private double wagoTempChaufAller;

	@Column(name="wago_temp_chauf_retour")
	private double wagoTempChaufRetour;

	//bi-directional many-to-one association to Plancher
	@ManyToOne
	@JoinColumn(name="idPlancher")
	private Plancher plancher;

	public Valeursplancher() {
	}

	public int getIdValeursPlancher() {
		return this.idValeursPlancher;
	}

	public void setIdValeursPlancher(int idValeursPlancher) {
		this.idValeursPlancher = idValeursPlancher;
	}

	public Date getDateEnregistrement() {
		return this.dateEnregistrement;
	}

	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}

	public double getWagoTempChaufAller() {
		return this.wagoTempChaufAller;
	}

	public void setWagoTempChaufAller(double wagoTempChaufAller) {
		this.wagoTempChaufAller = wagoTempChaufAller;
	}

	public double getWagoTempChaufRetour() {
		return this.wagoTempChaufRetour;
	}

	public void setWagoTempChaufRetour(double wagoTempChaufRetour) {
		this.wagoTempChaufRetour = wagoTempChaufRetour;
	}

	public Plancher getPlancher() {
		return this.plancher;
	}

	public void setPlancher(Plancher plancher) {
		this.plancher = plancher;
	}

}