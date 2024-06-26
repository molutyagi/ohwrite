package com.ohwrite.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {

		if (factory == null) {
			factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		}

		return factory;
	}

	public static void closeFactory() {

		if (factory.isOpen()) {
			factory.close();
		}
	}
}
