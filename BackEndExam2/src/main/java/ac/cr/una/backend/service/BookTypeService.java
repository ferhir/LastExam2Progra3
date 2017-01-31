package ac.cr.una.backend.service;

import ac.cr.una.backend.model.BookType;

/**
 *
 * @author ADMIN
 */
public interface BookTypeService {

    public boolean deleteAll();

    public BookType save(BookType bookType);

    public BookType findByName(String name);

}
