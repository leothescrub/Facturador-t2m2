package com.Facturador.modelo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public abstract class Mysql {
    
    public static Session getSession() throws HibernateException{
        // Instancia un objeto del tipo Configuration
        Configuration config = new Configuration().configure();
        SessionFactory sessions = config.buildSessionFactory();
        // Retorna una sesion de trabajo
        return config.buildSessionFactory().openSession();
    }
    
    
    
    
 }