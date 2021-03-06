/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ADMIN
 */
public class AuthorContactDAOImpl implements AuthorContactDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean delete = false;
        List<AuthorContact> authorContactList = new ArrayList<>();
        authorContactList = session.createCriteria(AuthorContact.class).list();
        session.beginTransaction();
        session.delete(authorContactList);
        delete = true;
        session.getTransaction().commit();

        return delete;
    }

    @Override
    public AuthorContact save(AuthorContact authorContact) {
        session.beginTransaction();
        session.save(authorContact);
        session.getTransaction().commit();

        return authorContact;
    }

    @Override
    public List<AuthorContact> findAll() {
        List<AuthorContact> authorList = new ArrayList<>();

        authorList = session.createCriteria(AuthorContact.class).list();

        return authorList;
    }

}
