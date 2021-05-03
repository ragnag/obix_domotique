package obix.elements;

import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class RetreiveInformations {
	
	private LaboratoireObix laboratoire;
	
	
	
	
	public RetreiveInformations() {
		this.laboratoire = new LaboratoireObix("domotique");
	}



// Gere les exceptions pour les valeurs down
	//Cette fonction reçoit en paramètre une chaîne de caractères 
	//qui représente un XML. Et la valeur du tag que l'on veut retourner qui est tag name
	
	public static String getTagValue(String xml, String tagName){
		String valeur_a_retouner = " ";
		try {
			valeur_a_retouner = xml.split(tagName)[1].split("\"")[1] ;
		}
		 catch (java.lang.ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
			 //System.out.println(xml);
			 //e.printStackTrace();
			 return "0";
			}
	    return valeur_a_retouner;
	}
	
	
	
	
	public LaboratoireObix getLaboratoire() {
		return laboratoire;
	}




	public void setLaboratoire(LaboratoireObix laboratoire) {
		this.laboratoire = laboratoire;
	}




	public String getLaboratoryInformations()
	{
		System.out.println("Debut recup");
		getBureauxInformations();
		getCuisinesInformations();
		getExterieursInformations();
		getPlanchersInformations();
		getFrigoInformations();
		getSallesInformations();
		getSalonsInformations();
		getBallonInformations();
		getTabletteInformations();
		getVehiculeElectriqueInformations();
		getConsogeneInformations();
		getBureauE4000Informations();
		System.out.println("Fin recup");
		return null;
		
	}
	
	public String getBureauxInformations()
	{
		//
		for (Map.Entry<String,BureauObix> entry : laboratoire.getList_bureaux().entrySet())
		{
			BureauObix bureau = entry.getValue();
			
			try {
				//Luminosite
				for (Map.Entry<String,Double> entry_luminosite : bureau.getLuminosite().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_luminosite.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_luminosite.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				
				
				
				//Temperature
				for (Map.Entry<String,Double> entry_temperature : bureau.getTemperature().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_temperature.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_temperature.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,String> entry_ : bureau.getCmd_montee_descente_volet().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(String.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,String> entry_ : bureau.getCmd_pc_bureau().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(String.valueOf(getTagValue(value, "val")));
				}
				
				
				//Temperature
				for (Map.Entry<String,String> entry_ : bureau.getCmd_stop_volets().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(String.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,Double> entry_ : bureau.getCo2().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,Double> entry_ : bureau.getCo2_seuils().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,Boolean> entry_ : bureau.getEtat_pc_bureau().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
				}
				
				
				//Temperature
				for (Map.Entry<String,Boolean> entry_ : bureau.getEtat_variation_eclairage().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
				}
				
				
				//Temperature
				for (Map.Entry<String,Boolean> entry_ : bureau.getEtat_volet().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
				}
				
				//Temperature
				for (Map.Entry<String,Double> entry_ : bureau.getHumidite().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				
				for (Map.Entry<String,Double> entry_ : bureau.getHumidite_seuils().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : bureau.getLuminosite().entrySet())
				{
					URL url_luminosite = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_luminosite);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	public String getCuisinesInformations()
	{
		for (Map.Entry<String, CuisineObix> entry : laboratoire.getList_cuisines().entrySet())
		{
			CuisineObix cuisine = entry.getValue();
			
			try {

				for (Map.Entry<String,Double> entry_ : cuisine.getCO2Cuisine().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : cuisine.getHumiditeCuisine().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : cuisine.getTemperatureCuisine().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}			
				
				
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	public String getSallesInformations()
	{
		for (Map.Entry<String, SalleObix> entry : laboratoire.getList_salles().entrySet())
		{
			SalleObix salle = entry.getValue();
			
			try {

				for (Map.Entry<String,Double> entry_ : salle.getCO2Salle920().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : salle.getHumiditeSalle920().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : salle.getTemperatureSalle920().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}			
				
				
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	public String getPlanchersInformations()
	{
		for (Entry<String, PlancherObix> entry : laboratoire.getList_planchers().entrySet())
		{
			PlancherObix planchers1 = entry.getValue();
			
			try {

				for (Map.Entry<String,Double> entry_ : planchers1.getWagoTempPlancherChauffantAller().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : planchers1.getWagoTempPlancherChauffantRetour().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	public String getSalonsInformations()
	{
		for (Entry<String, SalonObix> entry : laboratoire.getList_alons().entrySet())
		{
			SalonObix salon12 = entry.getValue();
		
			try {

			for (Map.Entry<String,String> entry_ : salon12.getCmdPCCSalon().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(String.valueOf(getTagValue(value, "val")));
				}
				
			for (Map.Entry<String,Boolean> entry_ : salon12.getEtatPCCSalon().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
				}
			for (Map.Entry<String,Boolean> entry_ : salon12.getMarcheArret_salon1().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,Boolean> entry_ : salon12.getMarcheArret_salon2().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	

	public String getFrigoInformations ()
	{
		for (Entry<String, FrigoObix> entry : laboratoire.getList_frigos().entrySet())
		{
			FrigoObix frigo1 = entry.getValue();
		
			try {

			for (Map.Entry<String,Double> entry_ : frigo1.getConsoFrigo().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
			for (Map.Entry<String,Double> entry_ : frigo1.getPuissanceFrigo().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	
	public String getVehiculeElectriqueInformations()
	{
		for (Entry<String, VehiculeElectriqueObix> entry : laboratoire.getList_vehicule_electrique().entrySet())
		{
			VehiculeElectriqueObix VE = entry.getValue();
		
			try {

			for (Map.Entry<String,Double> entry_ : VE.getConsoInstantaneeBorneVE().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
			for (Map.Entry<String,Double> entry_ : VE.getConsoTotaleBorneVE().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
			for (Map.Entry<String,Double> entry_ : VE.getCourantBorneVE().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : VE.getEtatFonctionnementBorneVE().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : VE.getFrequenceBorneVE().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : VE.getTensionBorne().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	public String getBallonInformations()
	{
		for (Entry<String, BallonObix> entry : laboratoire.getList_ballons().entrySet())
		{
			BallonObix ballon1 = entry.getValue();
		
			try {

			for (Map.Entry<String,Double> entry_ : ballon1.getWagoTemperatureBallon().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	public String getBureauE4000Informations()
	{
		for (Entry<String, BureauE4000> entry : laboratoire.getList_bureauE4000().entrySet())
		{
			BureauE4000 bureauE40001 = entry.getValue();
		
			try {

			for (Map.Entry<String,Double> entry_ : bureauE40001.getCO2BureauE4000().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getCO2BureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}	
			for (Map.Entry<String,Double> entry_ : bureauE40001.getCOVBureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getCOVBureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			for (Map.Entry<String,Double> entry_ : bureauE40001.getHumiditeBureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getHumiditeBureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM10BureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM10BureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM1BureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM1BureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			
			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM2_5BureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				///System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getPM2_5BureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			for (Map.Entry<String,Double> entry_ : bureauE40001.getTemperatureBureauE4000().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
//			for (Map.Entry<String,Double> entry_ : bureauE40001.getTemperatureBureauE4000Haut().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
//			
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	public String getConsogeneInformations()
	{
		for (Entry<String, ConsogeneObix> entry : laboratoire.getList_conso_gene().entrySet())
		{
			ConsogeneObix consogene1 = entry.getValue();
		
			try {

//			for (Map.Entry<String,Double> entry_ : consogene1.getConsoAmovible().entrySet())
//				{
//					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//					String value = parse_xml(url_);
//					System.out.println(getTagValue(value, "val"));
//					System.out.println(getTagValue(value, "status"));
//					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//				}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getConsoEchangeur().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getconsoECL().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getConsoGeneral().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getConsoPAC().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getConsoPC().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
			
//			for (Map.Entry<String,Double> entry_ : consogene1.getPuissanceAmovible().entrySet())
//			{
//				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
//				String value = parse_xml(url_);
//				System.out.println(getTagValue(value, "val"));
//				System.out.println(getTagValue(value, "status"));
//				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
//			}
			
			for (Map.Entry<String,Double> entry_ : consogene1.getWagoPositionVanne3Voies().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				///System.out.println(getTagValue(value, "status"));
				entry_.setValue(Double.valueOf(getTagValue(value, "val")));
			}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	
	
	
	
	
	
	public String getTabletteInformations()
	{
		for (Entry<String, TabletteObix> entry : laboratoire.getList_tablettes().entrySet())
		{
			TabletteObix tablette1 = entry.getValue();
		
			try {

			for (Map.Entry<String,String> entry_ : tablette1.getCmdPCCTablette1().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(String.valueOf(getTagValue(value, "val")));
				}
			for (Map.Entry<String,String> entry_ : tablette1.getCmdPCCTablette2().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(String.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,String> entry_ : tablette1.getCmdPCCTablette3().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(String.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,String> entry_ : tablette1.getCmdPCCTablette4().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(String.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,Boolean> entry_ : tablette1.getEtatPCCTablette1().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,Boolean> entry_ : tablette1.getEtatPCCTablette2().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,Boolean> entry_ : tablette1.getEtatPCCTablette3().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
			for (Map.Entry<String,Boolean> entry_ : tablette1.getEtatPCCTablette4().entrySet())
			{
				URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
				String value = parse_xml(url_);
				//System.out.println(getTagValue(value, "val"));
				//System.out.println(getTagValue(value, "status"));
				entry_.setValue(Boolean.valueOf(getTagValue(value, "val")));
			}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	
	
	
	
	
	public String getExterieursInformations()
	{
		for (Map.Entry<String, ExterieursObix> entry : laboratoire.getLlist_exterieus().entrySet())
		{
			ExterieursObix exterieur = entry.getValue();
			
			try {

				for (Map.Entry<String,Double> entry_ : exterieur.getDirectionVent().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ : exterieur.getLuminositeExterieureEst().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureNord().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}	
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureNordEst().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}	
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureNordOuest().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}	
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureOuest().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureSud().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureSudEst().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getLuminositeExterieureSudOuest().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getTemperatureExterieure().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
				
				for (Map.Entry<String,Double> entry_ :exterieur.getVitesseVent().entrySet())
				{
					URL url_ = new URL("http://148.60.19.201:8080/obix/automation/all/%24" + entry_.getKey());
					String value = parse_xml(url_);
					//System.out.println(getTagValue(value, "val"));
					//System.out.println(getTagValue(value, "status"));
					entry_.setValue(Double.valueOf(getTagValue(value, "val")));
				}
					
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return null;
		
	}
	// Dans cette partie l'insta,ce de la classe url ouvre la connexion
	//Il utilise document build factory pour parcourir la valeur  retournée par la connexion 
	//a la fin de la fonction on retourne une chaîne de caratère qui représente un Tag xml
	public String parse_xml(URL url)
	{
		URLConnection conn = null;
		try {
			conn = url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = builder.parse(conn.getInputStream());
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		TransformerFactory transformerFactory= TransformerFactory.newInstance();
		Transformer xform = null;
		try {
			xform = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringWriter buf = new StringWriter();
		

		// that’s the default xform; use a stylesheet to get a real one
		try {
			//xform.transform(new DOMSource(doc), new StreamResult(System.out));
			xform.transform(new DOMSource(doc), new StreamResult(buf));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return buf.toString();
	}

}
