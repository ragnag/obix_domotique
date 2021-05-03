package obix.elements;

import java.util.HashMap;
import java.util.Map;

public class LaboratoireObix {
	
	private Map<String, BureauObix> list_bureaux;
	private Map<String, CuisineObix> list_cuisines;
	private Map<String, ExterieursObix> llist_exterieus;
	private Map<String, PlancherObix> list_planchers;
	private Map<String, SalleObix> list_salles;
	private Map<String, SalonObix> list_salons;
	private Map<String, TabletteObix> list_tablettes;
	private Map<String, VehiculeElectriqueObix> list_vehicule_electrique;
	private Map<String, FrigoObix> list_frigos;
	private Map<String, BallonObix> list_ballons;
	private Map<String, ConsogeneObix> list_conso_gene;
	private Map<String, BureauE4000> list_bureauE4000;
	
	private String nom_laboratoire;
	
	
	

	public LaboratoireObix(String nom_laboratoire) {
		super();
		this.nom_laboratoire = nom_laboratoire;
		
		//Creation du dictionnaire bureaux 
		list_bureaux = new HashMap<String, BureauObix>();
		//Premier bureau
		BureauObix bureau1 = new BureauObix("Bureau");
		
		//on récupère la valeur contenue dans la méthode getLuminosite de bureau
		//qui ira chercher cette valeur dans le lien obix
		//on lui précise avec le "put" la configuration du lien afin qu'il nous retourne les bonnes valeurs
		
		bureau1.getLuminosite().put("LuminositeBureau", 0.0);
		bureau1.getTemperature().put("TemperatureBureau", 0.0);
		bureau1.getTemperature().put("WagoTemperatureBureau", 0.0);
		bureau1.getEtat_variation_eclairage().put("EtatVariationEclairage1Bureau", Boolean.valueOf(false));
		bureau1.getEtat_variation_eclairage().put("EtatVariationEclairage2Bureau", Boolean.valueOf(false));
		bureau1.getEtat_variation_eclairage().put("EtatVariationEclairage3Bureau", Boolean.valueOf(false));
		bureau1.getEtat_variation_eclairage().put("EtatVariationEclairage4Bureau", Boolean.valueOf(false));
		bureau1.getCo2().put("CO2Bureau", 0.0);
		bureau1.getCmd_montee_descente_volet().put("CmdMonteeDescenteVoletsBureau", "");
		bureau1.getCmd_stop_volets().put("CmdStopVoletsBureau", "");
		bureau1.getCo2_seuils().put("CO2BureauSeuil1_800ppm", 0.0);
		bureau1.getCo2_seuils().put("CO2BureauSeuil2_1000ppm", 0.0);
		bureau1.getCo2_seuils().put("CO2BureauSeuil3_1200ppm", 0.0);
		bureau1.getHumidite_seuils().put("HumiditeBureauSeuil1_50", 0.0);
		bureau1.getHumidite_seuils().put("HumiditeBureauSeuil2_60", 0.0);
		bureau1.getHumidite_seuils().put("HumiditeBureauSeuil3_70", 0.0);
		bureau1.getCmd_pc_bureau().put("CmdPCCBureau", "");
		bureau1.getEtat_pc_bureau().put("EtatPCCBureau", Boolean.valueOf(false));
		bureau1.getEtat_volet().put("EtatVolet1Bureau", Boolean.valueOf(false));
		bureau1.getEtat_volet().put("EtatVolet2Bureau", Boolean.valueOf(false));
		list_bureaux.put("Bureau", bureau1);
		
		//Creation des cuisines		
		list_cuisines =  new HashMap<String, CuisineObix>();
		//PremiÃ¨re cuisine
		CuisineObix cuisine1 = new CuisineObix("Cuisine");
		cuisine1.getCO2Cuisine().put("CO2Cuisine", 0.0);
		cuisine1.getHumiditeCuisine().put("HumiditeCuisine", 0.0);
		cuisine1.getTemperatureCuisine().put("TemperatureCuisine", 0.0);
		list_cuisines.put("Cuisine", cuisine1);
		
		//Creation extÃ©rieurs	
		llist_exterieus =  new HashMap<String, ExterieursObix>();
		ExterieursObix exterieur1 = new ExterieursObix("Exterieurs");
		exterieur1.getDirectionVent().put("DirectionVent",0.0);
		exterieur1.getLuminositeExterieureEst().put("LuminositeExterieureEst",0.0);
		exterieur1.getLuminositeExterieureNord().put("LuminositeExterieureNord",0.0);
		exterieur1.getLuminositeExterieureNordEst().put("LuminositeExterieureNordEst",0.0);
		exterieur1.getLuminositeExterieureNordOuest().put("LuminositeExterieureNordOuest", 0.0);
		exterieur1.getLuminositeExterieureOuest().put("LuminositeExterieureOuest", 0.0);
		exterieur1.getLuminositeExterieureSud().put("LuminositeExterieureSud", 0.0);
		exterieur1.getLuminositeExterieureSudEst().put("LuminositeExterieureSudEst", 0.0);
		exterieur1.getLuminositeExterieureSudOuest().put("LuminositeExterieureSudOuest", 0.0);
		exterieur1.getTemperatureExterieure().put("TemperatureExterieure", 0.0);
		exterieur1.getVitesseVent().put("VitesseVent", 0.0);
		llist_exterieus.put("Exterieurs", exterieur1);
		
		//CrÃ©ation plancher
		list_planchers = new HashMap<String, PlancherObix>();
		PlancherObix planchers = new PlancherObix("Plancher");
		planchers.getWagoTempPlancherChauffantAller().put("WagoTempPlancherChauffantAller", 0.0);
		planchers.getWagoTempPlancherChauffantRetour().put("WagoTempPlancherChauffantRetour", 0.0);
		list_planchers.put("Plancher", planchers);
		
		//Creation frigo
		list_frigos = new HashMap<String, FrigoObix>();
		FrigoObix frigo1 = new FrigoObix("Frigo");
		frigo1.getConsoFrigo().put("ConsoFrigo", 0.0);
		frigo1.getPuissanceFrigo().put("PuissanceFrigo", 0.0);
		list_frigos.put("Frigo", frigo1);	
		
		
		//Creation salle
		list_salles = new HashMap<String, SalleObix>();
		SalleObix salle920 = new SalleObix("Salle");
		salle920.getCO2Salle920().put("CO2Salle920", 0.0);
		salle920.getHumiditeSalle920().put("HumiditeSalle920", 0.0);
		salle920.getTemperatureSalle920().put("TemperatureSalle920", 0.0);
		list_salles.put("Salle", salle920);
		
		//Creation Salon
		list_salons = new HashMap<String, SalonObix>();
		SalonObix salon12 = new SalonObix("Salon");
		salon12.getCmdPCCSalon().put("CmdPCCSalon", "");
		salon12.getEtatPCCSalon().put("EtatPCCSalon", Boolean.valueOf(false));
		salon12.getMarcheArret_salon1().put("marcheArret_salon1", Boolean.valueOf(false));
		salon12.getMarcheArret_salon2().put("marcheArret_salon2", Boolean.valueOf(false));
		list_salons.put("Salon", salon12);
		
		//Ballon
		
		list_ballons = new HashMap<String, BallonObix>();
		BallonObix ballon1 = new BallonObix("Ballon");
		ballon1.getWagoTemperatureBallon().put("WagoTemperatureBallon", 0.0);
		list_ballons.put("Ballon", ballon1);
		
		// Tablette
		list_tablettes = new HashMap<String, TabletteObix>();
		TabletteObix tablette1 = new TabletteObix("Tablette");
		tablette1.getCmdPCCTablette1().put("CmdPCCTablette1", "");
		tablette1.getCmdPCCTablette2().put("CmdPCCTablette2", "");
		tablette1.getCmdPCCTablette3().put("CmdPCCTablette3", "");
		tablette1.getCmdPCCTablette4().put("CmdPCCTablette4","");
		tablette1.getEtatPCCTablette1().put("EtatPCCTablette1", Boolean.valueOf(false));
		tablette1.getEtatPCCTablette2().put("EtatPCCTablette2",Boolean.valueOf(false));
		tablette1.getEtatPCCTablette3().put("EtatPCCTablette3", Boolean.valueOf(false));
		tablette1.getEtatPCCTablette4().put("EtatPCCTablette4", Boolean.valueOf(false));
		list_tablettes.put("Tablette", tablette1);
		
		
		// vÃ©hicule Ã©lectrique
		
		list_vehicule_electrique = new HashMap<String, VehiculeElectriqueObix>();
		VehiculeElectriqueObix VE = new VehiculeElectriqueObix("VehiculeElectrique");
		VE.getConsoInstantaneeBorneVE().put("ConsoInstantaneeBorneVE", 0.0);
		VE.getConsoTotaleBorneVE().put("ConsoTotaleBorneVE", 0.0);
		VE.getCourantBorneVE().put("CourantBorneVE", 0.0);
		VE.getEtatFonctionnementBorneVE().put("EtatFonctionnementBorneVE", 0.0);
		VE.getFrequenceBorneVE().put("FrequenceBorneVE", 0.0);
		VE.getTensionBorne().put("TensionBorne", 0.0);
		list_vehicule_electrique.put("VehiculeElectrique", VE);
		
		
		
		// Conso gene+divers
		
		list_conso_gene = new HashMap<String, ConsogeneObix>();
		ConsogeneObix conso = new ConsogeneObix("Consogene");
//		conso.getConsoAmovible().put("ConsoAmovible", 0.0);
		conso.getConsoEchangeur().put("ConsoEchangeur", 0.0);
		conso.getconsoECL().put("consoECL", 0.0);
		conso.getConsoGeneral().put("ConsoGeneral", 0.0);
		conso.getConsoPAC().put("ConsoPAC", 0.0);
		conso.getConsoPC().put("ConsoPC", 0.0);
//		conso.getPuissanceAmovible().put("PuissanceAmovible", 0.0);
		conso.getWagoPositionVanne3Voies().put("WagoPositionVanne3Voies", 0.0);
		list_conso_gene.put("conso_gene", conso);
		
		
		// Bureau E 4000
		
		
		list_bureauE4000 = new HashMap<String, BureauE4000>();
		BureauE4000 bureauE4000 = new BureauE4000("BureauE4000");
		bureauE4000.getCO2BureauE4000().put("CO2BureauE4000", 0.0);
		//bureauE4000.getCO2BureauE4000Haut().put("CO2BureauE4000Haut", 0.0);
		bureauE4000.getCOVBureauE4000().put("COVBureauE4000", 0.0);
		//bureauE4000.getCOVBureauE4000Haut().put("COVBureauE4000Haut", 0.0);
		bureauE4000.getHumiditeBureauE4000().put("HumiditeBureauE4000", 0.0);
		//bureauE4000.getHumiditeBureauE4000Haut().put("HumiditeBureauE4000Haut", 0.0);
    	bureauE4000.getPM10BureauE4000().put("PM10BureauE4000", 0.0);
    	//bureauE4000.getPM10BureauE4000Haut().put("PM10BureauE4000Haut", 0.0);
		bureauE4000.getPM1BureauE4000().put("PM1BureauE4000", 0.0);
		//bureauE4000.getPM1BureauE4000Haut().put("PM1BureauE4000Haut", 0.0);
		bureauE4000.getPM2_5BureauE4000().put("PM2_5BureauE4000", 0.0);
		//bureauE4000.getPM2_5BureauE4000Haut().put("PM2_5BureauE4000Haut", 0.0);
		bureauE4000.getTemperatureBureauE4000().put("TemperatureBureauE4000", 0.0);
		//bureauE4000.getTemperatureBureauE4000Haut().put("TemperatureBureauE4000Haut", 0.0);
		list_bureauE4000.put("bureauE4000", bureauE4000);
		
	
			
	}
	

	@Override
	public String toString() {
		return "Laboratoire [list_bureaux=" + list_bureaux + ", list_cuisines=" + list_cuisines + ", llist_exterieus="
				+ llist_exterieus + ", list_planchers=" + list_planchers + ", list_salles=" + list_salles
				+ ", list_salons=" + list_salons + ", list_tablettes=" + list_tablettes + ", list_vehicule_electrique="
				+ list_vehicule_electrique + ", list_frigos=" + list_frigos + ", list_ballons=" + list_ballons
				+ ", list_conso_gene=" + list_conso_gene + ", list_bureauE4000=" + list_bureauE4000
				+ ", nom_laboratoire=" + nom_laboratoire + "]";
	}






	public LaboratoireObix(Map<String, BureauObix> list_bureaux, Map<String, CuisineObix> list_cuisines,
			Map<String, ExterieursObix> llist_exterieus, Map<String, PlancherObix> list_planchers,
			Map<String, SalleObix> list_salles, Map<String, SalonObix> list_salons, Map<String, TabletteObix> list_tablettes,
			Map<String, VehiculeElectriqueObix> list_vehicule_electrique, Map<String, FrigoObix> list_frigos,
			Map<String, BallonObix> list_ballons, Map<String, ConsogeneObix> list_conso_gene,
			Map<String, BureauE4000> list_bureauE4000, String nom_laboratoire) {
		super();
		this.list_bureaux = list_bureaux;
		this.list_cuisines = list_cuisines;
		this.llist_exterieus = llist_exterieus;
		this.list_planchers = list_planchers;
		this.list_salles = list_salles;
		this.list_salons = list_salons;
		this.list_tablettes = list_tablettes;
		this.list_vehicule_electrique = list_vehicule_electrique;
		this.list_frigos = list_frigos;
		this.list_ballons = list_ballons;
		this.list_conso_gene = list_conso_gene;
		this.list_bureauE4000 = list_bureauE4000;
		this.nom_laboratoire = nom_laboratoire;
	}





	public Map<String, BureauObix> getList_bureaux() {
		return list_bureaux;
	}

	public void setList_bureaux(Map<String, BureauObix> list_bureaux) {
		this.list_bureaux = list_bureaux;
	}

	public Map<String, CuisineObix> getList_cuisines() {
		return list_cuisines;
	}

	public void setList_cuisines(Map<String, CuisineObix> list_cuisines) {
		this.list_cuisines = list_cuisines;
	}

	public Map<String, ExterieursObix> getLlist_exterieus() {
		return llist_exterieus;
	}

	public void setLlist_exterieus(Map<String, ExterieursObix> llist_exterieus) {
		this.llist_exterieus = llist_exterieus;
	}

	public Map<String, PlancherObix> getList_planchers() {
		return list_planchers;
	}

	public void setList_planchers(Map<String, PlancherObix> list_planchers) {
		this.list_planchers = list_planchers;
	}

	public Map<String, SalleObix> getList_salles() {
		return list_salles;
	}

	public void setList_salles(Map<String, SalleObix> list_salles) {
		this.list_salles = list_salles;
	}

	public Map<String, SalonObix> getList_alons() {
		return list_salons;
	}

	public void setList_alons(Map<String, SalonObix> list_alons) {
		this.list_salons = list_alons;
	}

	public Map<String, TabletteObix> getList_tablettes() {
		return list_tablettes;
	}

	public void setList_tablettes(Map<String, TabletteObix> list_tablettes) {
		this.list_tablettes = list_tablettes;
	}

	public Map<String, VehiculeElectriqueObix> getList_vehicule_electrique() {
		return list_vehicule_electrique;
	}

	public void setList_vehicule_electrique(Map<String, VehiculeElectriqueObix> list_vehicule_electrique) {
		this.list_vehicule_electrique = list_vehicule_electrique;
	}

	public Map<String, FrigoObix> getList_frigos() {
		return list_frigos;
	}

	public void setList_frigos(Map<String, FrigoObix> list_frigos) {
		this.list_frigos = list_frigos;
	}

	public Map<String, BallonObix> getList_ballons() {
		return list_ballons;
	}

	public void setList_ballons(Map<String, BallonObix> list_ballons) {
		this.list_ballons = list_ballons;
	}

	public String getNom_laboratoire() {
		return nom_laboratoire;
	}

	public void setNom_laboratoire(String nom_laboratoire) {
		this.nom_laboratoire = nom_laboratoire;
	}

	public Map<String, SalonObix> getList_salons() {
		return list_salons;
	}

	public void setList_salons(Map<String, SalonObix> list_salons) {
		this.list_salons = list_salons;
	}

	public Map<String, ConsogeneObix> getList_conso_gene() {
		return list_conso_gene;
	}
	public void setList_conso_gene(Map<String, ConsogeneObix> list_conso_gene) {
		this.list_conso_gene = list_conso_gene;
	}





	public Map<String, BureauE4000> getList_bureauE4000() {
		return list_bureauE4000;
	}





	public void setList_bureauE4000(Map<String, BureauE4000> list_bureauE4000) {
		this.list_bureauE4000 = list_bureauE4000;
	}
	

}
