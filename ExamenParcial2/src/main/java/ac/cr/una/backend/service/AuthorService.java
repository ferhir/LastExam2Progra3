package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface AuthorService {

    public boolean deleteAll();

    public AuthorContact save(AuthorContact authorContact);

    public List<AuthorContact> findAll();

    public Author findByName(String name);

}
