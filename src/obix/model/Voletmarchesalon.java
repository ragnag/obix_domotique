package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the voletmarchesalon database table.
 * 
 */
@Entity
@NamedQuery(name="Voletmarchesalon.findAll", query="SELECT v FROM Voletmarchesalon v")
public class Voletmarchesalon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idMarcheSalon;

	private String nomVolet;

	//bi-directional many-to-one association to Valeursvoletmarchesalon
	@OneToMany(mappedBy="voletmarchesalon")
	private List<Valeursvoletmarchesalon> valeursvoletmarchesalons;

	//bi-directional many-to-one association to Salon
	@ManyToOne
	@JoinColumn(name="idSalon")
	private Salon salon;

	public Voletmarchesalon() {
	}

	public int getIdMarcheSalon() {
		return this.idMarcheSalon;
	}

	public void setIdMarcheSalon(int idMarcheSalon) {
		this.idMarcheSalon = idMarcheSalon;
	}

	public String getNomVolet() {
		return this.nomVolet;
	}

	public void setNomVolet(String nomVolet) {
		this.nomVolet = nomVolet;
	}

	public List<Valeursvoletmarchesalon> getValeursvoletmarchesalons() {
		return this.valeursvoletmarchesalons;
	}

	public void setValeursvoletmarchesalons(List<Valeursvoletmarchesalon> valeursvoletmarchesalons) {
		this.valeursvoletmarchesalons = valeursvoletmarchesalons;
	}

	public Valeursvoletmarchesalon addValeursvoletmarchesalon(Valeursvoletmarchesalon valeursvoletmarchesalon) {
		getValeursvoletmarchesalons().add(valeursvoletmarchesalon);
		valeursvoletmarchesalon.setVoletmarchesalon(this);

		return valeursvoletmarchesalon;
	}

	public Valeursvoletmarchesalon removeValeursvoletmarchesalon(Valeursvoletmarchesalon valeursvoletmarchesalon) {
		getValeursvoletmarchesalons().remove(valeursvoletmarchesalon);
		valeursvoletmarchesalon.setVoletmarchesalon(null);

		return valeursvoletmarchesalon;
	}

	public Salon getSalon() {
		return this.salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

}