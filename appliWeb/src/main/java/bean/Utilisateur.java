package bean;

public class Utilisateur {
	private int idUtilisateur;
	private String nom;
	private String pseudo;
	private String password;
	private String mail;
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Utilisateur(String nom, String pseudo, String password, String mail) {
		super();
		this.nom = nom;
		this.pseudo = pseudo;
		this.password = password;
		this.mail = mail;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
