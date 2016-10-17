package spring;

/**
 *
 * @author <a href="mailto:sabrinee.ayachi@gmail.com">Sabrine AYACHI</a>
 */
public class Client {

	int code;
	String nom;
	String prenom;
	Pays pays;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
}
