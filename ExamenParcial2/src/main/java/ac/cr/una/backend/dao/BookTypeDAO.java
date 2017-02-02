package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;

/**
 *
 * @author ADMIN
 */
public interface BookTypeDAO {

    public boolean deleteAll();

    public BookType save(BookType bookType);

    public BookType findByName(String name);

}
