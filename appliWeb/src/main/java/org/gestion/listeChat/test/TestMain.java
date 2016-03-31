package org.gestion.listeChat.test;

import org.gestion.listeChat.ChatController;
import org.gestion.listeChat.hibernate.HibernateUtil;

public class TestMain {

	public static void main(String[] args) {
		
		ChatController cc = new ChatController();
		cc.ajouterChat("pierre", "lipu", 30, "FF4", "gg2", "cBon");
		HibernateUtil.sessionFactory.close();
		

	}

}
