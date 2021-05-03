package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the salon database table.
 * 
 */
@Entity
@NamedQuery(name="Salon.findAll", query="SELECT s FROM Salon s")
public class Salon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSalon;

	private String nomSalon;

	//bi-directional many-to-one association to Laboratoire
	@ManyToOne
	@JoinColumn(name="idLaboratoire")
	private Laboratoire laboratoire;

	//bi-directional many-to-one association to Valeurssalon
	@OneToMany(mappedBy="salon")
	private List<Valeurssalon> valeurssalons;

	//bi-directional many-to-one association to Voletmarchesalon
	@OneToMany(mappedBy="salon")
	private List<Voletmarchesalon> voletmarchesalons;

	public Salon() {
	}

	public int getIdSalon() {
		return this.idSalon;
	}

	public void setIdSalon(int idSalon) {
		this.idSalon = idSalon;
	}

	public String getNomSalon() {
		return this.nomSalon;
	}

	public void setNomSalon(String nomSalon) {
		this.nomSalon = nomSalon;
	}

	public Laboratoire getLaboratoire() {
		return this.laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Valeurssalon> getValeurssalons() {
		return this.valeurssalons;
	}

	public void setValeurssalons(List<Valeurssalon> valeurssalons) {
		this.valeurssalons = valeurssalons;
	}

	public Valeurssalon addValeurssalon(Valeurssalon valeurssalon) {
		getValeurssalons().add(valeurssalon);
		valeurssalon.setSalon(this);

		return valeurssalon;
	}

	public Valeurssalon removeValeurssalon(Valeurssalon valeurssalon) {
		getValeurssalons().remove(valeurssalon);
		valeurssalon.setSalon(null);

		return valeurssalon;
	}

	public List<Voletmarchesalon> getVoletmarchesalons() {
		return this.voletmarchesalons;
	}

	public void setVoletmarchesalons(List<Voletmarchesalon> voletmarchesalons) {
		this.voletmarchesalons = voletmarchesalons;
	}

	public Voletmarchesalon addVoletmarchesalon(Voletmarchesalon voletmarchesalon) {
		getVoletmarchesalons().add(voletmarchesalon);
		voletmarchesalon.setSalon(this);

		return voletmarchesalon;
	}

	public Voletmarchesalon removeVoletmarchesalon(Voletmarchesalon voletmarchesalon) {
		getVoletmarchesalons().remove(voletmarchesalon);
		voletmarchesalon.setSalon(null);

		return voletmarchesalon;
	}

}