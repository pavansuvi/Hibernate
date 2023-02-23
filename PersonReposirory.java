//package com.pavan.All.repository;
//
//import java.util.Properties;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.pavan.All.Util.PropertiesUtil;
//import com.pavan.All.entity.Person;
//import com.pavan.All.entity.Restaurant;
//
//public class PersonReposirory {
//	public void savePersonDetailes(Person person) {
//		try {
//			Properties properties = PropertiesUtil.getConnectionProperties();
//			Configuration configuration = new Configuration();
//			configuration.setProperties(properties);
//			configuration.addAnnotatedClass(Restaurant.class);
//			SessionFactory sessionFactory = configuration.buildSessionFactory();
//			Session session = sessionFactory.openSession();
//			Transaction transaction = session.beginTransaction();
//			session.save(person);
//			transaction.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
//
//
