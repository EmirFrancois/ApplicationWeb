package org.gestion.listeChat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.gestion.listeChat.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import bean.Chat;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping(value = "/rest")
public class HomeController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/chats", method = RequestMethod.GET)
	public List<Chat> home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		Chat chat = new Chat() ;
		chat.setIdChat(1);
		chat.setDescription("sqdsdqsdsq");
		Session session = HibernateUtil.getSessionFactory().openSession() ;
		session.beginTransaction() ;
		Criteria c = session.createCriteria(Chat.class) ;
		@SuppressWarnings("unchecked")
		List<Chat> listeChats = c.list() ;
		session.getTransaction().commit();
		return listeChats;
	}
	
	@RequestMapping(value = "/chats/delete/{idChat}", method = RequestMethod.POST,headers="Accept=application/json")
	public void supprimerChat( @PathVariable int idChat){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Chat c = (Chat) session.load(Chat.class, idChat);
		session.delete(c);
		session.getTransaction().commit();
	}
	@RequestMapping(value = "/chats/update/{idChat}", method = RequestMethod.POST,headers="Accept=application/json")
	public void modifierChat( @PathVariable Chat chat){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Chat c = (Chat) session.load(Chat.class, chat.getIdChat());
		c.setDescription(chat.getDescription());
		c.setImage(chat.getImage());
		c.setMomento(chat.getMomento());
		c.setNiveau(c.getNiveau());
		c.setNomFrancais(chat.getNomFrancais());
		c.setNomJaponnais(chat.getNomJaponnais());
		session.save(c);
		session.getTransaction().commit();
	}
	
	

}
