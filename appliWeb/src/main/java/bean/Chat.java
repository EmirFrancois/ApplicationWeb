package bean;

import java.io.Serializable;

public class Chat implements Serializable {
	
	private int idChat;
	private String nomFrancais;
	private String nomJaponnais;
	private int niveau;
	private String image;
	private String momento;
	private String Description;
	public int getIdChat() {
		return idChat;
	}
	public void setIdChat(int idChat) {
		this.idChat = idChat;
	}
	public String getNomFrancais() {
		return nomFrancais;
	}
	public void setNomFrancais(String nomFrancais) {
		this.nomFrancais = nomFrancais;
	}
	public String getNomJaponnais() {
		return nomJaponnais;
	}
	public void setNomJaponnais(String nomJaponnais) {
		this.nomJaponnais = nomJaponnais;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMomento() {
		return momento;
	}
	public void setMomento(String momento) {
		this.momento = momento;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chat(String nomFrancais, String nomJaponnais, int niveau,
			String image, String momento, String description) {
		super();
		this.nomFrancais = nomFrancais;
		this.nomJaponnais = nomJaponnais;
		this.niveau = niveau;
		this.image = image;
		this.momento = momento;
		Description = description;
	}

}
