package com.jlt.hibernate.one2one;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.jlt.hibernate.one2one.entity.Laptop;
import com.jlt.hibernate.one2one.entity.Person;

public class HiberanteUtils {
	
	private static SessionFactory sf;
	
	private static void buildSessionFactory() {
		Configuration confg = new Configuration();
		confg.configure();
		confg.addAnnotatedClass(Person.class);
		confg.addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(confg.getProperties()).build();
		sf = confg.buildSessionFactory(reg);
	}
	
	public static SessionFactory getSessionFactory() {
		if( null  == sf ) {
			synchronized (HiberanteUtils.class) {
				if(null == sf) {
					buildSessionFactory();
				}
			}
		}
		return sf;
	}
}
