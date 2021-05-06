/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.minisuper.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sample.minisuper.config.HibernateUtil;
import org.sample.minisuper.model.Productos;
import org.sample.minisuper.model.Ventas;

/**
 *
 * @author alberto
 */
public class DAOVentas implements DaoGeneral<Ventas> {

    private Session session;

    @Override
    public boolean guardar(Ventas pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(pojo);
            res = true;
            transaction.commit();
            System.out.print("Guardado");
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
            System.out.print("No se pudo guardar");
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public boolean borrar(Ventas pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }

        return res;
    }

    @Override
    public boolean actualizar(Ventas pojo) {
        boolean res = false;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(pojo);
            res = true;
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            session.close();
        }
        return res;
    }

    @Override
    public Ventas mostrarUno(Ventas pojo) {
        Ventas ventas = new Ventas();
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            ventas = (Ventas) session.createQuery("SELECT pojo FROM Ventas pojo WHERE id_venta = " + pojo.getId_venta()).uniqueResult();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return ventas;
    }

    @Override
    public List<Ventas> mostrarTodos() {
        List<Ventas> List = null;
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("SELECT ventas FROM ventas ventas");
            List = query.list();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            session.close();
        }
        return List;
    }

}
