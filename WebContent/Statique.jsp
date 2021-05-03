<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="obix.elements.*"%>
<!DOCTYPE html>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Tableau de bord obix</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="public/assets/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="public/assets/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<!-- endinject -->
<!-- Layout styles -->
<link rel="stylesheet" href="public/assets/css/style.css">
<!-- End layout styles -->
<link rel="shortcut icon" href="public/assets/images/favicon.ico" />
</head>
<body>
	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->
		<nav
			class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
			<div
				class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
				<a class="navbar-brand brand-logo" href="index.html"><img
					src="public/assets/images/logo.svg" alt="logo" /></a> <a
					class="navbar-brand brand-logo-mini" href="index.html"><img
					src="public/assets/images/logo-mini.svg" alt="logo" /></a>
			</div>
			<div class="navbar-menu-wrapper d-flex align-items-stretch">
				<button class="navbar-toggler navbar-toggler align-self-center"
					type="button" data-toggle="minimize">
					<span class="mdi mdi-menu"></span>
				</button>
				<div class="search-field d-none d-md-block">
					<form class="d-flex align-items-center h-100" action="#">
						<div class="input-group">
							<div class="input-group-prepend bg-transparent">
								<i class="input-group-text border-0 mdi mdi-magnify"></i>
							</div>
							<input type="text" class="form-control bg-transparent border-0"
								placeholder="Search projects">
						</div>
					</form>
				</div>

				<button
					class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
					type="button" data-toggle="offcanvas">
					<span class="mdi mdi-menu"></span>
				</button>
			</div>
		</nav>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->
			<nav class="sidebar sidebar-offcanvas" id="sidebar">
				<ul class="nav">
					<!--             <li class="nav-item nav-profile"> -->
					<!--               <a href="#" class="nav-link"> -->
					<!--                 <div class="nav-profile-image"> -->
					<!--                   <img src="public/assets/images/faces/face1.jpg" alt="profile"> -->
					<!--                   <span class="login-status online"></span> -->
					<!--                   change to offline or busy as needed -->
					<!--                 </div> -->
					<!--                 <div class="nav-profile-text d-flex flex-column"> -->
					<!--                   <span class="font-weight-bold mb-2">David Grey. H</span> -->
					<!--                   <span class="text-secondary text-small">Project Manager</span> -->
					<!--                 </div> -->
					<!--                 <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i> -->
					<!--               </a> -->
					<!--             </li> -->
					<li class="nav-item"><a class="nav-link" href="#"> <span
							class="menu-title">Tableau de bord</span> <i
							class="mdi mdi-home menu-icon"></i>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="#"> <span
							class="menu-title">Donnée statiques pour <%= request.getAttribute("nomlabo") %>
						</span> <i class="mdi mdi-crosshairs-gps menu-ico"></i>
					</a></li>



				</ul>
			</nav>
			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<!--             <div class="row" id="proBanner"> -->
					<!--               <div class="col-12"> -->
					<!--                 <span class="d-flex align-items-center purchase-popup"> -->
					<!--                   <p>Get tons of UI components, Plugins, multiple layouts, 20+ sample pages, and more!</p> -->
					<!--                   <a href="https://www.bootstrapdash.com/product/purple-bootstrap-admin-template?utm_source=organic&utm_medium=banner&utm_campaign=free-preview" target="_blank" class="btn download-button purchase-button ml-auto">Upgrade To Pro</a> -->
					<!--                   <i class="mdi mdi-close" id="bannerClose"></i> -->
					<!--                 </span> -->
					<!--               </div> -->
					<!--             </div> -->
					<div class="page-header">
						<h3 class="page-title">
							<span class="page-title-icon bg-gradient-primary text-white mr-2">
								<i class="mdi mdi-home"></i>
							</span> Tableau de bord
						</h3>
						<nav aria-label="breadcrumb">
							<ul class="breadcrumb">
								<li class="breadcrumb-item active" aria-current="page"><span></span>Overview
									<i
									class="mdi mdi-alert-circle-outline icon-sm text-primary align-middle"></i>
								</li>
							</ul>
						</nav>
					</div>

					<div class="row">
						<%
						LaboratoireObix laboratoire = (LaboratoireObix)request.getAttribute("infolabo");
						%>

						<%
						for (Map.Entry<String,BureauObix> cle_valeur_bureau : laboratoire.getList_bureaux().entrySet())
											{
						%>


						<pre> Information du bureau  <%=cle_valeur_bureau.getKey()%> </pre>
						
						<%
												BureauObix bureau_here = cle_valeur_bureau.getValue();
												%>
						
						
						
						<% for (Map.Entry<String,Double> cle_valeur_luminosite : bureau_here.getLuminosite().entrySet())
							{
							%>
							
							<pre> 
							Luminosité  :  <%= cle_valeur_luminosite.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						
						<% for (Map.Entry<String,Double> cle_valeur_temperature : bureau_here.getTemperature().entrySet())
							{
							%>
							
							<pre> 
							Temperature  :  <%= cle_valeur_temperature.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_CO2 : bureau_here.getCo2().entrySet())
							{
							%>
							
							<pre> 
							CO2  :  <%= cle_valeur_CO2.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,Double> cle_valeur_humidite : bureau_here.getHumidite().entrySet())
							{
							%>
							
							<pre> 
							Humidite  :  <%= cle_valeur_humidite.getValue().doubleValue() %>
							</pre>
							
							<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_humidite_seuils : bureau_here.getHumidite_seuils().entrySet())
							{
							%>
							
							<pre> 
							 <%= cle_valeur_humidite_seuils.getKey() %>  :  <%= cle_valeur_humidite_seuils.getValue().doubleValue() %>
							</pre>
							
							<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_co2_seuils : bureau_here.getCo2_seuils().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_co2_seuils.getKey() %> :  <%= cle_valeur_co2_seuils.getValue().doubleValue() %>
							</pre>
							
							<%}%>
							<% for (Map.Entry<String,Boolean> cle_valeur_etat_variation_eclairage : bureau_here.getEtat_variation_eclairage().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_etat_variation_eclairage.getKey() %> :  <%= cle_valeur_etat_variation_eclairage.getValue().booleanValue() %>
							</pre>
							
							<%}%>
							<% for (Map.Entry<String,String> cle_valeur_cmd_montee_descente_volet : bureau_here.getCmd_montee_descente_volet().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_cmd_montee_descente_volet.getKey() %> :  <%= cle_valeur_cmd_montee_descente_volet.getValue() %>
							</pre>
							
							<%}%>
							<% for (Map.Entry<String,String> cle_valeur_cmd_stop_volets : bureau_here.getCmd_stop_volets().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_cmd_stop_volets.getKey() %> :  <%= cle_valeur_cmd_stop_volets.getValue() %>
							</pre>
							
							<%}%>
							
							<% for (Map.Entry<String,String> cle_valeur_cmd_pc_bureau : bureau_here.getCmd_pc_bureau().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_cmd_pc_bureau.getKey() %> :  <%= cle_valeur_cmd_pc_bureau.getValue() %>
							</pre>
							
							<%}%>
							<% for (Map.Entry<String,Boolean> cle_valeur_etat_pc_bureau : bureau_here.getEtat_pc_bureau().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_etat_pc_bureau.getKey() %> :  <%= cle_valeur_etat_pc_bureau.getValue().booleanValue() %>
							</pre>
							
							<%}%>
							<% for (Map.Entry<String,Boolean> cle_valeur_etat_volet : bureau_here.getEtat_volet().entrySet())
							{
							%>
							
							<pre> 
							<%= cle_valeur_etat_volet.getKey() %> :  <%= cle_valeur_etat_volet.getValue().booleanValue() %>
							</pre>
							
							<%}%>
							
						<%}%>
						
						<%
												for (Map.Entry<String, CuisineObix> cle_valeur_cuisine : laboratoire.getList_cuisines().entrySet())
																	{
												%>
							<pre> Information de la cuisine  <%=cle_valeur_cuisine.getKey()%> </pre>
						
						<%
												CuisineObix cuisine_here = cle_valeur_cuisine.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_CO2Cuisine : cuisine_here.getCO2Cuisine().entrySet())
							{
							%>
							
							<pre> 
							CO2 Cuisine  :  <%= cle_valeur_CO2Cuisine.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_HumiditeCuisine : cuisine_here.getHumiditeCuisine().entrySet())
							{
							%>
							
							<pre> 
							Humidite Cuisine  :  <%= cle_valeur_HumiditeCuisine.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							<% for (Map.Entry<String,Double> cle_valeur_TemperatureCuisine : cuisine_here.getTemperatureCuisine().entrySet())
							{
							%>
							
							<pre> 
							Temperature Cuisine  :  <%= cle_valeur_TemperatureCuisine.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<%}%>
							
						
						
						<%
																									for (Map.Entry<String, ExterieursObix> cle_valeur_Exterieurs : laboratoire.getLlist_exterieus().entrySet())
																														{
																									%>
							<pre> Information de l'extérieur  <%=cle_valeur_Exterieurs.getKey()%> </pre>
						
						<%
												ExterieursObix exterieurs_here = cle_valeur_Exterieurs.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_DirectionVent : exterieurs_here.getDirectionVent().entrySet())
							{
							%>
							
							<pre> 
							Direction Vent  :  <%= cle_valeur_DirectionVent.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_VitesseVent : exterieurs_here.getVitesseVent().entrySet())
							{
							%>
							
							<pre> 
							Vitesse Vent  :  <%= cle_valeur_VitesseVent.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							<% for (Map.Entry<String,Double> cle_valeur_TemperatureExterieure : exterieurs_here.getTemperatureExterieure().entrySet())
							{
							%>
							
							<pre> 
							Temperature Exterieure  :  <%= cle_valeur_TemperatureExterieure.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureNordOuest : exterieurs_here.getLuminositeExterieureNordOuest().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure NordOuest  :  <%= cle_valeur_LuminositeExterieureNordOuest.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureOuest : exterieurs_here.getLuminositeExterieureOuest().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Ouest  :  <%= cle_valeur_LuminositeExterieureOuest.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureSudOuest : exterieurs_here.getLuminositeExterieureSudOuest().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Sud-Ouest :  <%= cle_valeur_LuminositeExterieureSudOuest.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureSud : exterieurs_here.getLuminositeExterieureSud().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Sud :  <%= cle_valeur_LuminositeExterieureSud.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureSudEst : exterieurs_here.getLuminositeExterieureSudEst().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Sud-Est :  <%= cle_valeur_LuminositeExterieureSudEst.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureEst : exterieurs_here.getLuminositeExterieureEst().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Est :  <%= cle_valeur_LuminositeExterieureEst.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureNordEst : exterieurs_here.getLuminositeExterieureNordEst().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Nord-Est :  <%= cle_valeur_LuminositeExterieureNordEst.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,Double> cle_valeur_LuminositeExterieureNord : exterieurs_here.getLuminositeExterieureNord().entrySet())
							{
							%>
							
							<pre> 
							Luminosite Exterieure Nord :  <%= cle_valeur_LuminositeExterieureNord.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						
							<%}%>
							
							
							<%
																					for (Map.Entry<String, PlancherObix> cle_valeur_plancher : laboratoire.getList_planchers().entrySet())
																										{
																					%>
							<pre> Information des planchers  <%=cle_valeur_plancher.getKey()%> </pre>
						
						<%
												PlancherObix planchers_here = cle_valeur_plancher.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_Plancher : planchers_here.getWagoTempPlancherChauffantAller().entrySet())
							{
							%>
							
							<pre> 
							Wago Température Plancher Chauffant Aller  :  <%= cle_valeur_Plancher.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_WagoTempPlancherChauffantRetour : planchers_here.getWagoTempPlancherChauffantRetour().entrySet())
							{
							%>
							
							<pre> 
							Wago Température Plancher Chauffant Retour  :  <%= cle_valeur_WagoTempPlancherChauffantRetour.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							
							
							
							<%}%>
							<%
							for (Map.Entry<String, SalleObix> cle_valeur_salle : laboratoire.getList_salles().entrySet())
												{
							%>
							<pre> Information sur la salle  <%=cle_valeur_salle.getKey()%> </pre>
						
						<%
												SalleObix salle_here = cle_valeur_salle.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_CO2Salle920 : salle_here.getCO2Salle920().entrySet())
							{
							%>
							
							<pre> 
							CO2 Salle 920  :  <%= cle_valeur_CO2Salle920.getValue().doubleValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_HumiditeSalle920 : salle_here.getHumiditeSalle920().entrySet())
							{
							%>
							
							<pre> 
							Humidite Salle 920  :  <%= cle_valeur_HumiditeSalle920.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_TemperatureSalle920 : salle_here.getTemperatureSalle920().entrySet())
							{
							%>
							
							<pre> 
							Temperature Salle 920  :  <%= cle_valeur_TemperatureSalle920.getValue().doubleValue() %>
							</pre>
							
						<%}%>
						
							
							<%}%>
						
							<%
													for (Map.Entry<String, SalonObix> cle_valeur_salon : laboratoire.getList_salons().entrySet())
																		{
													%>
							<pre> Information sur le salon  <%=cle_valeur_salon.getKey()%> </pre>
						
						<%
												SalonObix salon_here = cle_valeur_salon.getValue();
												%>
						
							<% for (Map.Entry<String,String> cle_valeur_CmdPCCSalon : salon_here.getCmdPCCSalon().entrySet())
							{
							%>
							
							<pre> 
							Commande PC Salon  :  <%= cle_valeur_CmdPCCSalon.getValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Boolean> cle_valeur_EtatPCCSalon : salon_here.getEtatPCCSalon().entrySet())
							{
							%>
							
							<pre> 
							Etat PCC Salon :  <%= cle_valeur_EtatPCCSalon.getValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Boolean> cle_valeur_marcheArret_salon1 : salon_here.getMarcheArret_salon1().entrySet())
							{
							%>
							
							<pre> 
							marche Arret salon1  :  <%= cle_valeur_marcheArret_salon1.getValue()%>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,Boolean> cle_valeur_marcheArret_salon2 : salon_here.getMarcheArret_salon2().entrySet())
							{
							%>
							
							<pre> 
							marche Arret salon2  :  <%= cle_valeur_marcheArret_salon2.getValue()%>
							</pre>
							
						<%}%>
							
							<%}%>
							
							
							
							<%
																												for (Map.Entry<String, TabletteObix> cle_valeur_tablette : laboratoire.getList_tablettes().entrySet())
																																	{
																												%>
							<pre> Information sur les tablettes  <%=cle_valeur_tablette.getKey()%> </pre>
						
						<%
												TabletteObix tablette_here = cle_valeur_tablette.getValue();
												%>
						
							<% for (Map.Entry<String,String> cle_valeur_CmdPCCTablette1 : tablette_here.getCmdPCCTablette1().entrySet())
							{
							%>
							
							<pre> 
							Commande PCC Tablette1 :  <%= cle_valeur_CmdPCCTablette1.getValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,String> cle_valeur_CmdPCCTablette2 : tablette_here.getCmdPCCTablette2().entrySet())
							{
							%>
							
							<pre> 
							Commande PCC Tablette2 :  <%= cle_valeur_CmdPCCTablette2.getValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,String> cle_valeur_CmdPCCTablette3 : tablette_here.getCmdPCCTablette3().entrySet())
							{
							%>
							
							<pre> 
							Commande PCC Tablette3 :  <%= cle_valeur_CmdPCCTablette3.getValue()%>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,String> cle_valeur_CmdPCCTablette4 : tablette_here.getCmdPCCTablette4().entrySet())
							{
							%>
							
							<pre> 
							Commande PCC Tablette4  :  <%= cle_valeur_CmdPCCTablette4.getValue()%>
							</pre>
							
						<%}%>
						<%}%>
						
						
							<%
																			for (Map.Entry<String, VehiculeElectriqueObix> cle_valeur_vehicule_electrique : laboratoire.getList_vehicule_electrique().entrySet())
																								{
																			%>
							<pre> Information sur la voiture électrique  <%=cle_valeur_vehicule_electrique.getKey()%> </pre>
						
						<%
												VehiculeElectriqueObix vehicule_electrique_here = cle_valeur_vehicule_electrique.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_CourantBorneVE : vehicule_electrique_here.getCourantBorneVE().entrySet())
							{
							%>
							
							<pre> 
							Courant Borne VE :  <%= cle_valeur_CourantBorneVE.getValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_TensionBorne : vehicule_electrique_here.getTensionBorne().entrySet())
							{
							%>
							
							<pre> 
							Tension Borne :  <%= cle_valeur_TensionBorne.getValue() %>
							</pre>
							
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_ConsoInstantaneeBorneVE : vehicule_electrique_here.getConsoInstantaneeBorneVE().entrySet())
							{
							%>
							
							<pre> 
							Conso Instantanee Borne VE :  <%= cle_valeur_ConsoInstantaneeBorneVE.getValue()%>
							</pre> 
							
						<%}%>
						<% for (Map.Entry<String,Double> cle_valeur_ConsoTotaleBorneVE : vehicule_electrique_here.getConsoTotaleBorneVE().entrySet())
							{
							%>
							
							<pre> 
							Conso Totale Borne VE  :  <%= cle_valeur_ConsoTotaleBorneVE.getValue()%>
							</pre>
							
						<%}%>
							<% for (Map.Entry<String,Double> cle_valeur_EtatFonctionnementBorneVE : vehicule_electrique_here.getEtatFonctionnementBorneVE().entrySet())
							{
							%>
							
							<pre> 
							Etat Fonctionnement Borne VE  :  <%= cle_valeur_EtatFonctionnementBorneVE.getValue()%>
							</pre>
							
						<%}%>
						<% for (Map.Entry<String,Double> cle_valeur_FrequenceBorneVE : vehicule_electrique_here.getFrequenceBorneVE().entrySet())
							{
							%>
							
							<pre> 
							Frequence Borne VE  :  <%= cle_valeur_FrequenceBorneVE.getValue()%>
							</pre>
							
						<%}%>
							
							
							<%}%>
							
							
							
							<%
																												for (Map.Entry<String, FrigoObix> cle_valeur_frigo : laboratoire.getList_frigos().entrySet())
																																	{
																												%>
							<pre> Information sur le frigo  <%=cle_valeur_frigo.getKey()%> </pre>
						
						<%
												FrigoObix frigo_here = cle_valeur_frigo.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_PuissanceFrigo : frigo_here.getPuissanceFrigo().entrySet())
							{
							%>
							
							<pre> 
							Puissance Frigo:  <%= cle_valeur_PuissanceFrigo.getValue() %>
							</pre>
							
						<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_ConsoFrigo : frigo_here.getConsoFrigo().entrySet())
							{
							%>
							
							<pre> 
							Conso Frigo :  <%= cle_valeur_ConsoFrigo.getValue() %>
							</pre>
							
						<%}%>
						
					
							<%}%>
							
							
							<%
																					for (Map.Entry<String, BallonObix> cle_valeur_ballon : laboratoire.getList_ballons().entrySet())
																										{
																					%>
							<pre> Information sur le ballon  <%=cle_valeur_ballon.getKey()%> </pre>
						
						<%
												BallonObix ballon_here = cle_valeur_ballon.getValue();
												%>
						
							<% for (Map.Entry<String,Double> cle_valeur_WagoTemperatureBallon : ballon_here.getWagoTemperatureBallon().entrySet())
							{
							%>
							
							<pre> 
							Wago Température Ballon:  <%= cle_valeur_WagoTemperatureBallon.getValue() %>
							</pre>
						
						<%}%>
						
					
							<%}%>
							
							
							
							
							<%
																																			for (Map.Entry<String, ConsogeneObix> cle_valeur_consogener : laboratoire.getList_conso_gene().entrySet())
																																								{
																																			%>
							<pre> Information sur les consommations générales <%=cle_valeur_consogener.getKey()%> </pre>
						
								<%
														ConsogeneObix consogene_here = cle_valeur_consogener.getValue();
														%>
						
							<% for (Map.Entry<String,Double> cle_valeur_ConsoGeneral : consogene_here.getConsoGeneral().entrySet())
							{
							%>
							
							<pre> 
							Consommation générale:  <%= cle_valeur_ConsoGeneral.getValue() %>
							</pre>
							<%}%>
							<% for (Map.Entry<String,Double> cle_valeur_consoEchangeur : consogene_here.getConsoEchangeur().entrySet())
							{
							%>
							
							<pre> 
							Consommation Echangeur:  <%= cle_valeur_consoEchangeur.getValue() %>
							</pre>
							<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_consoECL : consogene_here.getconsoECL().entrySet())
							{
							%>
							
							<pre> 
							Consommation ECL:  <%= cle_valeur_consoECL.getValue() %>
							</pre>
							
							<% for (Map.Entry<String,Double> cle_valeur_consoPC : consogene_here.getConsoPC().entrySet())
							{
							%>
							
							<pre> 
							 Consommation PC:  <%= cle_valeur_consoPC.getValue() %>
							</pre>
							<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_consoPAC : consogene_here.getConsoPAC().entrySet())
							{
							%>
							
							<pre> 
							 Consommation PAC:  <%= cle_valeur_consoPAC.getValue() %>
							</pre>
							<%}%>
							
							<% for (Map.Entry<String,Double> cle_valeur_wagoPositionVanne3Voies : consogene_here.getWagoPositionVanne3Voies().entrySet())
							{
							%>
							
							<pre> 
							 Wago Position Vanne 3 Voies:  <%= cle_valeur_wagoPositionVanne3Voies.getValue() %>
							</pre>
							<%}%>
							
						
						<%}%>
						
					
							<%}%>
							
							
							
							<% for (Map.Entry<String, BureauE4000> cle_valeur_bureauE4000 : laboratoire.getList_bureauE4000().entrySet())
							{
							%>
							<pre> Information sur le Bureau E4000  <%= cle_valeur_bureauE4000.getKey() %> </pre>
						
						<% BureauE4000 bureauE4000_here = cle_valeur_bureauE4000.getValue();  %>
						
							<% for (Map.Entry<String,Double> cle_valeur_cO2BureauE4000 : bureauE4000_here.getCO2BureauE4000().entrySet())
							{
							%>
							
							<pre> 
							CO2 Bureau E4000:  <%= cle_valeur_cO2BureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_cOVBureauE4000 : bureauE4000_here.getCOVBureauE4000().entrySet())
							{
							%>
							
							<pre> 
							COV Bureau E4000:  <%= cle_valeur_cOVBureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_temperatureBureauE4000 : bureauE4000_here.getTemperatureBureauE4000().entrySet())
							{
							%>
							
							<pre> 
							Temperature Bureau E4000:  <%= cle_valeur_temperatureBureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_pM1BureauE4000 : bureauE4000_here.getPM1BureauE4000().entrySet())
							{
							%>
							
							<pre> 
							PM1 Bureau E4000:  <%= cle_valeur_pM1BureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_pM10BureauE4000 : bureauE4000_here.getPM10BureauE4000().entrySet())
							{
							%>
							
							<pre> 
							PM10 Bureau E4000:  <%= cle_valeur_pM10BureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_pM2_5BureauE4000 : bureauE4000_here.getPM2_5BureauE4000().entrySet())
							{
							%>
							
							<pre> 
							PM25 Bureau E4000:  <%= cle_valeur_pM2_5BureauE4000.getValue() %>
							</pre>
						
						<%}%>
						
						<% for (Map.Entry<String,Double> cle_valeur_humiditeBureauE4000 : bureauE4000_here.getTemperatureBureauE4000().entrySet())
							{
							%>
							
							<pre> 
							Humidite Bureau E4000:  <%= cle_valeur_humiditeBureauE4000.getValue() %>
							</pre>
						
						<%}%>
					
							<%}%>
							
							
							
			</div>



				</div>
				<!-- content-wrapper ends -->
				<!-- partial:partials/_footer.html -->
				<footer class="footer">
					<div class="container-fluid clearfix">
						<span
							class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright
							© bootstrapdash.com 2020</span> <span
							class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">
							Free <a
							href="https://www.bootstrapdash.com/bootstrap-admin-template/"
							target="_blank">Bootstrap admin templates </a> from
							Bootstrapdash.com
						</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="public/assets/vendors/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script src="public/assets/vendors/chart.js/Chart.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="public/assets/js/off-canvas.js"></script>
	<script src="public/assets/js/hoverable-collapse.js"></script>
	<script src="public/assets/js/misc.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page -->
	<script src="public/assets/js/dashboard.js"></script>
	<script src="public/assets/js/todolist.js"></script>
	<!-- End custom js for this page -->
</body>
</html>