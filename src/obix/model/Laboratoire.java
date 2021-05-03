package obix.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the laboratoire database table.
 * 
 */
@Entity
@NamedQuery(name="Laboratoire.findAll", query="SELECT l FROM Laboratoire l")
public class Laboratoire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idlaboratoire;

	private String nomLaboratoire;

	//bi-directional many-to-one association to Bureau
	@OneToMany(mappedBy="laboratoire")
	private List<Bureau> bureaus;

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="laboratoire")
	private List<Chambre> chambres;

	//bi-directional many-to-one association to Cuisine
	@OneToMany(mappedBy="laboratoire")
	private List<Cuisine> cuisines;

	//bi-directional many-to-one association to Frigo
	@OneToMany(mappedBy="laboratoire")
	private List<Frigo> frigos;

	//bi-directional many-to-one association to Plancher
	@OneToMany(mappedBy="laboratoire")
	private List<Plancher> planchers;

	//bi-directional many-to-one association to Salle
	@OneToMany(mappedBy="laboratoire")
	private List<Salle> salles;

	//bi-directional many-to-one association to Salon
	@OneToMany(mappedBy="laboratoire")
	private List<Salon> salons;

	//bi-directional many-to-one association to Vehiculeelectrique
	@OneToMany(mappedBy="laboratoire")
	private List<Vehiculeelectrique> vehiculeelectriques;

	//bi-directional many-to-one association to Exterieur
	@OneToMany(mappedBy="laboratoire")
	private List<Exterieur> exterieurs;

	public Laboratoire() {
	}

	public int getIdlaboratoire() {
		return this.idlaboratoire;
	}

	public void setIdlaboratoire(int idlaboratoire) {
		this.idlaboratoire = idlaboratoire;
	}

	public String getNomLaboratoire() {
		return this.nomLaboratoire;
	}

	public void setNomLaboratoire(String nomLaboratoire) {
		this.nomLaboratoire = nomLaboratoire;
	}

	public List<Bureau> getBureaus() {
		return this.bureaus;
	}

	public void setBureaus(List<Bureau> bureaus) {
		this.bureaus = bureaus;
	}

	public Bureau addBureaus(Bureau bureaus) {
		getBureaus().add(bureaus);
		bureaus.setLaboratoire(this);

		return bureaus;
	}

	public Bureau removeBureaus(Bureau bureaus) {
		getBureaus().remove(bureaus);
		bureaus.setLaboratoire(null);

		return bureaus;
	}

	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setLaboratoire(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setLaboratoire(null);

		return chambre;
	}

	public List<Cuisine> getCuisines() {
		return this.cuisines;
	}

	public void setCuisines(List<Cuisine> cuisines) {
		this.cuisines = cuisines;
	}

	public Cuisine addCuisine(Cuisine cuisine) {
		getCuisines().add(cuisine);
		cuisine.setLaboratoire(this);

		return cuisine;
	}

	public Cuisine removeCuisine(Cuisine cuisine) {
		getCuisines().remove(cuisine);
		cuisine.setLaboratoire(null);

		return cuisine;
	}

	public List<Frigo> getFrigos() {
		return this.frigos;
	}

	public void setFrigos(List<Frigo> frigos) {
		this.frigos = frigos;
	}

	public Frigo addFrigo(Frigo frigo) {
		getFrigos().add(frigo);
		frigo.setLaboratoire(this);

		return frigo;
	}

	public Frigo removeFrigo(Frigo frigo) {
		getFrigos().remove(frigo);
		frigo.setLaboratoire(null);

		return frigo;
	}

	public List<Plancher> getPlanchers() {
		return this.planchers;
	}

	public void setPlanchers(List<Plancher> planchers) {
		this.planchers = planchers;
	}

	public Plancher addPlancher(Plancher plancher) {
		getPlanchers().add(plancher);
		plancher.setLaboratoire(this);

		return plancher;
	}

	public Plancher removePlancher(Plancher plancher) {
		getPlanchers().remove(plancher);
		plancher.setLaboratoire(null);

		return plancher;
	}

	public List<Salle> getSalles() {
		return this.salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public Salle addSalle(Salle salle) {
		getSalles().add(salle);
		salle.setLaboratoire(this);

		return salle;
	}

	public Salle removeSalle(Salle salle) {
		getSalles().remove(salle);
		salle.setLaboratoire(null);

		return salle;
	}

	public List<Salon> getSalons() {
		return this.salons;
	}

	public void setSalons(List<Salon> salons) {
		this.salons = salons;
	}

	public Salon addSalon(Salon salon) {
		getSalons().add(salon);
		salon.setLaboratoire(this);

		return salon;
	}

	public Salon removeSalon(Salon salon) {
		getSalons().remove(salon);
		salon.setLaboratoire(null);

		return salon;
	}

	public List<Vehiculeelectrique> getVehiculeelectriques() {
		return this.vehiculeelectriques;
	}

	public void setVehiculeelectriques(List<Vehiculeelectrique> vehiculeelectriques) {
		this.vehiculeelectriques = vehiculeelectriques;
	}

	public Vehiculeelectrique addVehiculeelectrique(Vehiculeelectrique vehiculeelectrique) {
		getVehiculeelectriques().add(vehiculeelectrique);
		vehiculeelectrique.setLaboratoire(this);

		return vehiculeelectrique;
	}

	public Vehiculeelectrique removeVehiculeelectrique(Vehiculeelectrique vehiculeelectrique) {
		getVehiculeelectriques().remove(vehiculeelectrique);
		vehiculeelectrique.setLaboratoire(null);

		return vehiculeelectrique;
	}

	public List<Exterieur> getExterieurs() {
		return this.exterieurs;
	}

	public void setExterieurs(List<Exterieur> exterieurs) {
		this.exterieurs = exterieurs;
	}

	public Exterieur addExterieur(Exterieur exterieur) {
		getExterieurs().add(exterieur);
		exterieur.setLaboratoire(this);

		return exterieur;
	}

	public Exterieur removeExterieur(Exterieur exterieur) {
		getExterieurs().remove(exterieur);
		exterieur.setLaboratoire(null);

		return exterieur;
	}

}