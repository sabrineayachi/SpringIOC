package spring;

import java.util.List;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class Pays {
	
	int idpays;
	String libelle;
	List<String> paysvoisins;
	
	public int getIdpays() {
		return idpays;
	}
	public void setIdpays(int idpays) {
		this.idpays = idpays;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<String> getPaysvoisins() {
		return paysvoisins;
	}
	public void setPaysvoisins(List<String> paysvoisins) {
		this.paysvoisins = paysvoisins;
	}

}
