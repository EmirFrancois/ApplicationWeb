package bean;

public class Astuce {
	
	private int idAstuce;
	private String chat;
	private String astuce;
	private String posteur_astuce;
	public int getIdAstuce() {
		return idAstuce;
	}
	public void setIdAstuce(int idAstuce) {
		this.idAstuce = idAstuce;
	}
	public String getChat() {
		return chat;
	}
	public void setChat(String chat) {
		this.chat = chat;
	}
	public String getAstuce() {
		return astuce;
	}
	public void setAstuce(String astuce) {
		this.astuce = astuce;
	}
	public String getPosteur_astuce() {
		return posteur_astuce;
	}
	public void setPosteur_astuce(String posteur_astuce) {
		this.posteur_astuce = posteur_astuce;
	}
	public Astuce(String chat, String astuce, String posteur_astuce) {
		super();
		this.chat = chat;
		this.astuce = astuce;
		this.posteur_astuce = posteur_astuce;
	}
	public Astuce() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
