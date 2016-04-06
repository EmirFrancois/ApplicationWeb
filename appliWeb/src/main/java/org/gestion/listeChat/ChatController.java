package org.gestion.listeChat;

import bean.Chat;
import org.gestion.listeChat.hibernate.HibernateUtil;
import org.hibernate.Session;

public class ChatController {
	
	public void ajouterChat(String nomFrancais, String nomJaponnais, int niveau,
			String image, String momento, String description){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Chat c = new Chat();
		c.setNomFrancais(nomFrancais);
		c.setNomJaponnais(nomJaponnais);
		c.setNiveau(niveau);
		c.setImage(image);
		c.setMomento(momento);
		c.setDescription(description);
		session.save(c);
		session.getTransaction().commit();
		
	
	}
	
	public void supprimerChat( int idChat){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Chat c = (Chat) session.load(Chat.class, idChat);
		session.delete(c);
		session.getTransaction().commit();
	}

}
