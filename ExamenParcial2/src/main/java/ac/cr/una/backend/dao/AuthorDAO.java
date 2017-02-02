
package ac.cr.una.backend.dao;
import ac.cr.una.backend.model.Author;

/**
 *
 * @author ADMIN
 */

public interface AuthorDAO {

    public Author findByName(String name);
    
}
