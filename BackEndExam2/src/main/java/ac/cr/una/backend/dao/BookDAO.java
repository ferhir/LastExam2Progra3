package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface BookDAO {

    public boolean deleteAll();

    public Book save(Book book);

    public List<Book> findAll();

}
