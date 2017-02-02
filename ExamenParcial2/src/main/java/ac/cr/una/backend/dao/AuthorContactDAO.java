package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface AuthorContactDAO {

    public boolean deleteAll();

    public AuthorContact save(AuthorContact authorContact);

    public List<AuthorContact> findAll();

}
