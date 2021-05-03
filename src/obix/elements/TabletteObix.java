package obix.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabletteObix {

	
	private String nom_tablette;
	private Map<String, String> CmdPCCTablette1;
	private Map<String, String> CmdPCCTablette2;
	private Map<String, String> CmdPCCTablette3;
	private Map<String, String> CmdPCCTablette4;
	private Map<String, Boolean> EtatPCCTablette1;
	private Map<String, Boolean> EtatPCCTablette2;
	private Map<String, Boolean> EtatPCCTablette3;
	private Map<String, Boolean> EtatPCCTablette4;
	
	
	public TabletteObix(String nom_tablette) {
		super();
		this.nom_tablette = nom_tablette;
		CmdPCCTablette1 = new HashMap<String, String>();
		CmdPCCTablette2 = new HashMap<String, String>();
		CmdPCCTablette3 = new HashMap<String, String>();
		CmdPCCTablette4 = new HashMap<String, String>();
		EtatPCCTablette1 = new HashMap<String, Boolean>();
		EtatPCCTablette2 = new HashMap<String, Boolean>();
		EtatPCCTablette3 = new HashMap<String, Boolean>();
		EtatPCCTablette4 = new HashMap<String, Boolean>();
	}


	public TabletteObix(String nom_tablette, Map<String,String> cmdPCCTablette1, Map<String, String> cmdPCCTablette2,
			Map<String, String> cmdPCCTablette3, Map<String, String> cmdPCCTablette4,
			Map<String, Boolean> etatPCCTablette1, Map<String, Boolean> etatPCCTablette2,
			Map<String, Boolean> etatPCCTablette3, Map<String, Boolean> etatPCCTablette4) {
		super();
		this.nom_tablette = nom_tablette;
		CmdPCCTablette1 = cmdPCCTablette1;
		CmdPCCTablette2 = cmdPCCTablette2;
		CmdPCCTablette3 = cmdPCCTablette3;
		CmdPCCTablette4 = cmdPCCTablette4;
		EtatPCCTablette1 = etatPCCTablette1;
		EtatPCCTablette2 = etatPCCTablette2;
		EtatPCCTablette3 = etatPCCTablette3;
		EtatPCCTablette4 = etatPCCTablette4;
	}


	@Override
	public String toString() {
		return "Tablette [nom_tablette=" + nom_tablette + ", CmdPCCTablette1=" + CmdPCCTablette1 + ", CmdPCCTablette2="
				+ CmdPCCTablette2 + ", CmdPCCTablette3=" + CmdPCCTablette3 + ", CmdPCCTablette4=" + CmdPCCTablette4
				+ ", EtatPCCTablette1=" + EtatPCCTablette1 + ", EtatPCCTablette2=" + EtatPCCTablette2
				+ ", EtatPCCTablette3=" + EtatPCCTablette3 + ", EtatPCCTablette4=" + EtatPCCTablette4 + "]";
	}


	public String getNom_tablette() {
		return nom_tablette;
	}


	public void setNom_tablette(String nom_tablette) {
		this.nom_tablette = nom_tablette;
	}


	public Map<String, String> getCmdPCCTablette1() {
		return CmdPCCTablette1;
	}


	public void setCmdPCCTablette1(Map<String, String> cmdPCCTablette1) {
		CmdPCCTablette1 = cmdPCCTablette1;
	}


	public Map<String, String> getCmdPCCTablette2() {
		return CmdPCCTablette2;
	}


	public void setCmdPCCTablette2(Map<String,String> cmdPCCTablette2) {
		CmdPCCTablette2 = cmdPCCTablette2;
	}


	public Map<String,String> getCmdPCCTablette3() {
		return CmdPCCTablette3;
	}


	public void setCmdPCCTablette3(Map<String, String> cmdPCCTablette3) {
		CmdPCCTablette3 = cmdPCCTablette3;
	}


	public Map<String, String> getCmdPCCTablette4() {
		return CmdPCCTablette4;
	}


	public void setCmdPCCTablette4(Map<String, String> cmdPCCTablette4) {
		CmdPCCTablette4 = cmdPCCTablette4;
	}


	public Map<String, Boolean> getEtatPCCTablette1() {
		return EtatPCCTablette1;
	}


	public void setEtatPCCTablette1(Map<String, Boolean> etatPCCTablette1) {
		EtatPCCTablette1 = etatPCCTablette1;
	}


	public Map<String, Boolean> getEtatPCCTablette2() {
		return EtatPCCTablette2;
	}


	public void setEtatPCCTablette2(Map<String, Boolean> etatPCCTablette2) {
		EtatPCCTablette2 = etatPCCTablette2;
	}


	public Map<String, Boolean> getEtatPCCTablette3() {
		return EtatPCCTablette3;
	}


	public void setEtatPCCTablette3(Map<String, Boolean> etatPCCTablette3) {
		EtatPCCTablette3 = etatPCCTablette3;
	}


	public Map<String, Boolean> getEtatPCCTablette4() {
		return EtatPCCTablette4;
	}


	public void setEtatPCCTablette4(Map<String, Boolean> etatPCCTablette4) {
		EtatPCCTablette4 = etatPCCTablette4;
	}
	
	
	
}
