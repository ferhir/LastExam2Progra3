/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.model.BookType;

/**
 *
 * @author ADMIN
 */
public class BookTypeImpl implements BookTypeService {

    private BookTypeDAO bookTypeDAO;

    @Override
    public boolean deleteAll() {
        return bookTypeDAO.deleteAll();
    }

    @Override
    public BookType save(BookType bookType) {
        return bookTypeDAO.save(bookType);
    }

    @Override
    public BookType findByName(String name) {
        return bookTypeDAO.findByName(name);
    }

}
